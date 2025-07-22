package com.likelion.liontalk.data.repository;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/likelion/liontalk/data/repository/ChatRoomRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "remote", "Lcom/likelion/liontalk/data/remote/datasource/ChatRoomRemoteDataSource;", "local", "Lcom/likelion/liontalk/data/local/datasource/ChatRoomLocalDataSource;", "getChatRoomEntities", "Landroidx/lifecycle/LiveData;", "", "Lcom/likelion/liontalk/data/local/entity/ChatRoomEntity;", "createChatRoom", "", "chatRoom", "Lcom/likelion/liontalk/data/remote/dto/ChatRoomDto;", "(Lcom/likelion/liontalk/data/remote/dto/ChatRoomDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteChatRoomToRemote", "roomId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncFromServer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ChatRoomRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.remote.datasource.ChatRoomRemoteDataSource remote = null;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.local.datasource.ChatRoomLocalDataSource local = null;
    
    public ChatRoomRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.likelion.liontalk.data.local.entity.ChatRoomEntity>> getChatRoomEntities() {
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
}