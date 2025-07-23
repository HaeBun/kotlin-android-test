package com.likelion.liontalk.features.chatroom

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.likelion.liontalk.data.local.entity.ChatMessageEntity
import com.likelion.liontalk.data.remote.dto.ChatMessageDto
import com.likelion.liontalk.data.remote.dto.PresenceMessageDto
import com.likelion.liontalk.data.remote.dto.TypingMessageDto
import com.likelion.liontalk.data.remote.mqtt.MqttClient
import com.likelion.liontalk.data.repository.ChatMessageRepository
import com.likelion.liontalk.data.repository.UserPreferenceRepository
import com.likelion.liontalk.model.ChatUser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ChatRoomViewModel(application: Application, private val roomId: Int) : ViewModel(){
    private val chatMessageRepository = ChatMessageRepository(application)
//    val messages : LiveData<List<ChatMessageEntity>> = chatMessageRepository.getMessagesForRoom(roomId)

    val message: StateFlow<List<ChatMessageEntity>> = chatMessageRepository.getMessagesForRoomFlow(roomId)
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )
    private val userPreferenceRepository = UserPreferenceRepository.getInstance()
    val me : ChatUser get() = userPreferenceRepository.requireMe()


    private val _event = MutableSharedFlow<ChatRoomEvent>()
    val event = _event.asSharedFlow()

    init {
        viewModelScope.launch {

            userPreferenceRepository.loadUserFromStorage()

            withContext(Dispatchers.IO) {
                MqttClient.connect()
            }

            withContext(Dispatchers.IO) {
                subscribeToMqttTopics()
            }

            // 입장 메시지 날리기
            publishEnterStatus()
        }
    }

    // 메세지 전송
    fun sendMessage(sender: String, content: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val dto = ChatMessageDto(
                roomId = roomId,
                sender = me,
                content = content,
                createdAt = System.currentTimeMillis()
            )
            // api send and local insert
            val responseDto = chatMessageRepository.sendMessage(dto)

            // mqtt send
            if (responseDto != null) {
                val json = Gson().toJson(responseDto)
                MqttClient.publish("liontalk/rooms/$roomId/message", json)
            }

            //chatMessageDao.insert(messageEntity)
        }
    }

    // MQTT - methods
    private val topics = listOf("message","typing", "enter", "leave")
    //MQTT 구독 및 메세지 수신 처리
    private fun subscribeToMqttTopics() {
//        MqttClient.connect()
        MqttClient.setOnMessageReceived { topic, message -> handleIncomingMqttMessage(topic,message) }
        topics.forEach {
            MqttClient.subscribe("liontalk/rooms/$roomId/$it")
        }
    }
    //MQTT 구독 해지
    private fun unsubscribeFromMqttTopics() {
        topics.forEach {
            MqttClient.unsubscribe("liontalk/rooms/$roomId/$it")
        }
    }

    // MQTT 수신 메세지 처리
    private fun handleIncomingMqttMessage(topic: String,message: String) {
        when {
            topic.endsWith("/message") -> onReceivedMessage(message)
            topic.endsWith("/typing") -> onReceivedTyping(message)
            topic.endsWith("/enter") -> onReceivedEnter(message)
            topic.endsWith("/leave") -> onReceivedLeave(message)

        }
    }

    private fun onReceivedEnter(message: String) {
        val dto = Gson().fromJson(message, PresenceMessageDto::class.java)
        if (dto.sender != me.name) {
            viewModelScope.launch {
                _event.emit(ChatRoomEvent.ChatRoomEnter(dto.sender))
            }
        }
    }

    private fun onReceivedLeave(message: String) {
        val dto = Gson().fromJson(message, PresenceMessageDto::class.java)
        if (dto.sender != me.name) {
            viewModelScope.launch {
                _event.emit(ChatRoomEvent.ChatRoomLeave(dto.sender))
            }
        }
    }

    private fun onReceivedMessage(message: String) {
        val dto = Gson().fromJson(message,ChatMessageDto::class.java)

        viewModelScope.launch {
//            chatMessageDao.insert(dto.toEntity())
            chatMessageRepository.receiveMessage(dto)
        }
    }
//    private val _event = MutableSharedFlow<ChatRoomEvent>()
//    val event = _event.asSharedFlow()

    private fun onReceivedTyping(message: String) {
        val dto = Gson(). fromJson(message, TypingMessageDto::class.java)
        if (dto.sender != me.name) {
            viewModelScope.launch {
                val event = if (dto.typing) ChatRoomEvent.TypingStarted(dto.sender)
                else ChatRoomEvent.TypingStopped

                _event.emit(event)
            }
        }
    }

    private var typing = false
    private var typingStopJop: Job? = null

    fun onTypingChanged(text: String) {
        if (text.isNotBlank() && !typing) {
            publishTypingStatus(true)
        }
        typingStopJop?.cancel()
        typingStopJop = viewModelScope.launch {
            delay(2000)
            typing = false
            publishTypingStatus(false)
        }
    }

    private fun publishTypingStatus(isTyping:Boolean) {
        val json = Gson().toJson(TypingMessageDto(sender = me.name,isTyping))
        MqttClient.publish("liontalk/rooms/$roomId/typing", json)
    }

    // 입장
    private fun publishEnterStatus() {
        val json = Gson().toJson(PresenceMessageDto(sender = me.name))
        MqttClient.publish("liontalk/rooms/$roomId/enter", json)
    }

    // 퇴장
    private fun publishLeaveStatus() {
        val json = Gson().toJson(PresenceMessageDto(sender = me.name))
        MqttClient.publish("liontalk/rooms/$roomId/leave", json)
    }
}