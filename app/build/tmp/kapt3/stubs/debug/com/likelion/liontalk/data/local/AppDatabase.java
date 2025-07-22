package com.likelion.liontalk.data.local;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/likelion/liontalk/data/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "chatRoomDao", "Lcom/likelion/liontalk/data/local/dao/ChatRoomDao;", "chatMessageDao", "Lcom/likelion/liontalk/data/local/dao/ChatMessageDao;", "Companion", "app_debug"})
@androidx.room.TypeConverters(value = {com.likelion.liontalk.data.local.converter.Converter.class})
@androidx.room.Database(entities = {com.likelion.liontalk.data.local.entity.ChatRoomEntity.class, com.likelion.liontalk.data.local.entity.ChatMessageEntity.class}, version = 5)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.likelion.liontalk.data.local.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.likelion.liontalk.data.local.dao.ChatRoomDao chatRoomDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.likelion.liontalk.data.local.dao.ChatMessageDao chatMessageDao();
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2 = {"Lcom/likelion/liontalk/data/local/AppDatabase$Companion;", "", "<init>", "()V", "create", "Lcom/likelion/liontalk/data/local/AppDatabase;", "content", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.likelion.liontalk.data.local.AppDatabase create(@org.jetbrains.annotations.NotNull()
        android.content.Context content) {
            return null;
        }
    }
}