package com.likelion.liontalk.model;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/likelion/liontalk/model/ChatMessage;", "", "id", "", "roomId", "sender", "Lcom/likelion/liontalk/model/ChatUser;", "content", "", "type", "createdAt", "", "<init>", "(IILcom/likelion/liontalk/model/ChatUser;Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()I", "getRoomId", "getSender", "()Lcom/likelion/liontalk/model/ChatUser;", "getContent", "()Ljava/lang/String;", "getType", "getCreatedAt", "()J", "app_debug"})
public final class ChatMessage {
    private final int id = 0;
    private final int roomId = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.model.ChatUser sender = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String content = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String type = null;
    private final long createdAt = 0L;
    
    public ChatMessage(int id, int roomId, @org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.model.ChatUser sender, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.lang.String type, long createdAt) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final int getRoomId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.likelion.liontalk.model.ChatUser getSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final long getCreatedAt() {
        return 0L;
    }
}