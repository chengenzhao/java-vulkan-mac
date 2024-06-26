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
 * struct StdVideoAV1CDEF {
 *     uint8_t cdef_damping_minus_3;
 *     uint8_t cdef_bits;
 *     uint8_t cdef_y_pri_strength[8];
 *     uint8_t cdef_y_sec_strength[8];
 *     uint8_t cdef_uv_pri_strength[8];
 *     uint8_t cdef_uv_sec_strength[8];
 * }
 * }
 */
public class StdVideoAV1CDEF {

    StdVideoAV1CDEF() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_CHAR.withName("cdef_damping_minus_3"),
        vulkan_h.C_CHAR.withName("cdef_bits"),
        MemoryLayout.sequenceLayout(8, vulkan_h.C_CHAR).withName("cdef_y_pri_strength"),
        MemoryLayout.sequenceLayout(8, vulkan_h.C_CHAR).withName("cdef_y_sec_strength"),
        MemoryLayout.sequenceLayout(8, vulkan_h.C_CHAR).withName("cdef_uv_pri_strength"),
        MemoryLayout.sequenceLayout(8, vulkan_h.C_CHAR).withName("cdef_uv_sec_strength")
    ).withName("StdVideoAV1CDEF");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte cdef_damping_minus_3$LAYOUT = (OfByte)$LAYOUT.select(groupElement("cdef_damping_minus_3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t cdef_damping_minus_3
     * }
     */
    public static final OfByte cdef_damping_minus_3$layout() {
        return cdef_damping_minus_3$LAYOUT;
    }

    private static final long cdef_damping_minus_3$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t cdef_damping_minus_3
     * }
     */
    public static final long cdef_damping_minus_3$offset() {
        return cdef_damping_minus_3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t cdef_damping_minus_3
     * }
     */
    public static byte cdef_damping_minus_3(MemorySegment struct) {
        return struct.get(cdef_damping_minus_3$LAYOUT, cdef_damping_minus_3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t cdef_damping_minus_3
     * }
     */
    public static void cdef_damping_minus_3(MemorySegment struct, byte fieldValue) {
        struct.set(cdef_damping_minus_3$LAYOUT, cdef_damping_minus_3$OFFSET, fieldValue);
    }

    private static final OfByte cdef_bits$LAYOUT = (OfByte)$LAYOUT.select(groupElement("cdef_bits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t cdef_bits
     * }
     */
    public static final OfByte cdef_bits$layout() {
        return cdef_bits$LAYOUT;
    }

    private static final long cdef_bits$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t cdef_bits
     * }
     */
    public static final long cdef_bits$offset() {
        return cdef_bits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t cdef_bits
     * }
     */
    public static byte cdef_bits(MemorySegment struct) {
        return struct.get(cdef_bits$LAYOUT, cdef_bits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t cdef_bits
     * }
     */
    public static void cdef_bits(MemorySegment struct, byte fieldValue) {
        struct.set(cdef_bits$LAYOUT, cdef_bits$OFFSET, fieldValue);
    }

    private static final SequenceLayout cdef_y_pri_strength$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("cdef_y_pri_strength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t cdef_y_pri_strength[8]
     * }
     */
    public static final SequenceLayout cdef_y_pri_strength$layout() {
        return cdef_y_pri_strength$LAYOUT;
    }

    private static final long cdef_y_pri_strength$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t cdef_y_pri_strength[8]
     * }
     */
    public static final long cdef_y_pri_strength$offset() {
        return cdef_y_pri_strength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t cdef_y_pri_strength[8]
     * }
     */
    public static MemorySegment cdef_y_pri_strength(MemorySegment struct) {
        return struct.asSlice(cdef_y_pri_strength$OFFSET, cdef_y_pri_strength$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t cdef_y_pri_strength[8]
     * }
     */
    public static void cdef_y_pri_strength(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, cdef_y_pri_strength$OFFSET, cdef_y_pri_strength$LAYOUT.byteSize());
    }

    private static long[] cdef_y_pri_strength$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t cdef_y_pri_strength[8]
     * }
     */
    public static long[] cdef_y_pri_strength$dimensions() {
        return cdef_y_pri_strength$DIMS;
    }
    private static final VarHandle cdef_y_pri_strength$ELEM_HANDLE = cdef_y_pri_strength$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t cdef_y_pri_strength[8]
     * }
     */
    public static byte cdef_y_pri_strength(MemorySegment struct, long index0) {
        return (byte)cdef_y_pri_strength$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t cdef_y_pri_strength[8]
     * }
     */
    public static void cdef_y_pri_strength(MemorySegment struct, long index0, byte fieldValue) {
        cdef_y_pri_strength$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout cdef_y_sec_strength$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("cdef_y_sec_strength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t cdef_y_sec_strength[8]
     * }
     */
    public static final SequenceLayout cdef_y_sec_strength$layout() {
        return cdef_y_sec_strength$LAYOUT;
    }

    private static final long cdef_y_sec_strength$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t cdef_y_sec_strength[8]
     * }
     */
    public static final long cdef_y_sec_strength$offset() {
        return cdef_y_sec_strength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t cdef_y_sec_strength[8]
     * }
     */
    public static MemorySegment cdef_y_sec_strength(MemorySegment struct) {
        return struct.asSlice(cdef_y_sec_strength$OFFSET, cdef_y_sec_strength$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t cdef_y_sec_strength[8]
     * }
     */
    public static void cdef_y_sec_strength(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, cdef_y_sec_strength$OFFSET, cdef_y_sec_strength$LAYOUT.byteSize());
    }

    private static long[] cdef_y_sec_strength$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t cdef_y_sec_strength[8]
     * }
     */
    public static long[] cdef_y_sec_strength$dimensions() {
        return cdef_y_sec_strength$DIMS;
    }
    private static final VarHandle cdef_y_sec_strength$ELEM_HANDLE = cdef_y_sec_strength$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t cdef_y_sec_strength[8]
     * }
     */
    public static byte cdef_y_sec_strength(MemorySegment struct, long index0) {
        return (byte)cdef_y_sec_strength$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t cdef_y_sec_strength[8]
     * }
     */
    public static void cdef_y_sec_strength(MemorySegment struct, long index0, byte fieldValue) {
        cdef_y_sec_strength$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout cdef_uv_pri_strength$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("cdef_uv_pri_strength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t cdef_uv_pri_strength[8]
     * }
     */
    public static final SequenceLayout cdef_uv_pri_strength$layout() {
        return cdef_uv_pri_strength$LAYOUT;
    }

    private static final long cdef_uv_pri_strength$OFFSET = 18;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t cdef_uv_pri_strength[8]
     * }
     */
    public static final long cdef_uv_pri_strength$offset() {
        return cdef_uv_pri_strength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t cdef_uv_pri_strength[8]
     * }
     */
    public static MemorySegment cdef_uv_pri_strength(MemorySegment struct) {
        return struct.asSlice(cdef_uv_pri_strength$OFFSET, cdef_uv_pri_strength$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t cdef_uv_pri_strength[8]
     * }
     */
    public static void cdef_uv_pri_strength(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, cdef_uv_pri_strength$OFFSET, cdef_uv_pri_strength$LAYOUT.byteSize());
    }

    private static long[] cdef_uv_pri_strength$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t cdef_uv_pri_strength[8]
     * }
     */
    public static long[] cdef_uv_pri_strength$dimensions() {
        return cdef_uv_pri_strength$DIMS;
    }
    private static final VarHandle cdef_uv_pri_strength$ELEM_HANDLE = cdef_uv_pri_strength$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t cdef_uv_pri_strength[8]
     * }
     */
    public static byte cdef_uv_pri_strength(MemorySegment struct, long index0) {
        return (byte)cdef_uv_pri_strength$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t cdef_uv_pri_strength[8]
     * }
     */
    public static void cdef_uv_pri_strength(MemorySegment struct, long index0, byte fieldValue) {
        cdef_uv_pri_strength$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout cdef_uv_sec_strength$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("cdef_uv_sec_strength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t cdef_uv_sec_strength[8]
     * }
     */
    public static final SequenceLayout cdef_uv_sec_strength$layout() {
        return cdef_uv_sec_strength$LAYOUT;
    }

    private static final long cdef_uv_sec_strength$OFFSET = 26;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t cdef_uv_sec_strength[8]
     * }
     */
    public static final long cdef_uv_sec_strength$offset() {
        return cdef_uv_sec_strength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t cdef_uv_sec_strength[8]
     * }
     */
    public static MemorySegment cdef_uv_sec_strength(MemorySegment struct) {
        return struct.asSlice(cdef_uv_sec_strength$OFFSET, cdef_uv_sec_strength$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t cdef_uv_sec_strength[8]
     * }
     */
    public static void cdef_uv_sec_strength(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, cdef_uv_sec_strength$OFFSET, cdef_uv_sec_strength$LAYOUT.byteSize());
    }

    private static long[] cdef_uv_sec_strength$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t cdef_uv_sec_strength[8]
     * }
     */
    public static long[] cdef_uv_sec_strength$dimensions() {
        return cdef_uv_sec_strength$DIMS;
    }
    private static final VarHandle cdef_uv_sec_strength$ELEM_HANDLE = cdef_uv_sec_strength$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t cdef_uv_sec_strength[8]
     * }
     */
    public static byte cdef_uv_sec_strength(MemorySegment struct, long index0) {
        return (byte)cdef_uv_sec_strength$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t cdef_uv_sec_strength[8]
     * }
     */
    public static void cdef_uv_sec_strength(MemorySegment struct, long index0, byte fieldValue) {
        cdef_uv_sec_strength$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

