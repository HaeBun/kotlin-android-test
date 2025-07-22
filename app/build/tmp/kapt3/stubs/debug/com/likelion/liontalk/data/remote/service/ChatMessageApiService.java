package com.likelion.liontalk.data.remote.service;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007\u00c0\u0006\u0003"}, d2 = {"Lcom/likelion/liontalk/data/remote/service/ChatMessageApiService;", "", "sendMessage", "Lretrofit2/Response;", "Lcom/likelion/liontalk/data/remote/dto/ChatMessageDto;", "message", "(Lcom/likelion/liontalk/data/remote/dto/ChatMessageDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ChatMessageApiService {
    
    @retrofit2.http.POST(value = "messages")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object sendMessage(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.remote.dto.ChatMessageDto message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.likelion.liontalk.data.remote.dto.ChatMessageDto>> $completion);
}