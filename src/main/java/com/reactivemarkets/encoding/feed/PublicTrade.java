/*
 * Copyright (C) 2020 Reactive Markets Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.reactivemarkets.encoding.feed;

import java.nio.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class PublicTrade extends Table {
  public static PublicTrade getRootAsPublicTrade(ByteBuffer _bb) { return getRootAsPublicTrade(_bb, new PublicTrade()); }
  public static PublicTrade getRootAsPublicTrade(ByteBuffer _bb, PublicTrade obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public PublicTrade __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long sourceTs() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public String source() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer sourceAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer sourceInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public String market() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer marketAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer marketInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public int feedId() { int o = __offset(10); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String tradeId() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer tradeIdAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer tradeIdInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }
  public int flags() { int o = __offset(14); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public short side() { int o = __offset(16); return o != 0 ? bb.getShort(o + bb_pos) : 0; }
  public double qty() { int o = __offset(18); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public double price() { int o = __offset(20); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public String execVenue() { int o = __offset(22); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer execVenueAsByteBuffer() { return __vector_as_bytebuffer(22, 1); }
  public ByteBuffer execVenueInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 22, 1); }

  public static int createPublicTrade(FlatBufferBuilder builder,
      long source_ts,
      int sourceOffset,
      int marketOffset,
      int feed_id,
      int trade_idOffset,
      int flags,
      short side,
      double qty,
      double price,
      int exec_venueOffset) {
    builder.startObject(10);
    PublicTrade.addPrice(builder, price);
    PublicTrade.addQty(builder, qty);
    PublicTrade.addSourceTs(builder, source_ts);
    PublicTrade.addExecVenue(builder, exec_venueOffset);
    PublicTrade.addTradeId(builder, trade_idOffset);
    PublicTrade.addFeedId(builder, feed_id);
    PublicTrade.addMarket(builder, marketOffset);
    PublicTrade.addSource(builder, sourceOffset);
    PublicTrade.addSide(builder, side);
    PublicTrade.addFlags(builder, flags);
    return PublicTrade.endPublicTrade(builder);
  }

  public static void startPublicTrade(FlatBufferBuilder builder) { builder.startObject(10); }
  public static void addSourceTs(FlatBufferBuilder builder, long sourceTs) { builder.addLong(0, sourceTs, 0L); }
  public static void addSource(FlatBufferBuilder builder, int sourceOffset) { builder.addOffset(1, sourceOffset, 0); }
  public static void addMarket(FlatBufferBuilder builder, int marketOffset) { builder.addOffset(2, marketOffset, 0); }
  public static void addFeedId(FlatBufferBuilder builder, int feedId) { builder.addInt(3, feedId, 0); }
  public static void addTradeId(FlatBufferBuilder builder, int tradeIdOffset) { builder.addOffset(4, tradeIdOffset, 0); }
  public static void addFlags(FlatBufferBuilder builder, int flags) { builder.addShort(5, (short)flags, (short)0); }
  public static void addSide(FlatBufferBuilder builder, short side) { builder.addShort(6, side, 0); }
  public static void addQty(FlatBufferBuilder builder, double qty) { builder.addDouble(7, qty, 0.0); }
  public static void addPrice(FlatBufferBuilder builder, double price) { builder.addDouble(8, price, 0.0); }
  public static void addExecVenue(FlatBufferBuilder builder, int execVenueOffset) { builder.addOffset(9, execVenueOffset, 0); }
  public static int endPublicTrade(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 8);  // market
    return o;
  }
}
