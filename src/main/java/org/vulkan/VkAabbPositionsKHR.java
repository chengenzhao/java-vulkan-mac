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
 * struct VkAabbPositionsKHR {
 *     float minX;
 *     float minY;
 *     float minZ;
 *     float maxX;
 *     float maxY;
 *     float maxZ;
 * }
 * }
 */
public class VkAabbPositionsKHR {

    VkAabbPositionsKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_FLOAT.withName("minX"),
        vulkan_h.C_FLOAT.withName("minY"),
        vulkan_h.C_FLOAT.withName("minZ"),
        vulkan_h.C_FLOAT.withName("maxX"),
        vulkan_h.C_FLOAT.withName("maxY"),
        vulkan_h.C_FLOAT.withName("maxZ")
    ).withName("VkAabbPositionsKHR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfFloat minX$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("minX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float minX
     * }
     */
    public static final OfFloat minX$layout() {
        return minX$LAYOUT;
    }

    private static final long minX$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float minX
     * }
     */
    public static final long minX$offset() {
        return minX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float minX
     * }
     */
    public static float minX(MemorySegment struct) {
        return struct.get(minX$LAYOUT, minX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float minX
     * }
     */
    public static void minX(MemorySegment struct, float fieldValue) {
        struct.set(minX$LAYOUT, minX$OFFSET, fieldValue);
    }

    private static final OfFloat minY$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("minY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float minY
     * }
     */
    public static final OfFloat minY$layout() {
        return minY$LAYOUT;
    }

    private static final long minY$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float minY
     * }
     */
    public static final long minY$offset() {
        return minY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float minY
     * }
     */
    public static float minY(MemorySegment struct) {
        return struct.get(minY$LAYOUT, minY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float minY
     * }
     */
    public static void minY(MemorySegment struct, float fieldValue) {
        struct.set(minY$LAYOUT, minY$OFFSET, fieldValue);
    }

    private static final OfFloat minZ$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("minZ"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float minZ
     * }
     */
    public static final OfFloat minZ$layout() {
        return minZ$LAYOUT;
    }

    private static final long minZ$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float minZ
     * }
     */
    public static final long minZ$offset() {
        return minZ$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float minZ
     * }
     */
    public static float minZ(MemorySegment struct) {
        return struct.get(minZ$LAYOUT, minZ$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float minZ
     * }
     */
    public static void minZ(MemorySegment struct, float fieldValue) {
        struct.set(minZ$LAYOUT, minZ$OFFSET, fieldValue);
    }

    private static final OfFloat maxX$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("maxX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float maxX
     * }
     */
    public static final OfFloat maxX$layout() {
        return maxX$LAYOUT;
    }

    private static final long maxX$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float maxX
     * }
     */
    public static final long maxX$offset() {
        return maxX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float maxX
     * }
     */
    public static float maxX(MemorySegment struct) {
        return struct.get(maxX$LAYOUT, maxX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float maxX
     * }
     */
    public static void maxX(MemorySegment struct, float fieldValue) {
        struct.set(maxX$LAYOUT, maxX$OFFSET, fieldValue);
    }

    private static final OfFloat maxY$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("maxY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float maxY
     * }
     */
    public static final OfFloat maxY$layout() {
        return maxY$LAYOUT;
    }

    private static final long maxY$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float maxY
     * }
     */
    public static final long maxY$offset() {
        return maxY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float maxY
     * }
     */
    public static float maxY(MemorySegment struct) {
        return struct.get(maxY$LAYOUT, maxY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float maxY
     * }
     */
    public static void maxY(MemorySegment struct, float fieldValue) {
        struct.set(maxY$LAYOUT, maxY$OFFSET, fieldValue);
    }

    private static final OfFloat maxZ$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("maxZ"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float maxZ
     * }
     */
    public static final OfFloat maxZ$layout() {
        return maxZ$LAYOUT;
    }

    private static final long maxZ$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float maxZ
     * }
     */
    public static final long maxZ$offset() {
        return maxZ$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float maxZ
     * }
     */
    public static float maxZ(MemorySegment struct) {
        return struct.get(maxZ$LAYOUT, maxZ$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float maxZ
     * }
     */
    public static void maxZ(MemorySegment struct, float fieldValue) {
        struct.set(maxZ$LAYOUT, maxZ$OFFSET, fieldValue);
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

