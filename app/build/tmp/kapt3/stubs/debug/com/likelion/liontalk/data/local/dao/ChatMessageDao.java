package com.likelion.liontalk.data.local.dao;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\r2\u0006\u0010\n\u001a\u00020\u000bH\'J\u000e\u0010\u000e\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0019\u00a8\u0006\u001a\u00c0\u0006\u0003"}, d2 = {"Lcom/likelion/liontalk/data/local/dao/ChatMessageDao;", "", "insert", "", "message", "Lcom/likelion/liontalk/data/local/entity/ChatMessageEntity;", "(Lcom/likelion/liontalk/data/local/entity/ChatMessageEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessagesForRoom", "Landroidx/lifecycle/LiveData;", "", "roomId", "", "getMessagesForRoomFlow", "Lkotlinx/coroutines/flow/Flow;", "clear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessages", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestMessage", "deleteMessagesByRoomId", "insertAll", "messages", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnreadMessageCount", "lastReadMessageId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface ChatMessageDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.local.entity.ChatMessageEntity message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM chat_message WHERE roomId = :roomId ORDER BY id ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity>> getMessagesForRoom(int roomId);
    
    @androidx.room.Query(value = "SELECT * FROM chat_message WHERE roomId = :roomId ORDER BY id ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity>> getMessagesForRoomFlow(int roomId);
    
    @androidx.room.Query(value = "DELETE FROM chat_message")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clear(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM chat_message WHERE roomId =:roomId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMessages(int roomId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM chat_message WHERE roomId =:roomId ORDER BY id DESC LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLatestMessage(int roomId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.likelion.liontalk.data.local.entity.ChatMessageEntity> $completion);
    
    @androidx.room.Query(value = "DELETE FROM chat_message WHERE roomId = :roomId ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteMessagesByRoomId(int roomId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity> messages, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM chat_message WHERE roomId = :roomId AND id > :lastReadMessageId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnreadMessageCount(int roomId, int lastReadMessageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}