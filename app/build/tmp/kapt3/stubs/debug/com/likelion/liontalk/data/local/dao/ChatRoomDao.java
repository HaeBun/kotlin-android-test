package com.likelion.liontalk.data.local.dao;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\rH\'J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r2\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\nH\u00a7@\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0019J\u001e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u001dJ\u001e\u0010 \u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u00a7@\u00a2\u0006\u0002\u0010#\u00a8\u0006$\u00c0\u0006\u0003"}, d2 = {"Lcom/likelion/liontalk/data/local/dao/ChatRoomDao;", "", "insert", "", "chatroom", "Lcom/likelion/liontalk/data/local/entity/ChatRoomEntity;", "(Lcom/likelion/liontalk/data/local/entity/ChatRoomEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "getChatRooms", "Landroidx/lifecycle/LiveData;", "", "getChatRoomsList", "getChatRoomsFlow", "Lkotlinx/coroutines/flow/Flow;", "getChatRoom", "id", "", "getChatRoomFlow", "insertAll", "chatRooms", "updateUsers", "users", "Lcom/likelion/liontalk/model/ChatUser;", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "updateLastReadMessageId", "lastReadMessageId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUnReadCount", "unReadCount", "updateLockStatus", "isLocked", "", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface ChatRoomDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.local.entity.ChatRoomEntity chatroom, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.data.local.entity.ChatRoomEntity chatroom, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM chat_room ORDER BY id desc")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.likelion.liontalk.data.local.entity.ChatRoomEntity>> getChatRooms();
    
    @androidx.room.Query(value = "SELECT * FROM chat_room ORDER BY id desc")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.likelion.liontalk.data.local.entity.ChatRoomEntity> getChatRoomsList();
    
    @androidx.room.Query(value = "SELECT * FROM chat_room ORDER BY id desc")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.likelion.liontalk.data.local.entity.ChatRoomEntity>> getChatRoomsFlow();
    
    @androidx.room.Query(value = "SELECT * FROM chat_room WHERE id=:id")
    @org.jetbrains.annotations.Nullable()
    public abstract com.likelion.liontalk.data.local.entity.ChatRoomEntity getChatRoom(int id);
    
    @androidx.room.Query(value = "SELECT * FROM chat_room WHERE id=:id")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.likelion.liontalk.data.local.entity.ChatRoomEntity> getChatRoomFlow(int id);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.likelion.liontalk.data.local.entity.ChatRoomEntity> chatRooms);
    
    @androidx.room.Query(value = "UPDATE chat_room SET users = :users WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUsers(int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.likelion.liontalk.model.ChatUser> users, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM chat_room")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "DELETE FROM chat_room")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clear(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE chat_room SET lastReadMessageId =:lastReadMessageId WHERE id =:id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateLastReadMessageId(int id, int lastReadMessageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE chat_room SET unReadCount =:unReadCount WHERE id=:id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUnReadCount(int id, int unReadCount, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE chat_room SET isLocked = :isLocked WHERE id=:id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateLockStatus(int id, boolean isLocked, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}