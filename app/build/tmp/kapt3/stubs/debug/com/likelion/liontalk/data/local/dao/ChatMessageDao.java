package com.likelion.liontalk.data.local.dao;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u000e\u0010\f\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010\u00c0\u0006\u0003"}, d2 = {"Lcom/likelion/liontalk/data/local/dao/ChatMessageDao;", "", "insert", "", "message", "Lcom/likelion/liontalk/data/local/entity/ChatMessageEntity;", "(Lcom/likelion/liontalk/data/local/entity/ChatMessageEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessagesForRoom", "Landroidx/lifecycle/LiveData;", "", "roomId", "", "clear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessages", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
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
    
    @androidx.room.Query(value = "DELETE FROM chat_message")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clear(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM chat_message WHERE roomId = :roomId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMessages(int roomId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity>> $completion);
}