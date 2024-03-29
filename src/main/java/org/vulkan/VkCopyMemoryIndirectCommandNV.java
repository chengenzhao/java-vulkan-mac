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
 * struct VkCopyMemoryIndirectCommandNV {
 *     VkDeviceAddress srcAddress;
 *     VkDeviceAddress dstAddress;
 *     VkDeviceSize size;
 * }
 * }
 */
public class VkCopyMemoryIndirectCommandNV {

    VkCopyMemoryIndirectCommandNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_LONG_LONG.withName("srcAddress"),
        vulkan_h.C_LONG_LONG.withName("dstAddress"),
        vulkan_h.C_LONG_LONG.withName("size")
    ).withName("VkCopyMemoryIndirectCommandNV");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong srcAddress$LAYOUT = (OfLong)$LAYOUT.select(groupElement("srcAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceAddress srcAddress
     * }
     */
    public static final OfLong srcAddress$layout() {
        return srcAddress$LAYOUT;
    }

    private static final long srcAddress$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceAddress srcAddress
     * }
     */
    public static final long srcAddress$offset() {
        return srcAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceAddress srcAddress
     * }
     */
    public static long srcAddress(MemorySegment struct) {
        return struct.get(srcAddress$LAYOUT, srcAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceAddress srcAddress
     * }
     */
    public static void srcAddress(MemorySegment struct, long fieldValue) {
        struct.set(srcAddress$LAYOUT, srcAddress$OFFSET, fieldValue);
    }

    private static final OfLong dstAddress$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dstAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceAddress dstAddress
     * }
     */
    public static final OfLong dstAddress$layout() {
        return dstAddress$LAYOUT;
    }

    private static final long dstAddress$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceAddress dstAddress
     * }
     */
    public static final long dstAddress$offset() {
        return dstAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceAddress dstAddress
     * }
     */
    public static long dstAddress(MemorySegment struct) {
        return struct.get(dstAddress$LAYOUT, dstAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceAddress dstAddress
     * }
     */
    public static void dstAddress(MemorySegment struct, long fieldValue) {
        struct.set(dstAddress$LAYOUT, dstAddress$OFFSET, fieldValue);
    }

    private static final OfLong size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static final OfLong size$layout() {
        return size$LAYOUT;
    }

    private static final long size$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static final long size$offset() {
        return size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static long size(MemorySegment struct) {
        return struct.get(size$LAYOUT, size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static void size(MemorySegment struct, long fieldValue) {
        struct.set(size$LAYOUT, size$OFFSET, fieldValue);
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

