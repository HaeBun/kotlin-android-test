package com.likelion.liontalk.data.local;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.likelion.liontalk.data.local.dao.ChatMessageDao;
import com.likelion.liontalk.data.local.dao.ChatMessageDao_Impl;
import com.likelion.liontalk.data.local.dao.ChatRoomDao;
import com.likelion.liontalk.data.local.dao.ChatRoomDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ChatRoomDao _chatRoomDao;

  private volatile ChatMessageDao _chatMessageDao;

  @Override
  @NonNull
  protected RoomOpenDelegate createOpenDelegate() {
    final RoomOpenDelegate _openDelegate = new RoomOpenDelegate(11, "99b96a5a6a4d9cb913d3d00b7aeaf197", "f7adb3247e8043b2f25b02240aaf1f8f") {
      @Override
      public void createAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `chat_room` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `owner` TEXT NOT NULL, `users` TEXT NOT NULL, `unReadCount` INTEGER NOT NULL, `lastReadMessageId` INTEGER NOT NULL, `isLocked` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `chat_message` (`id` INTEGER NOT NULL, `roomId` INTEGER NOT NULL, `sender` TEXT NOT NULL, `content` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '99b96a5a6a4d9cb913d3d00b7aeaf197')");
      }

      @Override
      public void dropAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `chat_room`");
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `chat_message`");
      }

      @Override
      public void onCreate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      public void onOpen(@NonNull final SQLiteConnection connection) {
        internalInitInvalidationTracker(connection);
      }

      @Override
      public void onPreMigrate(@NonNull final SQLiteConnection connection) {
        DBUtil.dropFtsSyncTriggers(connection);
      }

      @Override
      public void onPostMigrate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      @NonNull
      public RoomOpenDelegate.ValidationResult onValidateSchema(
          @NonNull final SQLiteConnection connection) {
        final Map<String, TableInfo.Column> _columnsChatRoom = new HashMap<String, TableInfo.Column>(8);
        _columnsChatRoom.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatRoom.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatRoom.put("owner", new TableInfo.Column("owner", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatRoom.put("users", new TableInfo.Column("users", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatRoom.put("unReadCount", new TableInfo.Column("unReadCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatRoom.put("lastReadMessageId", new TableInfo.Column("lastReadMessageId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatRoom.put("isLocked", new TableInfo.Column("isLocked", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatRoom.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysChatRoom = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesChatRoom = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoChatRoom = new TableInfo("chat_room", _columnsChatRoom, _foreignKeysChatRoom, _indicesChatRoom);
        final TableInfo _existingChatRoom = TableInfo.read(connection, "chat_room");
        if (!_infoChatRoom.equals(_existingChatRoom)) {
          return new RoomOpenDelegate.ValidationResult(false, "chat_room(com.likelion.liontalk.data.local.entity.ChatRoomEntity).\n"
                  + " Expected:\n" + _infoChatRoom + "\n"
                  + " Found:\n" + _existingChatRoom);
        }
        final Map<String, TableInfo.Column> _columnsChatMessage = new HashMap<String, TableInfo.Column>(5);
        _columnsChatMessage.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatMessage.put("roomId", new TableInfo.Column("roomId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatMessage.put("sender", new TableInfo.Column("sender", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatMessage.put("content", new TableInfo.Column("content", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatMessage.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysChatMessage = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesChatMessage = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoChatMessage = new TableInfo("chat_message", _columnsChatMessage, _foreignKeysChatMessage, _indicesChatMessage);
        final TableInfo _existingChatMessage = TableInfo.read(connection, "chat_message");
        if (!_infoChatMessage.equals(_existingChatMessage)) {
          return new RoomOpenDelegate.ValidationResult(false, "chat_message(com.likelion.liontalk.data.local.entity.ChatMessageEntity).\n"
                  + " Expected:\n" + _infoChatMessage + "\n"
                  + " Found:\n" + _existingChatMessage);
        }
        return new RoomOpenDelegate.ValidationResult(true, null);
      }
    };
    return _openDelegate;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final Map<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final Map<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "chat_room", "chat_message");
  }

  @Override
  public void clearAllTables() {
    super.performClear(false, "chat_room", "chat_message");
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final Map<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ChatRoomDao.class, ChatRoomDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ChatMessageDao.class, ChatMessageDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final Set<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public ChatRoomDao chatRoomDao() {
    if (_chatRoomDao != null) {
      return _chatRoomDao;
    } else {
      synchronized(this) {
        if(_chatRoomDao == null) {
          _chatRoomDao = new ChatRoomDao_Impl(this);
        }
        return _chatRoomDao;
      }
    }
  }

  @Override
  public ChatMessageDao chatMessageDao() {
    if (_chatMessageDao != null) {
      return _chatMessageDao;
    } else {
      synchronized(this) {
        if(_chatMessageDao == null) {
          _chatMessageDao = new ChatMessageDao_Impl(this);
        }
        return _chatMessageDao;
      }
    }
  }
}
