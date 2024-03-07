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
 * struct VkImageCopy {
 *     VkImageSubresourceLayers srcSubresource;
 *     VkOffset3D srcOffset;
 *     VkImageSubresourceLayers dstSubresource;
 *     VkOffset3D dstOffset;
 *     VkExtent3D extent;
 * }
 * }
 */
public class VkImageCopy {

    VkImageCopy() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        VkImageSubresourceLayers.layout().withName("srcSubresource"),
        VkOffset3D.layout().withName("srcOffset"),
        VkImageSubresourceLayers.layout().withName("dstSubresource"),
        VkOffset3D.layout().withName("dstOffset"),
        VkExtent3D.layout().withName("extent")
    ).withName("VkImageCopy");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout srcSubresource$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("srcSubresource"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageSubresourceLayers srcSubresource
     * }
     */
    public static final GroupLayout srcSubresource$layout() {
        return srcSubresource$LAYOUT;
    }

    private static final long srcSubresource$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageSubresourceLayers srcSubresource
     * }
     */
    public static final long srcSubresource$offset() {
        return srcSubresource$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageSubresourceLayers srcSubresource
     * }
     */
    public static MemorySegment srcSubresource(MemorySegment struct) {
        return struct.asSlice(srcSubresource$OFFSET, srcSubresource$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageSubresourceLayers srcSubresource
     * }
     */
    public static void srcSubresource(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, srcSubresource$OFFSET, srcSubresource$LAYOUT.byteSize());
    }

    private static final GroupLayout srcOffset$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("srcOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkOffset3D srcOffset
     * }
     */
    public static final GroupLayout srcOffset$layout() {
        return srcOffset$LAYOUT;
    }

    private static final long srcOffset$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkOffset3D srcOffset
     * }
     */
    public static final long srcOffset$offset() {
        return srcOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkOffset3D srcOffset
     * }
     */
    public static MemorySegment srcOffset(MemorySegment struct) {
        return struct.asSlice(srcOffset$OFFSET, srcOffset$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkOffset3D srcOffset
     * }
     */
    public static void srcOffset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, srcOffset$OFFSET, srcOffset$LAYOUT.byteSize());
    }

    private static final GroupLayout dstSubresource$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("dstSubresource"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageSubresourceLayers dstSubresource
     * }
     */
    public static final GroupLayout dstSubresource$layout() {
        return dstSubresource$LAYOUT;
    }

    private static final long dstSubresource$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageSubresourceLayers dstSubresource
     * }
     */
    public static final long dstSubresource$offset() {
        return dstSubresource$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageSubresourceLayers dstSubresource
     * }
     */
    public static MemorySegment dstSubresource(MemorySegment struct) {
        return struct.asSlice(dstSubresource$OFFSET, dstSubresource$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageSubresourceLayers dstSubresource
     * }
     */
    public static void dstSubresource(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, dstSubresource$OFFSET, dstSubresource$LAYOUT.byteSize());
    }

    private static final GroupLayout dstOffset$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("dstOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkOffset3D dstOffset
     * }
     */
    public static final GroupLayout dstOffset$layout() {
        return dstOffset$LAYOUT;
    }

    private static final long dstOffset$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkOffset3D dstOffset
     * }
     */
    public static final long dstOffset$offset() {
        return dstOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkOffset3D dstOffset
     * }
     */
    public static MemorySegment dstOffset(MemorySegment struct) {
        return struct.asSlice(dstOffset$OFFSET, dstOffset$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkOffset3D dstOffset
     * }
     */
    public static void dstOffset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, dstOffset$OFFSET, dstOffset$LAYOUT.byteSize());
    }

    private static final GroupLayout extent$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("extent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent3D extent
     * }
     */
    public static final GroupLayout extent$layout() {
        return extent$LAYOUT;
    }

    private static final long extent$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent3D extent
     * }
     */
    public static final long extent$offset() {
        return extent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent3D extent
     * }
     */
    public static MemorySegment extent(MemorySegment struct) {
        return struct.asSlice(extent$OFFSET, extent$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent3D extent
     * }
     */
    public static void extent(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, extent$OFFSET, extent$LAYOUT.byteSize());
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

