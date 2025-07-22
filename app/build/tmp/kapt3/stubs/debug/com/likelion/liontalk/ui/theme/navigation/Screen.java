package com.likelion.liontalk.ui.theme.navigation;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/likelion/liontalk/ui/theme/navigation/Screen;", "", "route", "", "<init>", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "ChatRoomListScreen", "ChatRoomScreen", "Lcom/likelion/liontalk/ui/theme/navigation/Screen$ChatRoomListScreen;", "Lcom/likelion/liontalk/ui/theme/navigation/Screen$ChatRoomScreen;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    
    private Screen(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/likelion/liontalk/ui/theme/navigation/Screen$ChatRoomListScreen;", "Lcom/likelion/liontalk/ui/theme/navigation/Screen;", "<init>", "()V", "app_debug"})
    public static final class ChatRoomListScreen extends com.likelion.liontalk.ui.theme.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.likelion.liontalk.ui.theme.navigation.Screen.ChatRoomListScreen INSTANCE = null;
        
        private ChatRoomListScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2 = {"Lcom/likelion/liontalk/ui/theme/navigation/Screen$ChatRoomScreen;", "Lcom/likelion/liontalk/ui/theme/navigation/Screen;", "<init>", "()V", "createRoute", "", "roomId", "", "app_debug"})
    public static final class ChatRoomScreen extends com.likelion.liontalk.ui.theme.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.likelion.liontalk.ui.theme.navigation.Screen.ChatRoomScreen INSTANCE = null;
        
        private ChatRoomScreen() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String createRoute(int roomId) {
            return null;
        }
    }
}