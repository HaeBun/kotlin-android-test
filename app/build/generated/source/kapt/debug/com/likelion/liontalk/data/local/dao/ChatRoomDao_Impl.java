package com.likelion.liontalk.data.local.dao;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import com.likelion.liontalk.data.local.converter.Converter;
import com.likelion.liontalk.data.local.entity.ChatRoomEntity;
import com.likelion.liontalk.model.ChatUser;
import java.lang.Class;
import java.lang.Integer;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class ChatRoomDao_Impl implements ChatRoomDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<ChatRoomEntity> __insertAdapterOfChatRoomEntity;

  private final Converter __converter = new Converter();

  private final EntityDeleteOrUpdateAdapter<ChatRoomEntity> __deleteAdapterOfChatRoomEntity;

  public ChatRoomDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfChatRoomEntity = new EntityInsertAdapter<ChatRoomEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `chat_room` (`id`,`title`,`owner`,`users`,`createdAt`) VALUES (?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final ChatRoomEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getTitle());
        }
        final String _tmp = __converter.fromUser(entity.getOwner());
        if (_tmp == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, _tmp);
        }
        final String _tmp_1 = __converter.fromUserList(entity.getUsers());
        if (_tmp_1 == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, _tmp_1);
        }
        statement.bindLong(5, entity.getCreatedAt());
      }
    };
    this.__deleteAdapterOfChatRoomEntity = new EntityDeleteOrUpdateAdapter<ChatRoomEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `chat_room` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final ChatRoomEntity entity) {
        statement.bindLong(1, entity.getId());
      }
    };
  }

  @Override
  public Object insert(final ChatRoomEntity chatroom, final Continuation<? super Unit> arg1) {
    if (chatroom == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfChatRoomEntity.insert(_connection, chatroom);
      return Unit.INSTANCE;
    }, arg1);
  }

  @Override
  public void insertAll(final List<ChatRoomEntity> chatRooms) {
    if (chatRooms == null) throw new NullPointerException();
    DBUtil.performBlocking(__db, false, true, (_connection) -> {
      __insertAdapterOfChatRoomEntity.insert(_connection, chatRooms);
      return null;
    });
  }

  @Override
  public Object delete(final ChatRoomEntity chatroom, final Continuation<? super Unit> arg1) {
    if (chatroom == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __deleteAdapterOfChatRoomEntity.handle(_connection, chatroom);
      return Unit.INSTANCE;
    }, arg1);
  }

  @Override
  public LiveData<List<ChatRoomEntity>> getChatRooms() {
    final String _sql = "SELECT * FROM chat_room ORDER BY id desc";
    return __db.getInvalidationTracker().createLiveData(new String[] {"chat_room"}, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
        final int _columnIndexOfOwner = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "owner");
        final int _columnIndexOfUsers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "users");
        final int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "createdAt");
        final List<ChatRoomEntity> _result = new ArrayList<ChatRoomEntity>();
        while (_stmt.step()) {
          final ChatRoomEntity _item;
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpTitle;
          if (_stmt.isNull(_columnIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _stmt.getText(_columnIndexOfTitle);
          }
          final ChatUser _tmpOwner;
          final String _tmp;
          if (_stmt.isNull(_columnIndexOfOwner)) {
            _tmp = null;
          } else {
            _tmp = _stmt.getText(_columnIndexOfOwner);
          }
          _tmpOwner = __converter.toUser(_tmp);
          final List<ChatUser> _tmpUsers;
          final String _tmp_1;
          if (_stmt.isNull(_columnIndexOfUsers)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _stmt.getText(_columnIndexOfUsers);
          }
          _tmpUsers = __converter.toUserList(_tmp_1);
          final long _tmpCreatedAt;
          _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
          _item = new ChatRoomEntity(_tmpId,_tmpTitle,_tmpOwner,_tmpUsers,_tmpCreatedAt);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public ChatRoomEntity getChatRoom(final int id) {
    final String _sql = "SELECT * FROM chat_room WHERE id=?";
    return DBUtil.performBlocking(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
        final int _columnIndexOfOwner = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "owner");
        final int _columnIndexOfUsers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "users");
        final int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "createdAt");
        final ChatRoomEntity _result;
        if (_stmt.step()) {
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpTitle;
          if (_stmt.isNull(_columnIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _stmt.getText(_columnIndexOfTitle);
          }
          final ChatUser _tmpOwner;
          final String _tmp;
          if (_stmt.isNull(_columnIndexOfOwner)) {
            _tmp = null;
          } else {
            _tmp = _stmt.getText(_columnIndexOfOwner);
          }
          _tmpOwner = __converter.toUser(_tmp);
          final List<ChatUser> _tmpUsers;
          final String _tmp_1;
          if (_stmt.isNull(_columnIndexOfUsers)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _stmt.getText(_columnIndexOfUsers);
          }
          _tmpUsers = __converter.toUserList(_tmp_1);
          final long _tmpCreatedAt;
          _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
          _result = new ChatRoomEntity(_tmpId,_tmpTitle,_tmpOwner,_tmpUsers,_tmpCreatedAt);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Object getCount(final Continuation<? super Integer> arg0) {
    final String _sql = "SELECT COUNT(*) FROM chat_room";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final Integer _result;
        if (_stmt.step()) {
          final Integer _tmp;
          if (_stmt.isNull(0)) {
            _tmp = null;
          } else {
            _tmp = (int) (_stmt.getLong(0));
          }
          _result = _tmp;
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, arg0);
  }

  @Override
  public Object clear(final Continuation<? super Unit> arg0) {
    final String _sql = "DELETE FROM chat_room";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, arg0);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
