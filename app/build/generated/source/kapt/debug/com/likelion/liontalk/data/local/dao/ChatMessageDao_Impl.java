package com.likelion.liontalk.data.local.dao;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import com.likelion.liontalk.data.local.converter.Converter;
import com.likelion.liontalk.data.local.entity.ChatMessageEntity;
import com.likelion.liontalk.model.ChatUser;
import java.lang.Class;
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
public final class ChatMessageDao_Impl implements ChatMessageDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<ChatMessageEntity> __insertAdapterOfChatMessageEntity;

  private final Converter __converter = new Converter();

  public ChatMessageDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfChatMessageEntity = new EntityInsertAdapter<ChatMessageEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `chat_message` (`id`,`roomId`,`sender`,`content`,`createdAt`) VALUES (?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final ChatMessageEntity entity) {
        statement.bindLong(1, entity.getId());
        statement.bindLong(2, entity.getRoomId());
        final String _tmp = __converter.fromUser(entity.getSender());
        if (_tmp == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, _tmp);
        }
        if (entity.getContent() == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, entity.getContent());
        }
        statement.bindLong(5, entity.getCreatedAt());
      }
    };
  }

  @Override
  public Object insert(final ChatMessageEntity message,
      final Continuation<? super Unit> $completion) {
    if (message == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfChatMessageEntity.insert(_connection, message);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public LiveData<List<ChatMessageEntity>> getMessagesForRoom(final int roomId) {
    final String _sql = "SELECT * FROM chat_message WHERE roomId = ? ORDER BY id ASC";
    return __db.getInvalidationTracker().createLiveData(new String[] {"chat_message"}, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, roomId);
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfRoomId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "roomId");
        final int _columnIndexOfSender = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sender");
        final int _columnIndexOfContent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "content");
        final int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "createdAt");
        final List<ChatMessageEntity> _result = new ArrayList<ChatMessageEntity>();
        while (_stmt.step()) {
          final ChatMessageEntity _item;
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final int _tmpRoomId;
          _tmpRoomId = (int) (_stmt.getLong(_columnIndexOfRoomId));
          final ChatUser _tmpSender;
          final String _tmp;
          if (_stmt.isNull(_columnIndexOfSender)) {
            _tmp = null;
          } else {
            _tmp = _stmt.getText(_columnIndexOfSender);
          }
          _tmpSender = __converter.toUser(_tmp);
          final String _tmpContent;
          if (_stmt.isNull(_columnIndexOfContent)) {
            _tmpContent = null;
          } else {
            _tmpContent = _stmt.getText(_columnIndexOfContent);
          }
          final long _tmpCreatedAt;
          _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
          _item = new ChatMessageEntity(_tmpId,_tmpRoomId,_tmpSender,_tmpContent,_tmpCreatedAt);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Flow<List<ChatMessageEntity>> getMessagesForRoomFlow(final int roomId) {
    final String _sql = "SELECT * FROM chat_message WHERE roomId = ? ORDER BY id ASC";
    return FlowUtil.createFlow(__db, false, new String[] {"chat_message"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, roomId);
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfRoomId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "roomId");
        final int _columnIndexOfSender = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sender");
        final int _columnIndexOfContent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "content");
        final int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "createdAt");
        final List<ChatMessageEntity> _result = new ArrayList<ChatMessageEntity>();
        while (_stmt.step()) {
          final ChatMessageEntity _item;
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final int _tmpRoomId;
          _tmpRoomId = (int) (_stmt.getLong(_columnIndexOfRoomId));
          final ChatUser _tmpSender;
          final String _tmp;
          if (_stmt.isNull(_columnIndexOfSender)) {
            _tmp = null;
          } else {
            _tmp = _stmt.getText(_columnIndexOfSender);
          }
          _tmpSender = __converter.toUser(_tmp);
          final String _tmpContent;
          if (_stmt.isNull(_columnIndexOfContent)) {
            _tmpContent = null;
          } else {
            _tmpContent = _stmt.getText(_columnIndexOfContent);
          }
          final long _tmpCreatedAt;
          _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
          _item = new ChatMessageEntity(_tmpId,_tmpRoomId,_tmpSender,_tmpContent,_tmpCreatedAt);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Object getMessages(final int roomId,
      final Continuation<? super List<ChatMessageEntity>> $completion) {
    final String _sql = "SELECT * FROM chat_message WHERE roomId =?";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, roomId);
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfRoomId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "roomId");
        final int _columnIndexOfSender = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sender");
        final int _columnIndexOfContent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "content");
        final int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "createdAt");
        final List<ChatMessageEntity> _result = new ArrayList<ChatMessageEntity>();
        while (_stmt.step()) {
          final ChatMessageEntity _item;
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final int _tmpRoomId;
          _tmpRoomId = (int) (_stmt.getLong(_columnIndexOfRoomId));
          final ChatUser _tmpSender;
          final String _tmp;
          if (_stmt.isNull(_columnIndexOfSender)) {
            _tmp = null;
          } else {
            _tmp = _stmt.getText(_columnIndexOfSender);
          }
          _tmpSender = __converter.toUser(_tmp);
          final String _tmpContent;
          if (_stmt.isNull(_columnIndexOfContent)) {
            _tmpContent = null;
          } else {
            _tmpContent = _stmt.getText(_columnIndexOfContent);
          }
          final long _tmpCreatedAt;
          _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
          _item = new ChatMessageEntity(_tmpId,_tmpRoomId,_tmpSender,_tmpContent,_tmpCreatedAt);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object clear(final Continuation<? super Unit> $completion) {
    final String _sql = "DELETE FROM chat_message";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
