// automatically generated by the FlatBuffers compiler, do not modify

package ecpack;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class T_EC_GET_OFFLINE_CNT_RS extends Table {
  public static T_EC_GET_OFFLINE_CNT_RS getRootAsT_EC_GET_OFFLINE_CNT_RS(ByteBuffer _bb) { return getRootAsT_EC_GET_OFFLINE_CNT_RS(_bb, new T_EC_GET_OFFLINE_CNT_RS()); }
  public static T_EC_GET_OFFLINE_CNT_RS getRootAsT_EC_GET_OFFLINE_CNT_RS(ByteBuffer _bb, T_EC_GET_OFFLINE_CNT_RS obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public T_EC_GET_OFFLINE_CNT_RS __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public commonpack.S_RS_HEAD sRsHead() { return sRsHead(new commonpack.S_RS_HEAD()); }
  public commonpack.S_RS_HEAD sRsHead(commonpack.S_RS_HEAD obj) { int o = __offset(4); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }
  public ecpack.T_ECOFFLINECNT_INFO bidWithcntList(int j) { return bidWithcntList(new ecpack.T_ECOFFLINECNT_INFO(), j); }
  public ecpack.T_ECOFFLINECNT_INFO bidWithcntList(ecpack.T_ECOFFLINECNT_INFO obj, int j) { int o = __offset(6); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int bidWithcntListLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }

  public static void startT_EC_GET_OFFLINE_CNT_RS(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addSRsHead(FlatBufferBuilder builder, int sRsHeadOffset) { builder.addStruct(0, sRsHeadOffset, 0); }
  public static void addBidWithcntList(FlatBufferBuilder builder, int bidWithcntListOffset) { builder.addOffset(1, bidWithcntListOffset, 0); }
  public static int createBidWithcntListVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startBidWithcntListVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endT_EC_GET_OFFLINE_CNT_RS(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishT_EC_GET_OFFLINE_CNT_RSBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
}
