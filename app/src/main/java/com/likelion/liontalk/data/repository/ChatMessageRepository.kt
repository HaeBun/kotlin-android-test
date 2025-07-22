package com.likelion.liontalk.data.repository

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import com.likelion.liontalk.data.local.datasource.ChatMessageLocalDataSource
import com.likelion.liontalk.data.local.entity.ChatMessageEntity
import com.likelion.liontalk.data.remote.dto.ChatMessageDto
import com.likelion.liontalk.data.remote.service.ChatMessageRemoteDataSource
import com.likelion.liontalk.model.ChatMessageMapper.toEntity

class ChatMessageRepository(context: Context) {
    private val remote = ChatMessageRemoteDataSource()
    private val local = ChatMessageLocalDataSource(context)


    suspend fun clearLocalDB() {
        local.clear()
    }

    // 현재 로컬 db에 저장된 메시지 목록을 가져옴.
    fun getMessageForRoom(roomId: Int): LiveData<List<ChatMessageEntity>> {
        return local.getMessageForRoom(roomId)
    }


    // API 서버로 메세지를 보내고 로컬 db에 저장함.
    suspend fun sendMessage(message:ChatMessageDto): ChatMessageDto? {
        try {
            val result = remote.sendMessage(message)
            result?.let {
                local.insert(it.toEntity())
                return it
            }
        } catch (e: Exception) {
            Log.e("ChatMessageRepository", "${message}")
        }
        return null
    }

    // MQTT 수신 메시지 로컬 DB
    suspend fun receiveMessage(message: ChatMessageDto) {
        local.insert(message.toEntity())
    }


}