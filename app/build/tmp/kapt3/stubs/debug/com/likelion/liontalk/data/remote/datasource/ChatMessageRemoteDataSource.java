package com.likelion.liontalk.data.remote.datasource;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0086@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/likelion/liontalk/data/remote/datasource/ChatMessageRemoteDataSource;", "", "<init>", "()V", "api", "Lcom/likelion/liontalk/data/remote/service/ChatMessageApiService;", "sendMessage", "Lcom/likelion/liontalk/data/remote/dto/ChatMessageDto;", "message", "(Lcom/likelion/liontalk/data/remote/dto/ChatMessageDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMessages", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMessagesByRoomId", "roomId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ChatMessageRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.remote.service.ChatMessageApiService api = null;
    
    public ChatMessageRemoteDataSource() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.remote.dto.ChatMessageDto message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.likelion.liontalk.data.remote.dto.ChatMessageDto> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchMessages(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.likelion.liontalk.data.remote.dto.ChatMessageDto>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchMessagesByRoomId(int roomId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.likelion.liontalk.data.remote.dto.ChatMessageDto>> $completion) {
        return null;
    }
}