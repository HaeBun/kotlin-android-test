package com.likelion.liontalk.features.chatroomlist;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 J\b\u0010#\u001a\u00020\u0018H\u0002J\u0018\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001aH\u0002J\u000e\u0010\'\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u001aJ\u0010\u0010(\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u001aH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/likelion/liontalk/features/chatroomlist/ChatRoomListViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/likelion/liontalk/features/chatroomlist/ChatRoomListState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "chatRoomRepository", "Lcom/likelion/liontalk/data/repository/ChatRoomRepository;", "chatMessageRepository", "Lcom/likelion/liontalk/data/repository/ChatMessageRepository;", "userPreferenceRepository", "Lcom/likelion/liontalk/data/repository/UserPreferenceRepository;", "me", "Lcom/likelion/liontalk/model/ChatUser;", "getMe", "()Lcom/likelion/liontalk/model/ChatUser;", "createChatRoom", "", "title", "", "switchTab", "tab", "Lcom/likelion/liontalk/features/chatroomlist/ChatRoomTab;", "removeChatRoom", "roomId", "", "topics", "", "subscribeToMqttTopics", "handleReceivedMessage", "topic", "message", "onReceivedRoomStateChanged", "onReceivedMessage", "app_debug"})
public final class ChatRoomListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.likelion.liontalk.features.chatroomlist.ChatRoomListState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.likelion.liontalk.features.chatroomlist.ChatRoomListState> state = null;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.repository.ChatRoomRepository chatRoomRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.repository.ChatMessageRepository chatMessageRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.repository.UserPreferenceRepository userPreferenceRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> topics = null;
    
    public ChatRoomListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.likelion.liontalk.features.chatroomlist.ChatRoomListState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.likelion.liontalk.model.ChatUser getMe() {
        return null;
    }
    
    public final void createChatRoom(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void switchTab(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.features.chatroomlist.ChatRoomTab tab) {
    }
    
    public final void removeChatRoom(int roomId) {
    }
    
    private final void subscribeToMqttTopics() {
    }
    
    private final void handleReceivedMessage(java.lang.String topic, java.lang.String message) {
    }
    
    public final void onReceivedRoomStateChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final void onReceivedMessage(java.lang.String message) {
    }
}