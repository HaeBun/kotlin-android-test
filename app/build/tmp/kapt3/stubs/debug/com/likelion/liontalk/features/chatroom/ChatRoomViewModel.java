package com.likelion.liontalk.features.chatroom;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\u0018\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020 2\u0006\u0010\n\u001a\u00020 H\u0002J\u0010\u0010\'\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020 H\u0002J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020 H\u0002J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020 H\u0002J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020 H\u0002J\u000e\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020 J\u0010\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020,H\u0002J\b\u00103\u001a\u00020\u001eH\u0002J\b\u00104\u001a\u00020\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/likelion/liontalk/features/chatroom/ChatRoomViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "roomId", "", "<init>", "(Landroid/app/Application;I)V", "chatMessageRepository", "Lcom/likelion/liontalk/data/repository/ChatMessageRepository;", "message", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/likelion/liontalk/data/local/entity/ChatMessageEntity;", "getMessage", "()Lkotlinx/coroutines/flow/StateFlow;", "userPreferenceRepository", "Lcom/likelion/liontalk/data/repository/UserPreferenceRepository;", "me", "Lcom/likelion/liontalk/model/ChatUser;", "getMe", "()Lcom/likelion/liontalk/model/ChatUser;", "_event", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/likelion/liontalk/features/chatroom/ChatRoomEvent;", "event", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "sendMessage", "", "sender", "", "content", "topics", "subscribeToMqttTopics", "unsubscribeFromMqttTopics", "handleIncomingMqttMessage", "topic", "onReceivedEnter", "onReceivedLeave", "onReceivedMessage", "onReceivedTyping", "typing", "", "typingStopJop", "Lkotlinx/coroutines/Job;", "onTypingChanged", "text", "publishTypingStatus", "isTyping", "publishEnterStatus", "publishLeaveStatus", "app_debug"})
public final class ChatRoomViewModel extends androidx.lifecycle.ViewModel {
    private final int roomId = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.repository.ChatMessageRepository chatMessageRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity>> message = null;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.repository.UserPreferenceRepository userPreferenceRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.likelion.liontalk.features.chatroom.ChatRoomEvent> _event = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.likelion.liontalk.features.chatroom.ChatRoomEvent> event = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> topics = null;
    private boolean typing = false;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job typingStopJop;
    
    public ChatRoomViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, int roomId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.likelion.liontalk.data.local.entity.ChatMessageEntity>> getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.likelion.liontalk.model.ChatUser getMe() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.likelion.liontalk.features.chatroom.ChatRoomEvent> getEvent() {
        return null;
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String sender, @org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
    
    private final void subscribeToMqttTopics() {
    }
    
    private final void unsubscribeFromMqttTopics() {
    }
    
    private final void handleIncomingMqttMessage(java.lang.String topic, java.lang.String message) {
    }
    
    private final void onReceivedEnter(java.lang.String message) {
    }
    
    private final void onReceivedLeave(java.lang.String message) {
    }
    
    private final void onReceivedMessage(java.lang.String message) {
    }
    
    private final void onReceivedTyping(java.lang.String message) {
    }
    
    public final void onTypingChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    private final void publishTypingStatus(boolean isTyping) {
    }
    
    private final void publishEnterStatus() {
    }
    
    private final void publishLeaveStatus() {
    }
}