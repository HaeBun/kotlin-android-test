package com.likelion.liontalk.features.chatroom;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\'\u001a\u00020(H\u0002J\u000e\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020(H\u0002J\u0018\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020+H\u0002J\u0006\u00102\u001a\u00020(J\u000e\u00103\u001a\u00020(2\u0006\u00104\u001a\u000205J\u000e\u00106\u001a\u00020(2\u0006\u00101\u001a\u00020+J\u0010\u00107\u001a\u00020(2\u0006\u00101\u001a\u00020+H\u0002J\u0006\u0010;\u001a\u00020(J\b\u0010<\u001a\u00020(H\u0002J\u0010\u0010=\u001a\u00020(2\u0006\u00101\u001a\u00020+H\u0002J\u0010\u0010>\u001a\u00020(2\u0006\u00101\u001a\u00020+H\u0002J\u0010\u0010?\u001a\u00020(2\u0006\u00101\u001a\u00020+H\u0002J\u0010\u0010@\u001a\u00020(2\u0006\u00101\u001a\u00020+H\u0002J\u0010\u0010A\u001a\u00020(2\u0006\u00101\u001a\u00020+H\u0002J\u0010\u0010B\u001a\u00020(2\u0006\u0010*\u001a\u00020+H\u0002J\u000e\u0010F\u001a\u00020(2\u0006\u0010G\u001a\u00020+J\u0006\u0010H\u001a\u00020(J\u0014\u0010I\u001a\u00020(2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020(0KJ\u001c\u0010L\u001a\u00020(2\u0006\u0010M\u001a\u00020\u00192\f\u0010J\u001a\b\u0012\u0004\u0012\u00020(0KJ\u0014\u0010N\u001a\u00020(2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020(0KJ\u0010\u0010O\u001a\u00020(2\u0006\u0010P\u001a\u000205H\u0002J\b\u0010Q\u001a\u00020(H\u0002J\b\u0010R\u001a\u00020(H\u0002J\u000e\u0010S\u001a\u00020(2\u0006\u0010M\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u0002050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00109\u001a\b\u0012\u0004\u0012\u0002050\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0015R\u000e\u0010C\u001a\u000205X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006T"}, d2 = {"Lcom/likelion/liontalk/features/chatroom/ChatRoomViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "roomId", "", "<init>", "(Landroid/app/Application;I)V", "chatMessageRepository", "Lcom/likelion/liontalk/data/repository/ChatMessageRepository;", "chatRoomRepository", "Lcom/likelion/liontalk/data/repository/ChatRoomRepository;", "_systemMessages", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/likelion/liontalk/model/ChatMessage;", "get_systemMessages", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "messages", "Lkotlinx/coroutines/flow/StateFlow;", "getMessages", "()Lkotlinx/coroutines/flow/StateFlow;", "userPreferenceRepository", "Lcom/likelion/liontalk/data/repository/UserPreferenceRepository;", "me", "Lcom/likelion/liontalk/model/ChatUser;", "getMe", "()Lcom/likelion/liontalk/model/ChatUser;", "_room", "Lcom/likelion/liontalk/model/ChatRoom;", "room", "getRoom", "_event", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/likelion/liontalk/features/chatroom/ChatRoomEvent;", "event", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "loadRoomInfo", "", "sendMessage", "content", "", "topics", "subscribeToMqttTopics", "unsubscribeFromMqttTopics", "handleIncomingMqttMessage", "topic", "message", "publishLockStatus", "toggleRoomLock", "isLock", "", "onReceivedLocked", "onReceivedExplod", "_explodeState", "explodeState", "getExplodeState", "triggerExplosion", "publishExplod", "onReceivedKick", "onReceivedEnter", "onReceivedLeave", "onReceivedMessage", "onReceivedTyping", "postSystemMessage", "typing", "typingStopJop", "Lkotlinx/coroutines/Job;", "onTypingChanged", "text", "stopTyping", "leaveRoom", "onComplete", "Lkotlin/Function0;", "kickUser", "user", "back", "publishTypingStatus", "isTyping", "publishEnterStatus", "publishLeaveStatus", "publishKick", "app_debug"})
public final class ChatRoomViewModel extends androidx.lifecycle.ViewModel {
    private final int roomId = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.repository.ChatMessageRepository chatMessageRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.repository.ChatRoomRepository chatRoomRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.likelion.liontalk.model.ChatMessage>> _systemMessages = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.likelion.liontalk.model.ChatMessage>> messages = null;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.repository.UserPreferenceRepository userPreferenceRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.likelion.liontalk.model.ChatRoom> _room = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.likelion.liontalk.model.ChatRoom> room = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.likelion.liontalk.features.chatroom.ChatRoomEvent> _event = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.likelion.liontalk.features.chatroom.ChatRoomEvent> event = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> topics = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _explodeState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> explodeState = null;
    private boolean typing = false;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job typingStopJop;
    
    public ChatRoomViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, int roomId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.likelion.liontalk.model.ChatMessage>> get_systemMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.likelion.liontalk.model.ChatMessage>> getMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.likelion.liontalk.model.ChatUser getMe() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.likelion.liontalk.model.ChatRoom> getRoom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.likelion.liontalk.features.chatroom.ChatRoomEvent> getEvent() {
        return null;
    }
    
    private final void loadRoomInfo() {
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
    
    private final void subscribeToMqttTopics() {
    }
    
    private final void unsubscribeFromMqttTopics() {
    }
    
    private final void handleIncomingMqttMessage(java.lang.String topic, java.lang.String message) {
    }
    
    public final void publishLockStatus() {
    }
    
    public final void toggleRoomLock(boolean isLock) {
    }
    
    public final void onReceivedLocked(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final void onReceivedExplod(java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getExplodeState() {
        return null;
    }
    
    public final void triggerExplosion() {
    }
    
    private final void publishExplod() {
    }
    
    private final void onReceivedKick(java.lang.String message) {
    }
    
    private final void onReceivedEnter(java.lang.String message) {
    }
    
    private final void onReceivedLeave(java.lang.String message) {
    }
    
    private final void onReceivedMessage(java.lang.String message) {
    }
    
    private final void onReceivedTyping(java.lang.String message) {
    }
    
    private final void postSystemMessage(java.lang.String content) {
    }
    
    public final void onTypingChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void stopTyping() {
    }
    
    public final void leaveRoom(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
    }
    
    public final void kickUser(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.model.ChatUser user, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
    }
    
    public final void back(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
    }
    
    private final void publishTypingStatus(boolean isTyping) {
    }
    
    private final void publishEnterStatus() {
    }
    
    private final void publishLeaveStatus() {
    }
    
    public final void publishKick(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.model.ChatUser user) {
    }
}