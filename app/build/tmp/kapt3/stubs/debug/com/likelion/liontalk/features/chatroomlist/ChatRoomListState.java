package com.likelion.liontalk.features.chatroomlist;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u00c6\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/likelion/liontalk/features/chatroomlist/ChatRoomListState;", "", "isLoading", "", "chatRooms", "", "Lcom/likelion/liontalk/model/ChatRoom;", "joinedRooms", "notJoinedRooms", "currentTab", "Lcom/likelion/liontalk/features/chatroomlist/ChatRoomTab;", "error", "", "<init>", "(ZLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/likelion/liontalk/features/chatroomlist/ChatRoomTab;Ljava/lang/String;)V", "()Z", "getChatRooms", "()Ljava/util/List;", "getJoinedRooms", "getNotJoinedRooms", "getCurrentTab", "()Lcom/likelion/liontalk/features/chatroomlist/ChatRoomTab;", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class ChatRoomListState {
    private final boolean isLoading = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.likelion.liontalk.model.ChatRoom> chatRooms = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.likelion.liontalk.model.ChatRoom> joinedRooms = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.likelion.liontalk.model.ChatRoom> notJoinedRooms = null;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.features.chatroomlist.ChatRoomTab currentTab = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    
    public ChatRoomListState(boolean isLoading, @org.jetbrains.annotations.NotNull()
    java.util.List<com.likelion.liontalk.model.ChatRoom> chatRooms, @org.jetbrains.annotations.NotNull()
    java.util.List<com.likelion.liontalk.model.ChatRoom> joinedRooms, @org.jetbrains.annotations.NotNull()
    java.util.List<com.likelion.liontalk.model.ChatRoom> notJoinedRooms, @org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.features.chatroomlist.ChatRoomTab currentTab, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        super();
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.likelion.liontalk.model.ChatRoom> getChatRooms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.likelion.liontalk.model.ChatRoom> getJoinedRooms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.likelion.liontalk.model.ChatRoom> getNotJoinedRooms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.likelion.liontalk.features.chatroomlist.ChatRoomTab getCurrentTab() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    public ChatRoomListState() {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.likelion.liontalk.model.ChatRoom> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.likelion.liontalk.model.ChatRoom> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.likelion.liontalk.model.ChatRoom> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.likelion.liontalk.features.chatroomlist.ChatRoomTab component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.likelion.liontalk.features.chatroomlist.ChatRoomListState copy(boolean isLoading, @org.jetbrains.annotations.NotNull()
    java.util.List<com.likelion.liontalk.model.ChatRoom> chatRooms, @org.jetbrains.annotations.NotNull()
    java.util.List<com.likelion.liontalk.model.ChatRoom> joinedRooms, @org.jetbrains.annotations.NotNull()
    java.util.List<com.likelion.liontalk.model.ChatRoom> notJoinedRooms, @org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.features.chatroomlist.ChatRoomTab currentTab, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}