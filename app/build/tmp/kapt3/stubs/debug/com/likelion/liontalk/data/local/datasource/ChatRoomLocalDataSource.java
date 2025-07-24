package com.likelion.liontalk.data.local.datasource;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\u0016J$\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\nH\u0086@\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010!J\u001e\u0010#\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010%J\u001e\u0010&\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010%J\u001e\u0010(\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*H\u0086@\u00a2\u0006\u0002\u0010+R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/likelion/liontalk/data/local/datasource/ChatRoomLocalDataSource;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dao", "Lcom/likelion/liontalk/data/local/dao/ChatRoomDao;", "getChatRooms", "Landroidx/lifecycle/LiveData;", "", "Lcom/likelion/liontalk/data/local/entity/ChatRoomEntity;", "getChatRoomsList", "getChatRoomsFlow", "Lkotlinx/coroutines/flow/Flow;", "getChatRoom", "roomId", "", "getChatRoomFlow", "insert", "", "chatRoom", "(Lcom/likelion/liontalk/data/local/entity/ChatRoomEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "chatRooms", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "updateUsers", "id", "users", "Lcom/likelion/liontalk/model/ChatUser;", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCount", "updateLastReadMessageId", "lastReadMessageId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUnReadCount", "unReadCount", "updateLockStatus", "isLocked", "", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ChatRoomLocalDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.local.dao.ChatRoomDao dao = null;
    
    public ChatRoomLocalDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.likelion.liontalk.data.local.entity.ChatRoomEntity>> getChatRooms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.likelion.liontalk.data.local.entity.ChatRoomEntity> getChatRoomsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.likelion.liontalk.data.local.entity.ChatRoomEntity>> getChatRoomsFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.likelion.liontalk.data.local.entity.ChatRoomEntity getChatRoom(int roomId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.likelion.liontalk.data.local.entity.ChatRoomEntity> getChatRoomFlow(int roomId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.local.entity.ChatRoomEntity chatRoom, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.likelion.liontalk.data.local.entity.ChatRoomEntity> chatRooms, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.local.entity.ChatRoomEntity chatRoom, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateUsers(int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.likelion.liontalk.model.ChatUser> users, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clear(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateLastReadMessageId(int id, int lastReadMessageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateUnReadCount(int id, int unReadCount, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateLockStatus(int id, boolean isLocked, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}