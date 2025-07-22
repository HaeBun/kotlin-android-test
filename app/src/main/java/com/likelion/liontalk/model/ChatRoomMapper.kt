package com.likelion.liontalk.model

import com.likelion.liontalk.data.local.entity.ChatRoomEntity
import com.likelion.liontalk.data.remote.dto.ChatRoomDto

object ChatRoomMapper {
    fun ChatRoomDto.toEntity() = ChatRoomEntity(
        id,
        title,
        owner,
        users = emptyList(),
        createdAt
    )

    fun ChatRoomEntity.toDto() = ChatRoomDto(
        id,
        title,
        owner,
        users = emptyList(),
        createdAt
    )
}