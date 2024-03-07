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
 * struct VkViewport {
 *     float x;
 *     float y;
 *     float width;
 *     float height;
 *     float minDepth;
 *     float maxDepth;
 * }
 * }
 */
public class VkViewport {

    VkViewport() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_FLOAT.withName("x"),
        vulkan_h.C_FLOAT.withName("y"),
        vulkan_h.C_FLOAT.withName("width"),
        vulkan_h.C_FLOAT.withName("height"),
        vulkan_h.C_FLOAT.withName("minDepth"),
        vulkan_h.C_FLOAT.withName("maxDepth")
    ).withName("VkViewport");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfFloat x$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float x
     * }
     */
    public static final OfFloat x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float x
     * }
     */
    public static float x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float x
     * }
     */
    public static void x(MemorySegment struct, float fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfFloat y$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float y
     * }
     */
    public static final OfFloat y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float y
     * }
     */
    public static float y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float y
     * }
     */
    public static void y(MemorySegment struct, float fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfFloat width$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float width
     * }
     */
    public static final OfFloat width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float width
     * }
     */
    public static float width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float width
     * }
     */
    public static void width(MemorySegment struct, float fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfFloat height$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float height
     * }
     */
    public static final OfFloat height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float height
     * }
     */
    public static float height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float height
     * }
     */
    public static void height(MemorySegment struct, float fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final OfFloat minDepth$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("minDepth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float minDepth
     * }
     */
    public static final OfFloat minDepth$layout() {
        return minDepth$LAYOUT;
    }

    private static final long minDepth$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float minDepth
     * }
     */
    public static final long minDepth$offset() {
        return minDepth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float minDepth
     * }
     */
    public static float minDepth(MemorySegment struct) {
        return struct.get(minDepth$LAYOUT, minDepth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float minDepth
     * }
     */
    public static void minDepth(MemorySegment struct, float fieldValue) {
        struct.set(minDepth$LAYOUT, minDepth$OFFSET, fieldValue);
    }

    private static final OfFloat maxDepth$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("maxDepth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float maxDepth
     * }
     */
    public static final OfFloat maxDepth$layout() {
        return maxDepth$LAYOUT;
    }

    private static final long maxDepth$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float maxDepth
     * }
     */
    public static final long maxDepth$offset() {
        return maxDepth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float maxDepth
     * }
     */
    public static float maxDepth(MemorySegment struct) {
        return struct.get(maxDepth$LAYOUT, maxDepth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float maxDepth
     * }
     */
    public static void maxDepth(MemorySegment struct, float fieldValue) {
        struct.set(maxDepth$LAYOUT, maxDepth$OFFSET, fieldValue);
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

