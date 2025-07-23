package com.likelion.liontalk.data.repository;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/likelion/liontalk/data/repository/ChatMessageRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "remote", "Lcom/likelion/liontalk/data/remote/datasource/ChatMessageRemoteDataSource;", "local", "Lcom/likelion/liontalk/data/local/datasource/ChatMessageLocalDataSource;", "clearLocalDB", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessagesForRoom", "Landroidx/lifecycle/LiveData;", "", "Lcom/likelion/liontalk/data/local/entity/ChatMessageEntity;", "roomId", "", "getMessagesForRoomFlow", "Lkotlinx/coroutines/flow/Flow;", "sendMessage", "Lcom/likelion/liontalk/data/remote/dto/ChatMessageDto;", "message", "(Lcom/likelion/liontalk/data/remote/dto/ChatMessageDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveMessage", "app_debug"})
public final class ChatMessageRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.remote.datasource.ChatMessageRemoteDataSource remote = null;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.local.datasource.ChatMessageLocalDataSource local = null;
    
    public ChatMessageRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearLocalDB(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity>> getMessagesForRoom(int roomId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity>> getMessagesForRoomFlow(int roomId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.remote.dto.ChatMessageDto message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.likelion.liontalk.data.remote.dto.ChatMessageDto> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object receiveMessage(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.remote.dto.ChatMessageDto message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}