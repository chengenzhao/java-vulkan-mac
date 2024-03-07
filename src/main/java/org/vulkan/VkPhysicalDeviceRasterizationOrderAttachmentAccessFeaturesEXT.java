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
 * struct VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkBool32 rasterizationOrderColorAttachmentAccess;
 *     VkBool32 rasterizationOrderDepthAttachmentAccess;
 *     VkBool32 rasterizationOrderStencilAttachmentAccess;
 * }
 * }
 */
public class VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT {

    VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("rasterizationOrderColorAttachmentAccess"),
        vulkan_h.C_INT.withName("rasterizationOrderDepthAttachmentAccess"),
        vulkan_h.C_INT.withName("rasterizationOrderStencilAttachmentAccess"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt sType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static final OfInt sType$layout() {
        return sType$LAYOUT;
    }

    private static final long sType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static final long sType$offset() {
        return sType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static int sType(MemorySegment struct) {
        return struct.get(sType$LAYOUT, sType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static void sType(MemorySegment struct, int fieldValue) {
        struct.set(sType$LAYOUT, sType$OFFSET, fieldValue);
    }

    private static final AddressLayout pNext$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pNext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static final AddressLayout pNext$layout() {
        return pNext$LAYOUT;
    }

    private static final long pNext$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static final long pNext$offset() {
        return pNext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static MemorySegment pNext(MemorySegment struct) {
        return struct.get(pNext$LAYOUT, pNext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static void pNext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pNext$LAYOUT, pNext$OFFSET, fieldValue);
    }

    private static final OfInt rasterizationOrderColorAttachmentAccess$LAYOUT = (OfInt)$LAYOUT.select(groupElement("rasterizationOrderColorAttachmentAccess"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 rasterizationOrderColorAttachmentAccess
     * }
     */
    public static final OfInt rasterizationOrderColorAttachmentAccess$layout() {
        return rasterizationOrderColorAttachmentAccess$LAYOUT;
    }

    private static final long rasterizationOrderColorAttachmentAccess$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 rasterizationOrderColorAttachmentAccess
     * }
     */
    public static final long rasterizationOrderColorAttachmentAccess$offset() {
        return rasterizationOrderColorAttachmentAccess$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 rasterizationOrderColorAttachmentAccess
     * }
     */
    public static int rasterizationOrderColorAttachmentAccess(MemorySegment struct) {
        return struct.get(rasterizationOrderColorAttachmentAccess$LAYOUT, rasterizationOrderColorAttachmentAccess$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 rasterizationOrderColorAttachmentAccess
     * }
     */
    public static void rasterizationOrderColorAttachmentAccess(MemorySegment struct, int fieldValue) {
        struct.set(rasterizationOrderColorAttachmentAccess$LAYOUT, rasterizationOrderColorAttachmentAccess$OFFSET, fieldValue);
    }

    private static final OfInt rasterizationOrderDepthAttachmentAccess$LAYOUT = (OfInt)$LAYOUT.select(groupElement("rasterizationOrderDepthAttachmentAccess"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 rasterizationOrderDepthAttachmentAccess
     * }
     */
    public static final OfInt rasterizationOrderDepthAttachmentAccess$layout() {
        return rasterizationOrderDepthAttachmentAccess$LAYOUT;
    }

    private static final long rasterizationOrderDepthAttachmentAccess$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 rasterizationOrderDepthAttachmentAccess
     * }
     */
    public static final long rasterizationOrderDepthAttachmentAccess$offset() {
        return rasterizationOrderDepthAttachmentAccess$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 rasterizationOrderDepthAttachmentAccess
     * }
     */
    public static int rasterizationOrderDepthAttachmentAccess(MemorySegment struct) {
        return struct.get(rasterizationOrderDepthAttachmentAccess$LAYOUT, rasterizationOrderDepthAttachmentAccess$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 rasterizationOrderDepthAttachmentAccess
     * }
     */
    public static void rasterizationOrderDepthAttachmentAccess(MemorySegment struct, int fieldValue) {
        struct.set(rasterizationOrderDepthAttachmentAccess$LAYOUT, rasterizationOrderDepthAttachmentAccess$OFFSET, fieldValue);
    }

    private static final OfInt rasterizationOrderStencilAttachmentAccess$LAYOUT = (OfInt)$LAYOUT.select(groupElement("rasterizationOrderStencilAttachmentAccess"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 rasterizationOrderStencilAttachmentAccess
     * }
     */
    public static final OfInt rasterizationOrderStencilAttachmentAccess$layout() {
        return rasterizationOrderStencilAttachmentAccess$LAYOUT;
    }

    private static final long rasterizationOrderStencilAttachmentAccess$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 rasterizationOrderStencilAttachmentAccess
     * }
     */
    public static final long rasterizationOrderStencilAttachmentAccess$offset() {
        return rasterizationOrderStencilAttachmentAccess$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 rasterizationOrderStencilAttachmentAccess
     * }
     */
    public static int rasterizationOrderStencilAttachmentAccess(MemorySegment struct) {
        return struct.get(rasterizationOrderStencilAttachmentAccess$LAYOUT, rasterizationOrderStencilAttachmentAccess$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 rasterizationOrderStencilAttachmentAccess
     * }
     */
    public static void rasterizationOrderStencilAttachmentAccess(MemorySegment struct, int fieldValue) {
        struct.set(rasterizationOrderStencilAttachmentAccess$LAYOUT, rasterizationOrderStencilAttachmentAccess$OFFSET, fieldValue);
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

