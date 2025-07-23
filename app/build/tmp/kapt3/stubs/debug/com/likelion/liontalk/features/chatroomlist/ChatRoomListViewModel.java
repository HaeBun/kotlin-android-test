package com.likelion.liontalk.features.chatroomlist;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aR\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001b"}, d2 = {"Lcom/likelion/liontalk/features/chatroomlist/ChatRoomListViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lcom/likelion/liontalk/features/chatroomlist/ChatRoomListState;", "kotlin.jvm.PlatformType", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "chatRoomRepository", "Lcom/likelion/liontalk/data/repository/ChatRoomRepository;", "userPreferenceRepository", "Lcom/likelion/liontalk/data/repository/UserPreferenceRepository;", "me", "Lcom/likelion/liontalk/model/ChatUser;", "getMe", "()Lcom/likelion/liontalk/model/ChatUser;", "loadChatRooms", "", "createChatRoom", "title", "", "app_debug"})
public final class ChatRoomListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.likelion.liontalk.features.chatroomlist.ChatRoomListState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.likelion.liontalk.features.chatroomlist.ChatRoomListState> state = null;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.repository.ChatRoomRepository chatRoomRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.likelion.liontalk.data.repository.UserPreferenceRepository userPreferenceRepository = null;
    
    public ChatRoomListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.likelion.liontalk.features.chatroomlist.ChatRoomListState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.likelion.liontalk.model.ChatUser getMe() {
        return null;
    }
    
    private final void loadChatRooms() {
    }
    
    public final void createChatRoom(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
}