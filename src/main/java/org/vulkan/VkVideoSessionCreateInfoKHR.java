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
 * struct VkVideoSessionCreateInfoKHR {
 *     VkStructureType sType;
 *     const void *pNext;
 *     uint32_t queueFamilyIndex;
 *     VkVideoSessionCreateFlagsKHR flags;
 *     const VkVideoProfileInfoKHR *pVideoProfile;
 *     VkFormat pictureFormat;
 *     VkExtent2D maxCodedExtent;
 *     VkFormat referencePictureFormat;
 *     uint32_t maxDpbSlots;
 *     uint32_t maxActiveReferencePictures;
 *     const VkExtensionProperties *pStdHeaderVersion;
 * }
 * }
 */
public class VkVideoSessionCreateInfoKHR {

    VkVideoSessionCreateInfoKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("queueFamilyIndex"),
        vulkan_h.C_INT.withName("flags"),
        vulkan_h.C_POINTER.withName("pVideoProfile"),
        vulkan_h.C_INT.withName("pictureFormat"),
        VkExtent2D.layout().withName("maxCodedExtent"),
        vulkan_h.C_INT.withName("referencePictureFormat"),
        vulkan_h.C_INT.withName("maxDpbSlots"),
        vulkan_h.C_INT.withName("maxActiveReferencePictures"),
        vulkan_h.C_POINTER.withName("pStdHeaderVersion")
    ).withName("VkVideoSessionCreateInfoKHR");

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

    private static final OfInt queueFamilyIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("queueFamilyIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t queueFamilyIndex
     * }
     */
    public static final OfInt queueFamilyIndex$layout() {
        return queueFamilyIndex$LAYOUT;
    }

    private static final long queueFamilyIndex$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t queueFamilyIndex
     * }
     */
    public static final long queueFamilyIndex$offset() {
        return queueFamilyIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t queueFamilyIndex
     * }
     */
    public static int queueFamilyIndex(MemorySegment struct) {
        return struct.get(queueFamilyIndex$LAYOUT, queueFamilyIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t queueFamilyIndex
     * }
     */
    public static void queueFamilyIndex(MemorySegment struct, int fieldValue) {
        struct.set(queueFamilyIndex$LAYOUT, queueFamilyIndex$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkVideoSessionCreateFlagsKHR flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkVideoSessionCreateFlagsKHR flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkVideoSessionCreateFlagsKHR flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkVideoSessionCreateFlagsKHR flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final AddressLayout pVideoProfile$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pVideoProfile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkVideoProfileInfoKHR *pVideoProfile
     * }
     */
    public static final AddressLayout pVideoProfile$layout() {
        return pVideoProfile$LAYOUT;
    }

    private static final long pVideoProfile$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkVideoProfileInfoKHR *pVideoProfile
     * }
     */
    public static final long pVideoProfile$offset() {
        return pVideoProfile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkVideoProfileInfoKHR *pVideoProfile
     * }
     */
    public static MemorySegment pVideoProfile(MemorySegment struct) {
        return struct.get(pVideoProfile$LAYOUT, pVideoProfile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkVideoProfileInfoKHR *pVideoProfile
     * }
     */
    public static void pVideoProfile(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pVideoProfile$LAYOUT, pVideoProfile$OFFSET, fieldValue);
    }

    private static final OfInt pictureFormat$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pictureFormat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkFormat pictureFormat
     * }
     */
    public static final OfInt pictureFormat$layout() {
        return pictureFormat$LAYOUT;
    }

    private static final long pictureFormat$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkFormat pictureFormat
     * }
     */
    public static final long pictureFormat$offset() {
        return pictureFormat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkFormat pictureFormat
     * }
     */
    public static int pictureFormat(MemorySegment struct) {
        return struct.get(pictureFormat$LAYOUT, pictureFormat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkFormat pictureFormat
     * }
     */
    public static void pictureFormat(MemorySegment struct, int fieldValue) {
        struct.set(pictureFormat$LAYOUT, pictureFormat$OFFSET, fieldValue);
    }

    private static final GroupLayout maxCodedExtent$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("maxCodedExtent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D maxCodedExtent
     * }
     */
    public static final GroupLayout maxCodedExtent$layout() {
        return maxCodedExtent$LAYOUT;
    }

    private static final long maxCodedExtent$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D maxCodedExtent
     * }
     */
    public static final long maxCodedExtent$offset() {
        return maxCodedExtent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D maxCodedExtent
     * }
     */
    public static MemorySegment maxCodedExtent(MemorySegment struct) {
        return struct.asSlice(maxCodedExtent$OFFSET, maxCodedExtent$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D maxCodedExtent
     * }
     */
    public static void maxCodedExtent(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, maxCodedExtent$OFFSET, maxCodedExtent$LAYOUT.byteSize());
    }

    private static final OfInt referencePictureFormat$LAYOUT = (OfInt)$LAYOUT.select(groupElement("referencePictureFormat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkFormat referencePictureFormat
     * }
     */
    public static final OfInt referencePictureFormat$layout() {
        return referencePictureFormat$LAYOUT;
    }

    private static final long referencePictureFormat$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkFormat referencePictureFormat
     * }
     */
    public static final long referencePictureFormat$offset() {
        return referencePictureFormat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkFormat referencePictureFormat
     * }
     */
    public static int referencePictureFormat(MemorySegment struct) {
        return struct.get(referencePictureFormat$LAYOUT, referencePictureFormat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkFormat referencePictureFormat
     * }
     */
    public static void referencePictureFormat(MemorySegment struct, int fieldValue) {
        struct.set(referencePictureFormat$LAYOUT, referencePictureFormat$OFFSET, fieldValue);
    }

    private static final OfInt maxDpbSlots$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxDpbSlots"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxDpbSlots
     * }
     */
    public static final OfInt maxDpbSlots$layout() {
        return maxDpbSlots$LAYOUT;
    }

    private static final long maxDpbSlots$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxDpbSlots
     * }
     */
    public static final long maxDpbSlots$offset() {
        return maxDpbSlots$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxDpbSlots
     * }
     */
    public static int maxDpbSlots(MemorySegment struct) {
        return struct.get(maxDpbSlots$LAYOUT, maxDpbSlots$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxDpbSlots
     * }
     */
    public static void maxDpbSlots(MemorySegment struct, int fieldValue) {
        struct.set(maxDpbSlots$LAYOUT, maxDpbSlots$OFFSET, fieldValue);
    }

    private static final OfInt maxActiveReferencePictures$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxActiveReferencePictures"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxActiveReferencePictures
     * }
     */
    public static final OfInt maxActiveReferencePictures$layout() {
        return maxActiveReferencePictures$LAYOUT;
    }

    private static final long maxActiveReferencePictures$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxActiveReferencePictures
     * }
     */
    public static final long maxActiveReferencePictures$offset() {
        return maxActiveReferencePictures$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxActiveReferencePictures
     * }
     */
    public static int maxActiveReferencePictures(MemorySegment struct) {
        return struct.get(maxActiveReferencePictures$LAYOUT, maxActiveReferencePictures$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxActiveReferencePictures
     * }
     */
    public static void maxActiveReferencePictures(MemorySegment struct, int fieldValue) {
        struct.set(maxActiveReferencePictures$LAYOUT, maxActiveReferencePictures$OFFSET, fieldValue);
    }

    private static final AddressLayout pStdHeaderVersion$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pStdHeaderVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkExtensionProperties *pStdHeaderVersion
     * }
     */
    public static final AddressLayout pStdHeaderVersion$layout() {
        return pStdHeaderVersion$LAYOUT;
    }

    private static final long pStdHeaderVersion$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkExtensionProperties *pStdHeaderVersion
     * }
     */
    public static final long pStdHeaderVersion$offset() {
        return pStdHeaderVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkExtensionProperties *pStdHeaderVersion
     * }
     */
    public static MemorySegment pStdHeaderVersion(MemorySegment struct) {
        return struct.get(pStdHeaderVersion$LAYOUT, pStdHeaderVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkExtensionProperties *pStdHeaderVersion
     * }
     */
    public static void pStdHeaderVersion(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pStdHeaderVersion$LAYOUT, pStdHeaderVersion$OFFSET, fieldValue);
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

