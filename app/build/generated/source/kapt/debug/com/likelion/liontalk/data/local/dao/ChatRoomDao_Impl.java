package com.likelion.liontalk.data.local.dao;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
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
import kotlinx.coroutines.flow.Flow;

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
        return "INSERT OR REPLACE INTO `chat_room` (`id`,`title`,`owner`,`users`,`unReadCount`,`lastReadMessageId`,`isLocked`,`createdAt`) VALUES (?,?,?,?,?,?,?,?)";
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
        statement.bindLong(5, entity.getUnReadCount());
        statement.bindLong(6, entity.getLastReadMessageId());
        final int _tmp_2 = entity.isLocked() ? 1 : 0;
        statement.bindLong(7, _tmp_2);
        statement.bindLong(8, entity.getCreatedAt());
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
        final int _columnIndexOfUnReadCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "unReadCount");
        final int _columnIndexOfLastReadMessageId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReadMessageId");
        final int _columnIndexOfIsLocked = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isLocked");
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
          final int _tmpUnReadCount;
          _tmpUnReadCount = (int) (_stmt.getLong(_columnIndexOfUnReadCount));
          final int _tmpLastReadMessageId;
          _tmpLastReadMessageId = (int) (_stmt.getLong(_columnIndexOfLastReadMessageId));
          final boolean _tmpIsLocked;
          final int _tmp_2;
          _tmp_2 = (int) (_stmt.getLong(_columnIndexOfIsLocked));
          _tmpIsLocked = _tmp_2 != 0;
          final long _tmpCreatedAt;
          _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
          _item = new ChatRoomEntity(_tmpId,_tmpTitle,_tmpOwner,_tmpUsers,_tmpUnReadCount,_tmpLastReadMessageId,_tmpIsLocked,_tmpCreatedAt);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public List<ChatRoomEntity> getChatRoomsList() {
    final String _sql = "SELECT * FROM chat_room ORDER BY id desc";
    return DBUtil.performBlocking(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
        final int _columnIndexOfOwner = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "owner");
        final int _columnIndexOfUsers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "users");
        final int _columnIndexOfUnReadCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "unReadCount");
        final int _columnIndexOfLastReadMessageId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReadMessageId");
        final int _columnIndexOfIsLocked = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isLocked");
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
          final int _tmpUnReadCount;
          _tmpUnReadCount = (int) (_stmt.getLong(_columnIndexOfUnReadCount));
          final int _tmpLastReadMessageId;
          _tmpLastReadMessageId = (int) (_stmt.getLong(_columnIndexOfLastReadMessageId));
          final boolean _tmpIsLocked;
          final int _tmp_2;
          _tmp_2 = (int) (_stmt.getLong(_columnIndexOfIsLocked));
          _tmpIsLocked = _tmp_2 != 0;
          final long _tmpCreatedAt;
          _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
          _item = new ChatRoomEntity(_tmpId,_tmpTitle,_tmpOwner,_tmpUsers,_tmpUnReadCount,_tmpLastReadMessageId,_tmpIsLocked,_tmpCreatedAt);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Flow<List<ChatRoomEntity>> getChatRoomsFlow() {
    final String _sql = "SELECT * FROM chat_room ORDER BY id desc";
    return FlowUtil.createFlow(__db, false, new String[] {"chat_room"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
        final int _columnIndexOfOwner = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "owner");
        final int _columnIndexOfUsers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "users");
        final int _columnIndexOfUnReadCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "unReadCount");
        final int _columnIndexOfLastReadMessageId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReadMessageId");
        final int _columnIndexOfIsLocked = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isLocked");
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
          final int _tmpUnReadCount;
          _tmpUnReadCount = (int) (_stmt.getLong(_columnIndexOfUnReadCount));
          final int _tmpLastReadMessageId;
          _tmpLastReadMessageId = (int) (_stmt.getLong(_columnIndexOfLastReadMessageId));
          final boolean _tmpIsLocked;
          final int _tmp_2;
          _tmp_2 = (int) (_stmt.getLong(_columnIndexOfIsLocked));
          _tmpIsLocked = _tmp_2 != 0;
          final long _tmpCreatedAt;
          _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
          _item = new ChatRoomEntity(_tmpId,_tmpTitle,_tmpOwner,_tmpUsers,_tmpUnReadCount,_tmpLastReadMessageId,_tmpIsLocked,_tmpCreatedAt);
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
        final int _columnIndexOfUnReadCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "unReadCount");
        final int _columnIndexOfLastReadMessageId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReadMessageId");
        final int _columnIndexOfIsLocked = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isLocked");
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
          final int _tmpUnReadCount;
          _tmpUnReadCount = (int) (_stmt.getLong(_columnIndexOfUnReadCount));
          final int _tmpLastReadMessageId;
          _tmpLastReadMessageId = (int) (_stmt.getLong(_columnIndexOfLastReadMessageId));
          final boolean _tmpIsLocked;
          final int _tmp_2;
          _tmp_2 = (int) (_stmt.getLong(_columnIndexOfIsLocked));
          _tmpIsLocked = _tmp_2 != 0;
          final long _tmpCreatedAt;
          _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
          _result = new ChatRoomEntity(_tmpId,_tmpTitle,_tmpOwner,_tmpUsers,_tmpUnReadCount,_tmpLastReadMessageId,_tmpIsLocked,_tmpCreatedAt);
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
  public Flow<ChatRoomEntity> getChatRoomFlow(final int id) {
    final String _sql = "SELECT * FROM chat_room WHERE id=?";
    return FlowUtil.createFlow(__db, false, new String[] {"chat_room"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
        final int _columnIndexOfOwner = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "owner");
        final int _columnIndexOfUsers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "users");
        final int _columnIndexOfUnReadCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "unReadCount");
        final int _columnIndexOfLastReadMessageId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReadMessageId");
        final int _columnIndexOfIsLocked = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isLocked");
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
          final int _tmpUnReadCount;
          _tmpUnReadCount = (int) (_stmt.getLong(_columnIndexOfUnReadCount));
          final int _tmpLastReadMessageId;
          _tmpLastReadMessageId = (int) (_stmt.getLong(_columnIndexOfLastReadMessageId));
          final boolean _tmpIsLocked;
          final int _tmp_2;
          _tmp_2 = (int) (_stmt.getLong(_columnIndexOfIsLocked));
          _tmpIsLocked = _tmp_2 != 0;
          final long _tmpCreatedAt;
          _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
          _result = new ChatRoomEntity(_tmpId,_tmpTitle,_tmpOwner,_tmpUsers,_tmpUnReadCount,_tmpLastReadMessageId,_tmpIsLocked,_tmpCreatedAt);
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
  public Object updateUsers(final int id, final List<ChatUser> users,
      final Continuation<? super Unit> arg2) {
    final String _sql = "UPDATE chat_room SET users = ? WHERE id = ?";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        final String _tmp = __converter.fromUserList(users);
        if (_tmp == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, _tmp);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, id);
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, arg2);
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

  @Override
  public Object updateLastReadMessageId(final int id, final int lastReadMessageId,
      final Continuation<? super Unit> arg2) {
    final String _sql = "UPDATE chat_room SET lastReadMessageId =? WHERE id =?";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, lastReadMessageId);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, id);
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, arg2);
  }

  @Override
  public Object updateUnReadCount(final int id, final int unReadCount,
      final Continuation<? super Unit> arg2) {
    final String _sql = "UPDATE chat_room SET unReadCount =? WHERE id=?";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, unReadCount);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, id);
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, arg2);
  }

  @Override
  public Object updateLockStatus(final int id, final boolean isLocked,
      final Continuation<? super Unit> arg2) {
    final String _sql = "UPDATE chat_room SET isLocked = ? WHERE id=?";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        final int _tmp = isLocked ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, id);
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, arg2);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
