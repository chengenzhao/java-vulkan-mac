// Generated by jextract

package org.vulkan;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct StdVideoAV1LoopFilter {
 *     StdVideoAV1LoopFilterFlags flags;
 *     uint8_t loop_filter_level[4];
 *     uint8_t loop_filter_sharpness;
 *     uint8_t update_ref_delta;
 *     int8_t loop_filter_ref_deltas[8];
 *     uint8_t update_mode_delta;
 *     int8_t loop_filter_mode_deltas[2];
 * }
 * }
 */
public class StdVideoAV1LoopFilter {

    StdVideoAV1LoopFilter() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        StdVideoAV1LoopFilterFlags.layout().withName("flags"),
        MemoryLayout.sequenceLayout(4, vulkan_h.C_CHAR).withName("loop_filter_level"),
        vulkan_h.C_CHAR.withName("loop_filter_sharpness"),
        vulkan_h.C_CHAR.withName("update_ref_delta"),
        MemoryLayout.sequenceLayout(8, vulkan_h.C_CHAR).withName("loop_filter_ref_deltas"),
        vulkan_h.C_CHAR.withName("update_mode_delta"),
        MemoryLayout.sequenceLayout(2, vulkan_h.C_CHAR).withName("loop_filter_mode_deltas"),
        MemoryLayout.paddingLayout(3)
    ).withName("StdVideoAV1LoopFilter");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout flags$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * StdVideoAV1LoopFilterFlags flags
     * }
     */
    public static final GroupLayout flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoAV1LoopFilterFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoAV1LoopFilterFlags flags
     * }
     */
    public static MemorySegment flags(MemorySegment struct) {
        return struct.asSlice(flags$OFFSET, flags$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoAV1LoopFilterFlags flags
     * }
     */
    public static void flags(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, flags$OFFSET, flags$LAYOUT.byteSize());
    }

    private static final SequenceLayout loop_filter_level$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("loop_filter_level"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t loop_filter_level[4]
     * }
     */
    public static final SequenceLayout loop_filter_level$layout() {
        return loop_filter_level$LAYOUT;
    }

    private static final long loop_filter_level$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t loop_filter_level[4]
     * }
     */
    public static final long loop_filter_level$offset() {
        return loop_filter_level$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t loop_filter_level[4]
     * }
     */
    public static MemorySegment loop_filter_level(MemorySegment struct) {
        return struct.asSlice(loop_filter_level$OFFSET, loop_filter_level$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t loop_filter_level[4]
     * }
     */
    public static void loop_filter_level(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, loop_filter_level$OFFSET, loop_filter_level$LAYOUT.byteSize());
    }

    private static long[] loop_filter_level$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t loop_filter_level[4]
     * }
     */
    public static long[] loop_filter_level$dimensions() {
        return loop_filter_level$DIMS;
    }
    private static final VarHandle loop_filter_level$ELEM_HANDLE = loop_filter_level$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t loop_filter_level[4]
     * }
     */
    public static byte loop_filter_level(MemorySegment struct, long index0) {
        return (byte)loop_filter_level$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t loop_filter_level[4]
     * }
     */
    public static void loop_filter_level(MemorySegment struct, long index0, byte fieldValue) {
        loop_filter_level$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfByte loop_filter_sharpness$LAYOUT = (OfByte)$LAYOUT.select(groupElement("loop_filter_sharpness"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t loop_filter_sharpness
     * }
     */
    public static final OfByte loop_filter_sharpness$layout() {
        return loop_filter_sharpness$LAYOUT;
    }

    private static final long loop_filter_sharpness$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t loop_filter_sharpness
     * }
     */
    public static final long loop_filter_sharpness$offset() {
        return loop_filter_sharpness$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t loop_filter_sharpness
     * }
     */
    public static byte loop_filter_sharpness(MemorySegment struct) {
        return struct.get(loop_filter_sharpness$LAYOUT, loop_filter_sharpness$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t loop_filter_sharpness
     * }
     */
    public static void loop_filter_sharpness(MemorySegment struct, byte fieldValue) {
        struct.set(loop_filter_sharpness$LAYOUT, loop_filter_sharpness$OFFSET, fieldValue);
    }

    private static final OfByte update_ref_delta$LAYOUT = (OfByte)$LAYOUT.select(groupElement("update_ref_delta"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t update_ref_delta
     * }
     */
    public static final OfByte update_ref_delta$layout() {
        return update_ref_delta$LAYOUT;
    }

    private static final long update_ref_delta$OFFSET = 9;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t update_ref_delta
     * }
     */
    public static final long update_ref_delta$offset() {
        return update_ref_delta$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t update_ref_delta
     * }
     */
    public static byte update_ref_delta(MemorySegment struct) {
        return struct.get(update_ref_delta$LAYOUT, update_ref_delta$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t update_ref_delta
     * }
     */
    public static void update_ref_delta(MemorySegment struct, byte fieldValue) {
        struct.set(update_ref_delta$LAYOUT, update_ref_delta$OFFSET, fieldValue);
    }

    private static final SequenceLayout loop_filter_ref_deltas$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("loop_filter_ref_deltas"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int8_t loop_filter_ref_deltas[8]
     * }
     */
    public static final SequenceLayout loop_filter_ref_deltas$layout() {
        return loop_filter_ref_deltas$LAYOUT;
    }

    private static final long loop_filter_ref_deltas$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int8_t loop_filter_ref_deltas[8]
     * }
     */
    public static final long loop_filter_ref_deltas$offset() {
        return loop_filter_ref_deltas$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int8_t loop_filter_ref_deltas[8]
     * }
     */
    public static MemorySegment loop_filter_ref_deltas(MemorySegment struct) {
        return struct.asSlice(loop_filter_ref_deltas$OFFSET, loop_filter_ref_deltas$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int8_t loop_filter_ref_deltas[8]
     * }
     */
    public static void loop_filter_ref_deltas(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, loop_filter_ref_deltas$OFFSET, loop_filter_ref_deltas$LAYOUT.byteSize());
    }

    private static long[] loop_filter_ref_deltas$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * int8_t loop_filter_ref_deltas[8]
     * }
     */
    public static long[] loop_filter_ref_deltas$dimensions() {
        return loop_filter_ref_deltas$DIMS;
    }
    private static final VarHandle loop_filter_ref_deltas$ELEM_HANDLE = loop_filter_ref_deltas$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * int8_t loop_filter_ref_deltas[8]
     * }
     */
    public static byte loop_filter_ref_deltas(MemorySegment struct, long index0) {
        return (byte)loop_filter_ref_deltas$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * int8_t loop_filter_ref_deltas[8]
     * }
     */
    public static void loop_filter_ref_deltas(MemorySegment struct, long index0, byte fieldValue) {
        loop_filter_ref_deltas$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfByte update_mode_delta$LAYOUT = (OfByte)$LAYOUT.select(groupElement("update_mode_delta"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t update_mode_delta
     * }
     */
    public static final OfByte update_mode_delta$layout() {
        return update_mode_delta$LAYOUT;
    }

    private static final long update_mode_delta$OFFSET = 18;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t update_mode_delta
     * }
     */
    public static final long update_mode_delta$offset() {
        return update_mode_delta$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t update_mode_delta
     * }
     */
    public static byte update_mode_delta(MemorySegment struct) {
        return struct.get(update_mode_delta$LAYOUT, update_mode_delta$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t update_mode_delta
     * }
     */
    public static void update_mode_delta(MemorySegment struct, byte fieldValue) {
        struct.set(update_mode_delta$LAYOUT, update_mode_delta$OFFSET, fieldValue);
    }

    private static final SequenceLayout loop_filter_mode_deltas$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("loop_filter_mode_deltas"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int8_t loop_filter_mode_deltas[2]
     * }
     */
    public static final SequenceLayout loop_filter_mode_deltas$layout() {
        return loop_filter_mode_deltas$LAYOUT;
    }

    private static final long loop_filter_mode_deltas$OFFSET = 19;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int8_t loop_filter_mode_deltas[2]
     * }
     */
    public static final long loop_filter_mode_deltas$offset() {
        return loop_filter_mode_deltas$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int8_t loop_filter_mode_deltas[2]
     * }
     */
    public static MemorySegment loop_filter_mode_deltas(MemorySegment struct) {
        return struct.asSlice(loop_filter_mode_deltas$OFFSET, loop_filter_mode_deltas$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int8_t loop_filter_mode_deltas[2]
     * }
     */
    public static void loop_filter_mode_deltas(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, loop_filter_mode_deltas$OFFSET, loop_filter_mode_deltas$LAYOUT.byteSize());
    }

    private static long[] loop_filter_mode_deltas$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * int8_t loop_filter_mode_deltas[2]
     * }
     */
    public static long[] loop_filter_mode_deltas$dimensions() {
        return loop_filter_mode_deltas$DIMS;
    }
    private static final VarHandle loop_filter_mode_deltas$ELEM_HANDLE = loop_filter_mode_deltas$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * int8_t loop_filter_mode_deltas[2]
     * }
     */
    public static byte loop_filter_mode_deltas(MemorySegment struct, long index0) {
        return (byte)loop_filter_mode_deltas$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * int8_t loop_filter_mode_deltas[2]
     * }
     */
    public static void loop_filter_mode_deltas(MemorySegment struct, long index0, byte fieldValue) {
        loop_filter_mode_deltas$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

