package com.likelion.liontalk.features.chatroomlist

import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.likelion.liontalk.data.local.entity.ChatRoomEntity

@Composable
fun ChatRoomItem(room: ChatRoomEntity, onClick: (ChatRoomEntity) -> Unit) {
    Card(modifier = Modifier.fillMaxWidth().padding(16.dp)
        .combinedClickable (
            onClick = { onClick(room) },
            onLongClick = {}
        ),
        // 13:50 여기까지 작성함. 추후 내용은 오늘 외부 나갔다 와서 처리
        elevation = CardDefaults.
    )
}