package com.likelion.liontalk.data.remote.mqtt;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0018\u00010\u0010J>\u0010\u0018\u001a\u00020\f26\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\f0\u0013J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u001c\u001a\u00020\fJ\u0016\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nJ\u0006\u0010\u001e\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R@\u0010\u0012\u001a4\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/likelion/liontalk/data/remote/mqtt/MqttClient;", "", "<init>", "()V", "mqttClient", "Lcom/hivemq/client/mqtt/mqtt3/Mqtt3BlockingClient;", "isConnected", "", "subscribedTopics", "", "", "connect", "", "onConnected", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "", "messageCallback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "topic", "message", "setOnMessageReceived", "callback", "subscribe", "unsubscribe", "unsubscribeAll", "publish", "disconnect", "app_debug"})
public final class MqttClient {
    @org.jetbrains.annotations.NotNull()
    private static final com.hivemq.client.mqtt.mqtt3.Mqtt3BlockingClient mqttClient = null;
    private static boolean isConnected = false;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> subscribedTopics = null;
    @org.jetbrains.annotations.Nullable()
    private static kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> messageCallback;
    @org.jetbrains.annotations.NotNull()
    public static final com.likelion.liontalk.data.remote.mqtt.MqttClient INSTANCE = null;
    
    private MqttClient() {
        super();
    }
    
    public final void connect(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onConnected, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
    }
    
    public final void setOnMessageReceived(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> callback) {
    }
    
    public final void subscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String topic) {
    }
    
    public final void unsubscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String topic) {
    }
    
    public final void unsubscribeAll() {
    }
    
    public final void publish(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void disconnect() {
    }
}