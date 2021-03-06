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
public final class MDLevel2 extends Struct {
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public MDLevel2 __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public double qty() { return bb.getDouble(bb_pos + 0); }
  public double price() { return bb.getDouble(bb_pos + 8); }

  public static int createMDLevel2(FlatBufferBuilder builder, double qty, double price) {
    builder.prep(8, 16);
    builder.putDouble(price);
    builder.putDouble(qty);
    return builder.offset();
  }
}
