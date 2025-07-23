package com.likelion.liontalk.data.local.converter;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0016\u0010\u000f\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/likelion/liontalk/data/local/converter/Converter;", "", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "fromStringList", "", "value", "", "toStringList", "fromUser", "Lcom/likelion/liontalk/model/ChatUser;", "toUser", "toUserList", "fromUserList", "app_debug"})
public final class Converter {
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    
    public Converter() {
        super();
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String fromStringList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> toStringList(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String fromUser(@org.jetbrains.annotations.NotNull()
    com.likelion.liontalk.model.ChatUser value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final com.likelion.liontalk.model.ChatUser toUser(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.likelion.liontalk.model.ChatUser> toUserList(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String fromUserList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.likelion.liontalk.model.ChatUser> value) {
        return null;
    }
}