package com.likelion.liontalk.data.local.datasource;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\u00152\u0006\u0010\u0012\u001a\u00020\u0013J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0017J\u001c\u0010\u001a\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0086@\u00a2\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/likelion/liontalk/data/local/datasource/ChatMessageLocalDataSource;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dao", "Lcom/likelion/liontalk/data/local/dao/ChatMessageDao;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "message", "Lcom/likelion/liontalk/data/local/entity/ChatMessageEntity;", "(Lcom/likelion/liontalk/data/local/entity/ChatMessageEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessageForRoom", "Landroidx/lifecycle/LiveData;", "", "roomId", "", "getMessageForRoomFlow", "Lkotlinx/coroutines/flow/Flow;", "getMessages", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestMessage", "deleteMessagesByRoomId", "insertAll", "messages", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnreadMessageCount", "lastReadMessageId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ChatMessageLocalDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.local.dao.ChatMessageDao dao = null;
    
    public ChatMessageLocalDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clear(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.local.entity.ChatMessageEntity message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity>> getMessageForRoom(int roomId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity>> getMessageForRoomFlow(int roomId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMessages(int roomId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLatestMessage(int roomId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.likelion.liontalk.data.local.entity.ChatMessageEntity> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteMessagesByRoomId(int roomId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity> messages, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUnreadMessageCount(int roomId, int lastReadMessageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
}