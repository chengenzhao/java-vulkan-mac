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
 * union VkPerformanceCounterResultKHR {
 *     int32_t int32;
 *     int64_t int64;
 *     uint32_t uint32;
 *     uint64_t uint64;
 *     float float32;
 *     double float64;
 * }
 * }
 */
public class VkPerformanceCounterResultKHR {

    VkPerformanceCounterResultKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        vulkan_h.C_INT.withName("int32"),
        vulkan_h.C_LONG_LONG.withName("int64"),
        vulkan_h.C_INT.withName("uint32"),
        vulkan_h.C_LONG_LONG.withName("uint64"),
        vulkan_h.C_FLOAT.withName("float32"),
        vulkan_h.C_DOUBLE.withName("float64")
    ).withName("VkPerformanceCounterResultKHR");

    /**
     * The layout of this union
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt int32$LAYOUT = (OfInt)$LAYOUT.select(groupElement("int32"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t int32
     * }
     */
    public static final OfInt int32$layout() {
        return int32$LAYOUT;
    }

    private static final long int32$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t int32
     * }
     */
    public static final long int32$offset() {
        return int32$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t int32
     * }
     */
    public static int int32(MemorySegment union) {
        return union.get(int32$LAYOUT, int32$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t int32
     * }
     */
    public static void int32(MemorySegment union, int fieldValue) {
        union.set(int32$LAYOUT, int32$OFFSET, fieldValue);
    }

    private static final OfLong int64$LAYOUT = (OfLong)$LAYOUT.select(groupElement("int64"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t int64
     * }
     */
    public static final OfLong int64$layout() {
        return int64$LAYOUT;
    }

    private static final long int64$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t int64
     * }
     */
    public static final long int64$offset() {
        return int64$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t int64
     * }
     */
    public static long int64(MemorySegment union) {
        return union.get(int64$LAYOUT, int64$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t int64
     * }
     */
    public static void int64(MemorySegment union, long fieldValue) {
        union.set(int64$LAYOUT, int64$OFFSET, fieldValue);
    }

    private static final OfInt uint32$LAYOUT = (OfInt)$LAYOUT.select(groupElement("uint32"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t uint32
     * }
     */
    public static final OfInt uint32$layout() {
        return uint32$LAYOUT;
    }

    private static final long uint32$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t uint32
     * }
     */
    public static final long uint32$offset() {
        return uint32$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t uint32
     * }
     */
    public static int uint32(MemorySegment union) {
        return union.get(uint32$LAYOUT, uint32$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t uint32
     * }
     */
    public static void uint32(MemorySegment union, int fieldValue) {
        union.set(uint32$LAYOUT, uint32$OFFSET, fieldValue);
    }

    private static final OfLong uint64$LAYOUT = (OfLong)$LAYOUT.select(groupElement("uint64"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t uint64
     * }
     */
    public static final OfLong uint64$layout() {
        return uint64$LAYOUT;
    }

    private static final long uint64$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t uint64
     * }
     */
    public static final long uint64$offset() {
        return uint64$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t uint64
     * }
     */
    public static long uint64(MemorySegment union) {
        return union.get(uint64$LAYOUT, uint64$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t uint64
     * }
     */
    public static void uint64(MemorySegment union, long fieldValue) {
        union.set(uint64$LAYOUT, uint64$OFFSET, fieldValue);
    }

    private static final OfFloat float32$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("float32"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float float32
     * }
     */
    public static final OfFloat float32$layout() {
        return float32$LAYOUT;
    }

    private static final long float32$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float float32
     * }
     */
    public static final long float32$offset() {
        return float32$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float float32
     * }
     */
    public static float float32(MemorySegment union) {
        return union.get(float32$LAYOUT, float32$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float float32
     * }
     */
    public static void float32(MemorySegment union, float fieldValue) {
        union.set(float32$LAYOUT, float32$OFFSET, fieldValue);
    }

    private static final OfDouble float64$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("float64"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double float64
     * }
     */
    public static final OfDouble float64$layout() {
        return float64$LAYOUT;
    }

    private static final long float64$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double float64
     * }
     */
    public static final long float64$offset() {
        return float64$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double float64
     * }
     */
    public static double float64(MemorySegment union) {
        return union.get(float64$LAYOUT, float64$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double float64
     * }
     */
    public static void float64(MemorySegment union, double fieldValue) {
        union.set(float64$LAYOUT, float64$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this union
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

