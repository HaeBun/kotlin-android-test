package com.likelion.liontalk.features.chatroom;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/likelion/liontalk/features/chatroom/ChatRoomViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "roomId", "", "<init>", "(Landroid/app/Application;I)V", "chatMessageDao", "Lcom/likelion/liontalk/data/local/dao/ChatMessageDao;", "messages", "Landroidx/lifecycle/LiveData;", "", "Lcom/likelion/liontalk/data/local/entity/ChatMessageEntity;", "getMessages", "()Landroidx/lifecycle/LiveData;", "sendMessage", "", "sender", "", "content", "app_debug"})
public final class ChatRoomViewModel extends androidx.lifecycle.ViewModel {
    private final int roomId = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.local.dao.ChatMessageDao chatMessageDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity>> messages = null;
    
    public ChatRoomViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, int roomId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity>> getMessages() {
        return null;
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String sender, @org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
}