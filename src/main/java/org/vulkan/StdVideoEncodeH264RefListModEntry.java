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
 * struct StdVideoEncodeH264RefListModEntry {
 *     StdVideoH264ModificationOfPicNumsIdc modification_of_pic_nums_idc;
 *     uint16_t abs_diff_pic_num_minus1;
 *     uint16_t long_term_pic_num;
 * }
 * }
 */
public class StdVideoEncodeH264RefListModEntry {

    StdVideoEncodeH264RefListModEntry() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("modification_of_pic_nums_idc"),
        vulkan_h.C_SHORT.withName("abs_diff_pic_num_minus1"),
        vulkan_h.C_SHORT.withName("long_term_pic_num")
    ).withName("StdVideoEncodeH264RefListModEntry");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt modification_of_pic_nums_idc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("modification_of_pic_nums_idc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * StdVideoH264ModificationOfPicNumsIdc modification_of_pic_nums_idc
     * }
     */
    public static final OfInt modification_of_pic_nums_idc$layout() {
        return modification_of_pic_nums_idc$LAYOUT;
    }

    private static final long modification_of_pic_nums_idc$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoH264ModificationOfPicNumsIdc modification_of_pic_nums_idc
     * }
     */
    public static final long modification_of_pic_nums_idc$offset() {
        return modification_of_pic_nums_idc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoH264ModificationOfPicNumsIdc modification_of_pic_nums_idc
     * }
     */
    public static int modification_of_pic_nums_idc(MemorySegment struct) {
        return struct.get(modification_of_pic_nums_idc$LAYOUT, modification_of_pic_nums_idc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoH264ModificationOfPicNumsIdc modification_of_pic_nums_idc
     * }
     */
    public static void modification_of_pic_nums_idc(MemorySegment struct, int fieldValue) {
        struct.set(modification_of_pic_nums_idc$LAYOUT, modification_of_pic_nums_idc$OFFSET, fieldValue);
    }

    private static final OfShort abs_diff_pic_num_minus1$LAYOUT = (OfShort)$LAYOUT.select(groupElement("abs_diff_pic_num_minus1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t abs_diff_pic_num_minus1
     * }
     */
    public static final OfShort abs_diff_pic_num_minus1$layout() {
        return abs_diff_pic_num_minus1$LAYOUT;
    }

    private static final long abs_diff_pic_num_minus1$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t abs_diff_pic_num_minus1
     * }
     */
    public static final long abs_diff_pic_num_minus1$offset() {
        return abs_diff_pic_num_minus1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t abs_diff_pic_num_minus1
     * }
     */
    public static short abs_diff_pic_num_minus1(MemorySegment struct) {
        return struct.get(abs_diff_pic_num_minus1$LAYOUT, abs_diff_pic_num_minus1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t abs_diff_pic_num_minus1
     * }
     */
    public static void abs_diff_pic_num_minus1(MemorySegment struct, short fieldValue) {
        struct.set(abs_diff_pic_num_minus1$LAYOUT, abs_diff_pic_num_minus1$OFFSET, fieldValue);
    }

    private static final OfShort long_term_pic_num$LAYOUT = (OfShort)$LAYOUT.select(groupElement("long_term_pic_num"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t long_term_pic_num
     * }
     */
    public static final OfShort long_term_pic_num$layout() {
        return long_term_pic_num$LAYOUT;
    }

    private static final long long_term_pic_num$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t long_term_pic_num
     * }
     */
    public static final long long_term_pic_num$offset() {
        return long_term_pic_num$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t long_term_pic_num
     * }
     */
    public static short long_term_pic_num(MemorySegment struct) {
        return struct.get(long_term_pic_num$LAYOUT, long_term_pic_num$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t long_term_pic_num
     * }
     */
    public static void long_term_pic_num(MemorySegment struct, short fieldValue) {
        struct.set(long_term_pic_num$LAYOUT, long_term_pic_num$OFFSET, fieldValue);
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

