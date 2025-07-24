package com.likelion.liontalk.data.remote.service;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u00a7@\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e\u00c0\u0006\u0003"}, d2 = {"Lcom/likelion/liontalk/data/remote/service/ChatMessageApiService;", "", "sendMessage", "Lretrofit2/Response;", "Lcom/likelion/liontalk/data/remote/dto/ChatMessageDto;", "message", "(Lcom/likelion/liontalk/data/remote/dto/ChatMessageDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMessagesByRoomId", "", "roomId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMessages", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ChatMessageApiService {
    
    @retrofit2.http.POST(value = "messages")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object sendMessage(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.remote.dto.ChatMessageDto message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.likelion.liontalk.data.remote.dto.ChatMessageDto>> $completion);
    
    @retrofit2.http.GET(value = "messages")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchMessagesByRoomId(@retrofit2.http.Query(value = "roomId")
    int roomId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.likelion.liontalk.data.remote.dto.ChatMessageDto>> $completion);
    
    @retrofit2.http.GET(value = "messages")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchMessages(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.likelion.liontalk.data.remote.dto.ChatMessageDto>> $completion);
}