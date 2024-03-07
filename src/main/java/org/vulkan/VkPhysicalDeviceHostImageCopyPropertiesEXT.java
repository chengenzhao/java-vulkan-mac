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
 * struct VkPhysicalDeviceHostImageCopyPropertiesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     uint32_t copySrcLayoutCount;
 *     VkImageLayout *pCopySrcLayouts;
 *     uint32_t copyDstLayoutCount;
 *     VkImageLayout *pCopyDstLayouts;
 *     uint8_t optimalTilingLayoutUUID[16];
 *     VkBool32 identicalMemoryTypeRequirements;
 * }
 * }
 */
public class VkPhysicalDeviceHostImageCopyPropertiesEXT {

    VkPhysicalDeviceHostImageCopyPropertiesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("copySrcLayoutCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pCopySrcLayouts"),
        vulkan_h.C_INT.withName("copyDstLayoutCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pCopyDstLayouts"),
        MemoryLayout.sequenceLayout(16, vulkan_h.C_CHAR).withName("optimalTilingLayoutUUID"),
        vulkan_h.C_INT.withName("identicalMemoryTypeRequirements"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceHostImageCopyPropertiesEXT");

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

    private static final OfInt copySrcLayoutCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("copySrcLayoutCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t copySrcLayoutCount
     * }
     */
    public static final OfInt copySrcLayoutCount$layout() {
        return copySrcLayoutCount$LAYOUT;
    }

    private static final long copySrcLayoutCount$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t copySrcLayoutCount
     * }
     */
    public static final long copySrcLayoutCount$offset() {
        return copySrcLayoutCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t copySrcLayoutCount
     * }
     */
    public static int copySrcLayoutCount(MemorySegment struct) {
        return struct.get(copySrcLayoutCount$LAYOUT, copySrcLayoutCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t copySrcLayoutCount
     * }
     */
    public static void copySrcLayoutCount(MemorySegment struct, int fieldValue) {
        struct.set(copySrcLayoutCount$LAYOUT, copySrcLayoutCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pCopySrcLayouts$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pCopySrcLayouts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageLayout *pCopySrcLayouts
     * }
     */
    public static final AddressLayout pCopySrcLayouts$layout() {
        return pCopySrcLayouts$LAYOUT;
    }

    private static final long pCopySrcLayouts$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageLayout *pCopySrcLayouts
     * }
     */
    public static final long pCopySrcLayouts$offset() {
        return pCopySrcLayouts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageLayout *pCopySrcLayouts
     * }
     */
    public static MemorySegment pCopySrcLayouts(MemorySegment struct) {
        return struct.get(pCopySrcLayouts$LAYOUT, pCopySrcLayouts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageLayout *pCopySrcLayouts
     * }
     */
    public static void pCopySrcLayouts(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pCopySrcLayouts$LAYOUT, pCopySrcLayouts$OFFSET, fieldValue);
    }

    private static final OfInt copyDstLayoutCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("copyDstLayoutCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t copyDstLayoutCount
     * }
     */
    public static final OfInt copyDstLayoutCount$layout() {
        return copyDstLayoutCount$LAYOUT;
    }

    private static final long copyDstLayoutCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t copyDstLayoutCount
     * }
     */
    public static final long copyDstLayoutCount$offset() {
        return copyDstLayoutCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t copyDstLayoutCount
     * }
     */
    public static int copyDstLayoutCount(MemorySegment struct) {
        return struct.get(copyDstLayoutCount$LAYOUT, copyDstLayoutCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t copyDstLayoutCount
     * }
     */
    public static void copyDstLayoutCount(MemorySegment struct, int fieldValue) {
        struct.set(copyDstLayoutCount$LAYOUT, copyDstLayoutCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pCopyDstLayouts$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pCopyDstLayouts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageLayout *pCopyDstLayouts
     * }
     */
    public static final AddressLayout pCopyDstLayouts$layout() {
        return pCopyDstLayouts$LAYOUT;
    }

    private static final long pCopyDstLayouts$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageLayout *pCopyDstLayouts
     * }
     */
    public static final long pCopyDstLayouts$offset() {
        return pCopyDstLayouts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageLayout *pCopyDstLayouts
     * }
     */
    public static MemorySegment pCopyDstLayouts(MemorySegment struct) {
        return struct.get(pCopyDstLayouts$LAYOUT, pCopyDstLayouts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageLayout *pCopyDstLayouts
     * }
     */
    public static void pCopyDstLayouts(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pCopyDstLayouts$LAYOUT, pCopyDstLayouts$OFFSET, fieldValue);
    }

    private static final SequenceLayout optimalTilingLayoutUUID$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("optimalTilingLayoutUUID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t optimalTilingLayoutUUID[16]
     * }
     */
    public static final SequenceLayout optimalTilingLayoutUUID$layout() {
        return optimalTilingLayoutUUID$LAYOUT;
    }

    private static final long optimalTilingLayoutUUID$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t optimalTilingLayoutUUID[16]
     * }
     */
    public static final long optimalTilingLayoutUUID$offset() {
        return optimalTilingLayoutUUID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t optimalTilingLayoutUUID[16]
     * }
     */
    public static MemorySegment optimalTilingLayoutUUID(MemorySegment struct) {
        return struct.asSlice(optimalTilingLayoutUUID$OFFSET, optimalTilingLayoutUUID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t optimalTilingLayoutUUID[16]
     * }
     */
    public static void optimalTilingLayoutUUID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, optimalTilingLayoutUUID$OFFSET, optimalTilingLayoutUUID$LAYOUT.byteSize());
    }

    private static long[] optimalTilingLayoutUUID$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t optimalTilingLayoutUUID[16]
     * }
     */
    public static long[] optimalTilingLayoutUUID$dimensions() {
        return optimalTilingLayoutUUID$DIMS;
    }
    private static final VarHandle optimalTilingLayoutUUID$ELEM_HANDLE = optimalTilingLayoutUUID$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t optimalTilingLayoutUUID[16]
     * }
     */
    public static byte optimalTilingLayoutUUID(MemorySegment struct, long index0) {
        return (byte)optimalTilingLayoutUUID$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t optimalTilingLayoutUUID[16]
     * }
     */
    public static void optimalTilingLayoutUUID(MemorySegment struct, long index0, byte fieldValue) {
        optimalTilingLayoutUUID$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt identicalMemoryTypeRequirements$LAYOUT = (OfInt)$LAYOUT.select(groupElement("identicalMemoryTypeRequirements"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 identicalMemoryTypeRequirements
     * }
     */
    public static final OfInt identicalMemoryTypeRequirements$layout() {
        return identicalMemoryTypeRequirements$LAYOUT;
    }

    private static final long identicalMemoryTypeRequirements$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 identicalMemoryTypeRequirements
     * }
     */
    public static final long identicalMemoryTypeRequirements$offset() {
        return identicalMemoryTypeRequirements$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 identicalMemoryTypeRequirements
     * }
     */
    public static int identicalMemoryTypeRequirements(MemorySegment struct) {
        return struct.get(identicalMemoryTypeRequirements$LAYOUT, identicalMemoryTypeRequirements$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 identicalMemoryTypeRequirements
     * }
     */
    public static void identicalMemoryTypeRequirements(MemorySegment struct, int fieldValue) {
        struct.set(identicalMemoryTypeRequirements$LAYOUT, identicalMemoryTypeRequirements$OFFSET, fieldValue);
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

