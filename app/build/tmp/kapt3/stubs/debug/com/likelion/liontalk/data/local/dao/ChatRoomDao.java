package com.likelion.liontalk.data.local.dao;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\'J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J\u000e\u0010\u0010\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0013\u00c0\u0006\u0003"}, d2 = {"Lcom/likelion/liontalk/data/local/dao/ChatRoomDao;", "", "insert", "", "chatroom", "Lcom/likelion/liontalk/data/local/entity/ChatRoomEntity;", "(Lcom/likelion/liontalk/data/local/entity/ChatRoomEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "getChatRooms", "Landroidx/lifecycle/LiveData;", "", "getChatRoom", "id", "", "insertAll", "chatRooms", "getCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "app_debug"})
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
    
    @androidx.room.Query(value = "SELECT * FROM chat_room WHERE id=:id")
    @org.jetbrains.annotations.NotNull()
    public abstract com.likelion.liontalk.data.local.entity.ChatRoomEntity getChatRoom(int id);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.likelion.liontalk.data.local.entity.ChatRoomEntity> chatRooms);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM chat_room")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "DELETE FROM chat_room")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clear(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}