// automatically generated by the FlatBuffers compiler, do not modify

package friendpack;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class T_FRIEND_DEL_RQ extends Table {
  public static T_FRIEND_DEL_RQ getRootAsT_FRIEND_DEL_RQ(ByteBuffer _bb) { return getRootAsT_FRIEND_DEL_RQ(_bb, new T_FRIEND_DEL_RQ()); }
  public static T_FRIEND_DEL_RQ getRootAsT_FRIEND_DEL_RQ(ByteBuffer _bb, T_FRIEND_DEL_RQ obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public T_FRIEND_DEL_RQ __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public commonpack.S_RQ_HEAD sRqHead() { return sRqHead(new commonpack.S_RQ_HEAD()); }
  public commonpack.S_RQ_HEAD sRqHead(commonpack.S_RQ_HEAD obj) { int o = __offset(4); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }
  public String ownNickname() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer ownNicknameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public long peerUserId() { int o = __offset(8); return o != 0 ? bb.getLong(o + bb_pos) : 0; }

  public static void startT_FRIEND_DEL_RQ(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addSRqHead(FlatBufferBuilder builder, int sRqHeadOffset) { builder.addStruct(0, sRqHeadOffset, 0); }
  public static void addOwnNickname(FlatBufferBuilder builder, int ownNicknameOffset) { builder.addOffset(1, ownNicknameOffset, 0); }
  public static void addPeerUserId(FlatBufferBuilder builder, long peerUserId) { builder.addLong(2, peerUserId, 0); }
  public static int endT_FRIEND_DEL_RQ(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishT_FRIEND_DEL_RQBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
}

