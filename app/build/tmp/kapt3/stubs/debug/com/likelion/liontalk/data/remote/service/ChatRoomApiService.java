package com.likelion.liontalk.data.remote.service;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0001\u0010\b\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013\u00c0\u0006\u0003"}, d2 = {"Lcom/likelion/liontalk/data/remote/service/ChatRoomApiService;", "", "getChatRooms", "", "Lcom/likelion/liontalk/data/remote/dto/ChatRoomDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRoom", "Lretrofit2/Response;", "chatRoom", "(Lcom/likelion/liontalk/data/remote/dto/ChatRoomDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRoom", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatRoom", "updateChatRoom", "dto", "(ILcom/likelion/liontalk/data/remote/dto/ChatRoomDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ChatRoomApiService {
    
    @retrofit2.http.GET(value = "chatrooms")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getChatRooms(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.likelion.liontalk.data.remote.dto.ChatRoomDto>> $completion);
    
    @retrofit2.http.POST(value = "chatrooms")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createRoom(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.remote.dto.ChatRoomDto chatRoom, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.likelion.liontalk.data.remote.dto.ChatRoomDto>> $completion);
    
    @retrofit2.http.DELETE(value = "chatrooms/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteRoom(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> $completion);
    
    @retrofit2.http.GET(value = "chatrooms/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getChatRoom(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.likelion.liontalk.data.remote.dto.ChatRoomDto> $completion);
    
    @retrofit2.http.PUT(value = "chatrooms/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateChatRoom(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.remote.dto.ChatRoomDto dto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.likelion.liontalk.data.remote.dto.ChatRoomDto>> $completion);
}