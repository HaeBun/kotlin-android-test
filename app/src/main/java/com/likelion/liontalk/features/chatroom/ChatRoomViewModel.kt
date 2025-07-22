package com.likelion.liontalk.features.chatroom

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.likelion.liontalk.data.local.AppDatabase
import com.likelion.liontalk.data.local.entity.ChatMessageEntity
import com.likelion.liontalk.data.remote.dto.ChatMessageDto
import com.likelion.liontalk.data.remote.mqtt.MqttClient
import com.likelion.liontalk.data.repository.ChatMessageRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ChatRoomViewModel(application: Application, private val roomId: Int) : ViewModel(){
    private val chatMessageDao = AppDatabase.create(application)
        .chatMessageDao()

    private val chatMessageRepository = ChatMessageRepository(application)

//    val messages : LiveData<List<ChatMessageEntity>>
//        = chatMessageDao.getMessagesForRoom(roomId)

    val messages : LiveData<List<ChatMessageEntity>> = chatMessageRepository.getMessageForRoom(roomId)

    init {
        viewModelScope.launch {
            chatMessageRepository.clearLocalDB()

            withContext(Dispatchers.IO) {
                subscribeToMqttTopics()
            }

            withContext(Dispatchers.IO) {
                MqttClient.connect()
            }

        }
    }


    // 메세지 전송
    fun sendMessage(sender: String, content: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val dto = ChatMessageDto(
                roomId = roomId,
                sender = sender,
                content = content,
                createdAt = System.currentTimeMillis()
            )
            // API -> MQTT -> Room DB insert

            // 1. API 보내기
            val responseDto = chatMessageRepository.sendMessage(dto)


            // 2. MQTT 보내기
            if (responseDto != null) {
                val json = Gson().toJson(responseDto)
                MqttClient.publish("liontalk/rooms/$roomId/message", json)
            }

        }
    }

    // MQTT - 메세지 전송
    private val topics = listOf("message")

    // MQTT - 구독 및 메시지 수신 처리
    private fun subscribeToMqttTopics() {
        MqttClient.setOnMessageReceived { topic, message -> handleIncomingMqttMessage(topic, message)}
        topics.forEach {
            MqttClient.subscribe("liontalk/rooms/$roomId/$it")
        }
    }

    // MQTT - 토픽 구독 해제
    private fun unsubscribeFromMqttTopics() {
        topics.forEach {
            MqttClient.unsubscribe("liontalk/rooms/$roomId/$it")
        }
    }


    // MQTT - 수신 메시지 처리
    private fun handleIncomingMqttMessage(topic: String, message: String) {
        when {
            topic.endsWith("/message") -> onReceivedMessage(message)
        }
    }

    private fun onReceivedMessage(message: String) {
        val dto = Gson().fromJson(message,ChatMessageDto::class.java)

        viewModelScope.launch {
//            chatMessageDao.insert(dto.toEntity())
            chatMessageRepository.receiveMessage(dto)
        }

    }


}