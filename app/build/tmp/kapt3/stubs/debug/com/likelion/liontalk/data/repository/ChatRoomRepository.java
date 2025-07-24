package com.likelion.liontalk.data.repository;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e0\u0011J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0002\u0010!J\u001e\u0010\"\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0002\u0010$J\u001e\u0010%\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0002\u0010$J\u001e\u0010\'\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)H\u0086@\u00a2\u0006\u0002\u0010*J\u0018\u0010+\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0002\u0010\u001bJ\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/likelion/liontalk/data/repository/ChatRoomRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "remote", "Lcom/likelion/liontalk/data/remote/datasource/ChatRoomRemoteDataSource;", "local", "Lcom/likelion/liontalk/data/local/datasource/ChatRoomLocalDataSource;", "chatMessageLocal", "Lcom/likelion/liontalk/data/local/datasource/ChatMessageLocalDataSource;", "getChatRoomEntities", "Landroidx/lifecycle/LiveData;", "", "Lcom/likelion/liontalk/data/local/entity/ChatRoomEntity;", "getChatRoomsFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/likelion/liontalk/model/ChatRoom;", "createChatRoom", "", "chatRoom", "Lcom/likelion/liontalk/data/remote/dto/ChatRoomDto;", "(Lcom/likelion/liontalk/data/remote/dto/ChatRoomDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteChatRoomToRemote", "roomId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncFromServer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enterRoom", "user", "Lcom/likelion/liontalk/model/ChatUser;", "(Lcom/likelion/liontalk/model/ChatUser;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLastReadMessageId", "lastReadMessageId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUnReadCount", "unReadCount", "updateLockStatus", "isLocked", "", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatRoom", "getChatRoomFlow", "app_debug"})
public final class ChatRoomRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.remote.datasource.ChatRoomRemoteDataSource remote = null;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.local.datasource.ChatRoomLocalDataSource local = null;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.local.datasource.ChatMessageLocalDataSource chatMessageLocal = null;
    
    public ChatRoomRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.likelion.liontalk.data.local.entity.ChatRoomEntity>> getChatRoomEntities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.likelion.liontalk.model.ChatRoom>> getChatRoomsFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createChatRoom(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.remote.dto.ChatRoomDto chatRoom, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteChatRoomToRemote(int roomId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object syncFromServer(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object enterRoom(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.model.ChatUser user, int roomId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.likelion.liontalk.model.ChatRoom> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateLastReadMessageId(int roomId, int lastReadMessageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateUnReadCount(int roomId, int unReadCount, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateLockStatus(int roomId, boolean isLocked, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getChatRoom(int roomId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.likelion.liontalk.model.ChatRoom> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.likelion.liontalk.model.ChatRoom> getChatRoomFlow(int roomId) {
        return null;
    }
}