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
 * struct StdVideoH265ShortTermRefPicSet {
 *     StdVideoH265ShortTermRefPicSetFlags flags;
 *     uint32_t delta_idx_minus1;
 *     uint16_t use_delta_flag;
 *     uint16_t abs_delta_rps_minus1;
 *     uint16_t used_by_curr_pic_flag;
 *     uint16_t used_by_curr_pic_s0_flag;
 *     uint16_t used_by_curr_pic_s1_flag;
 *     uint16_t reserved1;
 *     uint8_t reserved2;
 *     uint8_t reserved3;
 *     uint8_t num_negative_pics;
 *     uint8_t num_positive_pics;
 *     uint16_t delta_poc_s0_minus1[16];
 *     uint16_t delta_poc_s1_minus1[16];
 * }
 * }
 */
public class StdVideoH265ShortTermRefPicSet {

    StdVideoH265ShortTermRefPicSet() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        StdVideoH265ShortTermRefPicSetFlags.layout().withName("flags"),
        vulkan_h.C_INT.withName("delta_idx_minus1"),
        vulkan_h.C_SHORT.withName("use_delta_flag"),
        vulkan_h.C_SHORT.withName("abs_delta_rps_minus1"),
        vulkan_h.C_SHORT.withName("used_by_curr_pic_flag"),
        vulkan_h.C_SHORT.withName("used_by_curr_pic_s0_flag"),
        vulkan_h.C_SHORT.withName("used_by_curr_pic_s1_flag"),
        vulkan_h.C_SHORT.withName("reserved1"),
        vulkan_h.C_CHAR.withName("reserved2"),
        vulkan_h.C_CHAR.withName("reserved3"),
        vulkan_h.C_CHAR.withName("num_negative_pics"),
        vulkan_h.C_CHAR.withName("num_positive_pics"),
        MemoryLayout.sequenceLayout(16, vulkan_h.C_SHORT).withName("delta_poc_s0_minus1"),
        MemoryLayout.sequenceLayout(16, vulkan_h.C_SHORT).withName("delta_poc_s1_minus1")
    ).withName("StdVideoH265ShortTermRefPicSet");

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
     * StdVideoH265ShortTermRefPicSetFlags flags
     * }
     */
    public static final GroupLayout flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoH265ShortTermRefPicSetFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoH265ShortTermRefPicSetFlags flags
     * }
     */
    public static MemorySegment flags(MemorySegment struct) {
        return struct.asSlice(flags$OFFSET, flags$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoH265ShortTermRefPicSetFlags flags
     * }
     */
    public static void flags(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, flags$OFFSET, flags$LAYOUT.byteSize());
    }

    private static final OfInt delta_idx_minus1$LAYOUT = (OfInt)$LAYOUT.select(groupElement("delta_idx_minus1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t delta_idx_minus1
     * }
     */
    public static final OfInt delta_idx_minus1$layout() {
        return delta_idx_minus1$LAYOUT;
    }

    private static final long delta_idx_minus1$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t delta_idx_minus1
     * }
     */
    public static final long delta_idx_minus1$offset() {
        return delta_idx_minus1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t delta_idx_minus1
     * }
     */
    public static int delta_idx_minus1(MemorySegment struct) {
        return struct.get(delta_idx_minus1$LAYOUT, delta_idx_minus1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t delta_idx_minus1
     * }
     */
    public static void delta_idx_minus1(MemorySegment struct, int fieldValue) {
        struct.set(delta_idx_minus1$LAYOUT, delta_idx_minus1$OFFSET, fieldValue);
    }

    private static final OfShort use_delta_flag$LAYOUT = (OfShort)$LAYOUT.select(groupElement("use_delta_flag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t use_delta_flag
     * }
     */
    public static final OfShort use_delta_flag$layout() {
        return use_delta_flag$LAYOUT;
    }

    private static final long use_delta_flag$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t use_delta_flag
     * }
     */
    public static final long use_delta_flag$offset() {
        return use_delta_flag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t use_delta_flag
     * }
     */
    public static short use_delta_flag(MemorySegment struct) {
        return struct.get(use_delta_flag$LAYOUT, use_delta_flag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t use_delta_flag
     * }
     */
    public static void use_delta_flag(MemorySegment struct, short fieldValue) {
        struct.set(use_delta_flag$LAYOUT, use_delta_flag$OFFSET, fieldValue);
    }

    private static final OfShort abs_delta_rps_minus1$LAYOUT = (OfShort)$LAYOUT.select(groupElement("abs_delta_rps_minus1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t abs_delta_rps_minus1
     * }
     */
    public static final OfShort abs_delta_rps_minus1$layout() {
        return abs_delta_rps_minus1$LAYOUT;
    }

    private static final long abs_delta_rps_minus1$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t abs_delta_rps_minus1
     * }
     */
    public static final long abs_delta_rps_minus1$offset() {
        return abs_delta_rps_minus1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t abs_delta_rps_minus1
     * }
     */
    public static short abs_delta_rps_minus1(MemorySegment struct) {
        return struct.get(abs_delta_rps_minus1$LAYOUT, abs_delta_rps_minus1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t abs_delta_rps_minus1
     * }
     */
    public static void abs_delta_rps_minus1(MemorySegment struct, short fieldValue) {
        struct.set(abs_delta_rps_minus1$LAYOUT, abs_delta_rps_minus1$OFFSET, fieldValue);
    }

    private static final OfShort used_by_curr_pic_flag$LAYOUT = (OfShort)$LAYOUT.select(groupElement("used_by_curr_pic_flag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_flag
     * }
     */
    public static final OfShort used_by_curr_pic_flag$layout() {
        return used_by_curr_pic_flag$LAYOUT;
    }

    private static final long used_by_curr_pic_flag$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_flag
     * }
     */
    public static final long used_by_curr_pic_flag$offset() {
        return used_by_curr_pic_flag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_flag
     * }
     */
    public static short used_by_curr_pic_flag(MemorySegment struct) {
        return struct.get(used_by_curr_pic_flag$LAYOUT, used_by_curr_pic_flag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_flag
     * }
     */
    public static void used_by_curr_pic_flag(MemorySegment struct, short fieldValue) {
        struct.set(used_by_curr_pic_flag$LAYOUT, used_by_curr_pic_flag$OFFSET, fieldValue);
    }

    private static final OfShort used_by_curr_pic_s0_flag$LAYOUT = (OfShort)$LAYOUT.select(groupElement("used_by_curr_pic_s0_flag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_s0_flag
     * }
     */
    public static final OfShort used_by_curr_pic_s0_flag$layout() {
        return used_by_curr_pic_s0_flag$LAYOUT;
    }

    private static final long used_by_curr_pic_s0_flag$OFFSET = 14;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_s0_flag
     * }
     */
    public static final long used_by_curr_pic_s0_flag$offset() {
        return used_by_curr_pic_s0_flag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_s0_flag
     * }
     */
    public static short used_by_curr_pic_s0_flag(MemorySegment struct) {
        return struct.get(used_by_curr_pic_s0_flag$LAYOUT, used_by_curr_pic_s0_flag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_s0_flag
     * }
     */
    public static void used_by_curr_pic_s0_flag(MemorySegment struct, short fieldValue) {
        struct.set(used_by_curr_pic_s0_flag$LAYOUT, used_by_curr_pic_s0_flag$OFFSET, fieldValue);
    }

    private static final OfShort used_by_curr_pic_s1_flag$LAYOUT = (OfShort)$LAYOUT.select(groupElement("used_by_curr_pic_s1_flag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_s1_flag
     * }
     */
    public static final OfShort used_by_curr_pic_s1_flag$layout() {
        return used_by_curr_pic_s1_flag$LAYOUT;
    }

    private static final long used_by_curr_pic_s1_flag$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_s1_flag
     * }
     */
    public static final long used_by_curr_pic_s1_flag$offset() {
        return used_by_curr_pic_s1_flag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_s1_flag
     * }
     */
    public static short used_by_curr_pic_s1_flag(MemorySegment struct) {
        return struct.get(used_by_curr_pic_s1_flag$LAYOUT, used_by_curr_pic_s1_flag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_s1_flag
     * }
     */
    public static void used_by_curr_pic_s1_flag(MemorySegment struct, short fieldValue) {
        struct.set(used_by_curr_pic_s1_flag$LAYOUT, used_by_curr_pic_s1_flag$OFFSET, fieldValue);
    }

    private static final OfShort reserved1$LAYOUT = (OfShort)$LAYOUT.select(groupElement("reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t reserved1
     * }
     */
    public static final OfShort reserved1$layout() {
        return reserved1$LAYOUT;
    }

    private static final long reserved1$OFFSET = 18;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t reserved1
     * }
     */
    public static final long reserved1$offset() {
        return reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t reserved1
     * }
     */
    public static short reserved1(MemorySegment struct) {
        return struct.get(reserved1$LAYOUT, reserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t reserved1
     * }
     */
    public static void reserved1(MemorySegment struct, short fieldValue) {
        struct.set(reserved1$LAYOUT, reserved1$OFFSET, fieldValue);
    }

    private static final OfByte reserved2$LAYOUT = (OfByte)$LAYOUT.select(groupElement("reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t reserved2
     * }
     */
    public static final OfByte reserved2$layout() {
        return reserved2$LAYOUT;
    }

    private static final long reserved2$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t reserved2
     * }
     */
    public static final long reserved2$offset() {
        return reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t reserved2
     * }
     */
    public static byte reserved2(MemorySegment struct) {
        return struct.get(reserved2$LAYOUT, reserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t reserved2
     * }
     */
    public static void reserved2(MemorySegment struct, byte fieldValue) {
        struct.set(reserved2$LAYOUT, reserved2$OFFSET, fieldValue);
    }

    private static final OfByte reserved3$LAYOUT = (OfByte)$LAYOUT.select(groupElement("reserved3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t reserved3
     * }
     */
    public static final OfByte reserved3$layout() {
        return reserved3$LAYOUT;
    }

    private static final long reserved3$OFFSET = 21;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t reserved3
     * }
     */
    public static final long reserved3$offset() {
        return reserved3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t reserved3
     * }
     */
    public static byte reserved3(MemorySegment struct) {
        return struct.get(reserved3$LAYOUT, reserved3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t reserved3
     * }
     */
    public static void reserved3(MemorySegment struct, byte fieldValue) {
        struct.set(reserved3$LAYOUT, reserved3$OFFSET, fieldValue);
    }

    private static final OfByte num_negative_pics$LAYOUT = (OfByte)$LAYOUT.select(groupElement("num_negative_pics"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t num_negative_pics
     * }
     */
    public static final OfByte num_negative_pics$layout() {
        return num_negative_pics$LAYOUT;
    }

    private static final long num_negative_pics$OFFSET = 22;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t num_negative_pics
     * }
     */
    public static final long num_negative_pics$offset() {
        return num_negative_pics$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t num_negative_pics
     * }
     */
    public static byte num_negative_pics(MemorySegment struct) {
        return struct.get(num_negative_pics$LAYOUT, num_negative_pics$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t num_negative_pics
     * }
     */
    public static void num_negative_pics(MemorySegment struct, byte fieldValue) {
        struct.set(num_negative_pics$LAYOUT, num_negative_pics$OFFSET, fieldValue);
    }

    private static final OfByte num_positive_pics$LAYOUT = (OfByte)$LAYOUT.select(groupElement("num_positive_pics"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t num_positive_pics
     * }
     */
    public static final OfByte num_positive_pics$layout() {
        return num_positive_pics$LAYOUT;
    }

    private static final long num_positive_pics$OFFSET = 23;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t num_positive_pics
     * }
     */
    public static final long num_positive_pics$offset() {
        return num_positive_pics$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t num_positive_pics
     * }
     */
    public static byte num_positive_pics(MemorySegment struct) {
        return struct.get(num_positive_pics$LAYOUT, num_positive_pics$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t num_positive_pics
     * }
     */
    public static void num_positive_pics(MemorySegment struct, byte fieldValue) {
        struct.set(num_positive_pics$LAYOUT, num_positive_pics$OFFSET, fieldValue);
    }

    private static final SequenceLayout delta_poc_s0_minus1$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("delta_poc_s0_minus1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t delta_poc_s0_minus1[16]
     * }
     */
    public static final SequenceLayout delta_poc_s0_minus1$layout() {
        return delta_poc_s0_minus1$LAYOUT;
    }

    private static final long delta_poc_s0_minus1$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t delta_poc_s0_minus1[16]
     * }
     */
    public static final long delta_poc_s0_minus1$offset() {
        return delta_poc_s0_minus1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t delta_poc_s0_minus1[16]
     * }
     */
    public static MemorySegment delta_poc_s0_minus1(MemorySegment struct) {
        return struct.asSlice(delta_poc_s0_minus1$OFFSET, delta_poc_s0_minus1$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t delta_poc_s0_minus1[16]
     * }
     */
    public static void delta_poc_s0_minus1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, delta_poc_s0_minus1$OFFSET, delta_poc_s0_minus1$LAYOUT.byteSize());
    }

    private static long[] delta_poc_s0_minus1$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint16_t delta_poc_s0_minus1[16]
     * }
     */
    public static long[] delta_poc_s0_minus1$dimensions() {
        return delta_poc_s0_minus1$DIMS;
    }
    private static final VarHandle delta_poc_s0_minus1$ELEM_HANDLE = delta_poc_s0_minus1$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint16_t delta_poc_s0_minus1[16]
     * }
     */
    public static short delta_poc_s0_minus1(MemorySegment struct, long index0) {
        return (short)delta_poc_s0_minus1$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint16_t delta_poc_s0_minus1[16]
     * }
     */
    public static void delta_poc_s0_minus1(MemorySegment struct, long index0, short fieldValue) {
        delta_poc_s0_minus1$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout delta_poc_s1_minus1$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("delta_poc_s1_minus1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t delta_poc_s1_minus1[16]
     * }
     */
    public static final SequenceLayout delta_poc_s1_minus1$layout() {
        return delta_poc_s1_minus1$LAYOUT;
    }

    private static final long delta_poc_s1_minus1$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t delta_poc_s1_minus1[16]
     * }
     */
    public static final long delta_poc_s1_minus1$offset() {
        return delta_poc_s1_minus1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t delta_poc_s1_minus1[16]
     * }
     */
    public static MemorySegment delta_poc_s1_minus1(MemorySegment struct) {
        return struct.asSlice(delta_poc_s1_minus1$OFFSET, delta_poc_s1_minus1$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t delta_poc_s1_minus1[16]
     * }
     */
    public static void delta_poc_s1_minus1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, delta_poc_s1_minus1$OFFSET, delta_poc_s1_minus1$LAYOUT.byteSize());
    }

    private static long[] delta_poc_s1_minus1$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint16_t delta_poc_s1_minus1[16]
     * }
     */
    public static long[] delta_poc_s1_minus1$dimensions() {
        return delta_poc_s1_minus1$DIMS;
    }
    private static final VarHandle delta_poc_s1_minus1$ELEM_HANDLE = delta_poc_s1_minus1$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint16_t delta_poc_s1_minus1[16]
     * }
     */
    public static short delta_poc_s1_minus1(MemorySegment struct, long index0) {
        return (short)delta_poc_s1_minus1$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint16_t delta_poc_s1_minus1[16]
     * }
     */
    public static void delta_poc_s1_minus1(MemorySegment struct, long index0, short fieldValue) {
        delta_poc_s1_minus1$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

