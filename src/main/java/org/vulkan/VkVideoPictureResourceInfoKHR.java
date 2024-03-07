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
 * struct VkVideoPictureResourceInfoKHR {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkOffset2D codedOffset;
 *     VkExtent2D codedExtent;
 *     uint32_t baseArrayLayer;
 *     VkImageView imageViewBinding;
 * }
 * }
 */
public class VkVideoPictureResourceInfoKHR {

    VkVideoPictureResourceInfoKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        VkOffset2D.layout().withName("codedOffset"),
        VkExtent2D.layout().withName("codedExtent"),
        vulkan_h.C_INT.withName("baseArrayLayer"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("imageViewBinding")
    ).withName("VkVideoPictureResourceInfoKHR");

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
     * const void *pNext
     * }
     */
    public static final AddressLayout pNext$layout() {
        return pNext$LAYOUT;
    }

    private static final long pNext$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static final long pNext$offset() {
        return pNext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static MemorySegment pNext(MemorySegment struct) {
        return struct.get(pNext$LAYOUT, pNext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static void pNext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pNext$LAYOUT, pNext$OFFSET, fieldValue);
    }

    private static final GroupLayout codedOffset$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("codedOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkOffset2D codedOffset
     * }
     */
    public static final GroupLayout codedOffset$layout() {
        return codedOffset$LAYOUT;
    }

    private static final long codedOffset$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkOffset2D codedOffset
     * }
     */
    public static final long codedOffset$offset() {
        return codedOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkOffset2D codedOffset
     * }
     */
    public static MemorySegment codedOffset(MemorySegment struct) {
        return struct.asSlice(codedOffset$OFFSET, codedOffset$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkOffset2D codedOffset
     * }
     */
    public static void codedOffset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, codedOffset$OFFSET, codedOffset$LAYOUT.byteSize());
    }

    private static final GroupLayout codedExtent$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("codedExtent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D codedExtent
     * }
     */
    public static final GroupLayout codedExtent$layout() {
        return codedExtent$LAYOUT;
    }

    private static final long codedExtent$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D codedExtent
     * }
     */
    public static final long codedExtent$offset() {
        return codedExtent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D codedExtent
     * }
     */
    public static MemorySegment codedExtent(MemorySegment struct) {
        return struct.asSlice(codedExtent$OFFSET, codedExtent$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D codedExtent
     * }
     */
    public static void codedExtent(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, codedExtent$OFFSET, codedExtent$LAYOUT.byteSize());
    }

    private static final OfInt baseArrayLayer$LAYOUT = (OfInt)$LAYOUT.select(groupElement("baseArrayLayer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t baseArrayLayer
     * }
     */
    public static final OfInt baseArrayLayer$layout() {
        return baseArrayLayer$LAYOUT;
    }

    private static final long baseArrayLayer$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t baseArrayLayer
     * }
     */
    public static final long baseArrayLayer$offset() {
        return baseArrayLayer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t baseArrayLayer
     * }
     */
    public static int baseArrayLayer(MemorySegment struct) {
        return struct.get(baseArrayLayer$LAYOUT, baseArrayLayer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t baseArrayLayer
     * }
     */
    public static void baseArrayLayer(MemorySegment struct, int fieldValue) {
        struct.set(baseArrayLayer$LAYOUT, baseArrayLayer$OFFSET, fieldValue);
    }

    private static final AddressLayout imageViewBinding$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("imageViewBinding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageView imageViewBinding
     * }
     */
    public static final AddressLayout imageViewBinding$layout() {
        return imageViewBinding$LAYOUT;
    }

    private static final long imageViewBinding$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageView imageViewBinding
     * }
     */
    public static final long imageViewBinding$offset() {
        return imageViewBinding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageView imageViewBinding
     * }
     */
    public static MemorySegment imageViewBinding(MemorySegment struct) {
        return struct.get(imageViewBinding$LAYOUT, imageViewBinding$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageView imageViewBinding
     * }
     */
    public static void imageViewBinding(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(imageViewBinding$LAYOUT, imageViewBinding$OFFSET, fieldValue);
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

