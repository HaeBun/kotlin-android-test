package com.likelion.liontalk.data.repository;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013\u00a8\u0006\u001a"}, d2 = {"Lcom/likelion/liontalk/data/repository/UserPreferenceRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "_user", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/likelion/liontalk/model/ChatUser;", "user", "Lkotlinx/coroutines/flow/StateFlow;", "getUser", "()Lkotlinx/coroutines/flow/StateFlow;", "meOrNull", "getMeOrNull", "()Lcom/likelion/liontalk/model/ChatUser;", "requireMe", "isInitialized", "", "()Z", "loadUserFromStorage", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUser", "(Lcom/likelion/liontalk/model/ChatUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class UserPreferenceRepository {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.likelion.liontalk.model.ChatUser> _user = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.likelion.liontalk.model.ChatUser> user = null;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.likelion.liontalk.data.repository.UserPreferenceRepository _instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.likelion.liontalk.data.repository.UserPreferenceRepository.Companion Companion = null;
    
    private UserPreferenceRepository(android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.likelion.liontalk.model.ChatUser> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.likelion.liontalk.model.ChatUser getMeOrNull() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.likelion.liontalk.model.ChatUser requireMe() {
        return null;
    }
    
    public final boolean isInitialized() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadUserFromStorage(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setUser(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.model.ChatUser user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/likelion/liontalk/data/repository/UserPreferenceRepository$Companion;", "", "<init>", "()V", "_instance", "Lcom/likelion/liontalk/data/repository/UserPreferenceRepository;", "init", "", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void init(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.likelion.liontalk.data.repository.UserPreferenceRepository getInstance() {
            return null;
        }
    }
}