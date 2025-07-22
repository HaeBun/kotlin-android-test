package com.likelion.liontalk.data.remote.datasource;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/likelion/liontalk/data/remote/datasource/ChatRoomRemoteDataSource;", "", "<init>", "()V", "api", "Lcom/likelion/liontalk/data/remote/service/ChatRoomApiService;", "getApi", "()Lcom/likelion/liontalk/data/remote/service/ChatRoomApiService;", "fetchRooms", "", "Lcom/likelion/liontalk/data/remote/dto/ChatRoomDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRoom", "chatRoomDto", "(Lcom/likelion/liontalk/data/remote/dto/ChatRoomDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRoom", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ChatRoomRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.remote.service.ChatRoomApiService api = null;
    
    public ChatRoomRemoteDataSource() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.likelion.liontalk.data.remote.service.ChatRoomApiService getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchRooms(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.likelion.liontalk.data.remote.dto.ChatRoomDto>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createRoom(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.remote.dto.ChatRoomDto chatRoomDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.likelion.liontalk.data.remote.dto.ChatRoomDto> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteRoom(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}