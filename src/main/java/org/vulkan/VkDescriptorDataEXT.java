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
 * union VkDescriptorDataEXT {
 *     const VkSampler *pSampler;
 *     const VkDescriptorImageInfo *pCombinedImageSampler;
 *     const VkDescriptorImageInfo *pInputAttachmentImage;
 *     const VkDescriptorImageInfo *pSampledImage;
 *     const VkDescriptorImageInfo *pStorageImage;
 *     const VkDescriptorAddressInfoEXT *pUniformTexelBuffer;
 *     const VkDescriptorAddressInfoEXT *pStorageTexelBuffer;
 *     const VkDescriptorAddressInfoEXT *pUniformBuffer;
 *     const VkDescriptorAddressInfoEXT *pStorageBuffer;
 *     VkDeviceAddress accelerationStructure;
 * }
 * }
 */
public class VkDescriptorDataEXT {

    VkDescriptorDataEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        vulkan_h.C_POINTER.withName("pSampler"),
        vulkan_h.C_POINTER.withName("pCombinedImageSampler"),
        vulkan_h.C_POINTER.withName("pInputAttachmentImage"),
        vulkan_h.C_POINTER.withName("pSampledImage"),
        vulkan_h.C_POINTER.withName("pStorageImage"),
        vulkan_h.C_POINTER.withName("pUniformTexelBuffer"),
        vulkan_h.C_POINTER.withName("pStorageTexelBuffer"),
        vulkan_h.C_POINTER.withName("pUniformBuffer"),
        vulkan_h.C_POINTER.withName("pStorageBuffer"),
        vulkan_h.C_LONG_LONG.withName("accelerationStructure")
    ).withName("VkDescriptorDataEXT");

    /**
     * The layout of this union
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pSampler$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pSampler"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkSampler *pSampler
     * }
     */
    public static final AddressLayout pSampler$layout() {
        return pSampler$LAYOUT;
    }

    private static final long pSampler$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkSampler *pSampler
     * }
     */
    public static final long pSampler$offset() {
        return pSampler$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkSampler *pSampler
     * }
     */
    public static MemorySegment pSampler(MemorySegment union) {
        return union.get(pSampler$LAYOUT, pSampler$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkSampler *pSampler
     * }
     */
    public static void pSampler(MemorySegment union, MemorySegment fieldValue) {
        union.set(pSampler$LAYOUT, pSampler$OFFSET, fieldValue);
    }

    private static final AddressLayout pCombinedImageSampler$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pCombinedImageSampler"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pCombinedImageSampler
     * }
     */
    public static final AddressLayout pCombinedImageSampler$layout() {
        return pCombinedImageSampler$LAYOUT;
    }

    private static final long pCombinedImageSampler$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pCombinedImageSampler
     * }
     */
    public static final long pCombinedImageSampler$offset() {
        return pCombinedImageSampler$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pCombinedImageSampler
     * }
     */
    public static MemorySegment pCombinedImageSampler(MemorySegment union) {
        return union.get(pCombinedImageSampler$LAYOUT, pCombinedImageSampler$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pCombinedImageSampler
     * }
     */
    public static void pCombinedImageSampler(MemorySegment union, MemorySegment fieldValue) {
        union.set(pCombinedImageSampler$LAYOUT, pCombinedImageSampler$OFFSET, fieldValue);
    }

    private static final AddressLayout pInputAttachmentImage$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pInputAttachmentImage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pInputAttachmentImage
     * }
     */
    public static final AddressLayout pInputAttachmentImage$layout() {
        return pInputAttachmentImage$LAYOUT;
    }

    private static final long pInputAttachmentImage$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pInputAttachmentImage
     * }
     */
    public static final long pInputAttachmentImage$offset() {
        return pInputAttachmentImage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pInputAttachmentImage
     * }
     */
    public static MemorySegment pInputAttachmentImage(MemorySegment union) {
        return union.get(pInputAttachmentImage$LAYOUT, pInputAttachmentImage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pInputAttachmentImage
     * }
     */
    public static void pInputAttachmentImage(MemorySegment union, MemorySegment fieldValue) {
        union.set(pInputAttachmentImage$LAYOUT, pInputAttachmentImage$OFFSET, fieldValue);
    }

    private static final AddressLayout pSampledImage$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pSampledImage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pSampledImage
     * }
     */
    public static final AddressLayout pSampledImage$layout() {
        return pSampledImage$LAYOUT;
    }

    private static final long pSampledImage$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pSampledImage
     * }
     */
    public static final long pSampledImage$offset() {
        return pSampledImage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pSampledImage
     * }
     */
    public static MemorySegment pSampledImage(MemorySegment union) {
        return union.get(pSampledImage$LAYOUT, pSampledImage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pSampledImage
     * }
     */
    public static void pSampledImage(MemorySegment union, MemorySegment fieldValue) {
        union.set(pSampledImage$LAYOUT, pSampledImage$OFFSET, fieldValue);
    }

    private static final AddressLayout pStorageImage$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pStorageImage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pStorageImage
     * }
     */
    public static final AddressLayout pStorageImage$layout() {
        return pStorageImage$LAYOUT;
    }

    private static final long pStorageImage$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pStorageImage
     * }
     */
    public static final long pStorageImage$offset() {
        return pStorageImage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pStorageImage
     * }
     */
    public static MemorySegment pStorageImage(MemorySegment union) {
        return union.get(pStorageImage$LAYOUT, pStorageImage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pStorageImage
     * }
     */
    public static void pStorageImage(MemorySegment union, MemorySegment fieldValue) {
        union.set(pStorageImage$LAYOUT, pStorageImage$OFFSET, fieldValue);
    }

    private static final AddressLayout pUniformTexelBuffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pUniformTexelBuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pUniformTexelBuffer
     * }
     */
    public static final AddressLayout pUniformTexelBuffer$layout() {
        return pUniformTexelBuffer$LAYOUT;
    }

    private static final long pUniformTexelBuffer$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pUniformTexelBuffer
     * }
     */
    public static final long pUniformTexelBuffer$offset() {
        return pUniformTexelBuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pUniformTexelBuffer
     * }
     */
    public static MemorySegment pUniformTexelBuffer(MemorySegment union) {
        return union.get(pUniformTexelBuffer$LAYOUT, pUniformTexelBuffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pUniformTexelBuffer
     * }
     */
    public static void pUniformTexelBuffer(MemorySegment union, MemorySegment fieldValue) {
        union.set(pUniformTexelBuffer$LAYOUT, pUniformTexelBuffer$OFFSET, fieldValue);
    }

    private static final AddressLayout pStorageTexelBuffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pStorageTexelBuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pStorageTexelBuffer
     * }
     */
    public static final AddressLayout pStorageTexelBuffer$layout() {
        return pStorageTexelBuffer$LAYOUT;
    }

    private static final long pStorageTexelBuffer$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pStorageTexelBuffer
     * }
     */
    public static final long pStorageTexelBuffer$offset() {
        return pStorageTexelBuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pStorageTexelBuffer
     * }
     */
    public static MemorySegment pStorageTexelBuffer(MemorySegment union) {
        return union.get(pStorageTexelBuffer$LAYOUT, pStorageTexelBuffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pStorageTexelBuffer
     * }
     */
    public static void pStorageTexelBuffer(MemorySegment union, MemorySegment fieldValue) {
        union.set(pStorageTexelBuffer$LAYOUT, pStorageTexelBuffer$OFFSET, fieldValue);
    }

    private static final AddressLayout pUniformBuffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pUniformBuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pUniformBuffer
     * }
     */
    public static final AddressLayout pUniformBuffer$layout() {
        return pUniformBuffer$LAYOUT;
    }

    private static final long pUniformBuffer$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pUniformBuffer
     * }
     */
    public static final long pUniformBuffer$offset() {
        return pUniformBuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pUniformBuffer
     * }
     */
    public static MemorySegment pUniformBuffer(MemorySegment union) {
        return union.get(pUniformBuffer$LAYOUT, pUniformBuffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pUniformBuffer
     * }
     */
    public static void pUniformBuffer(MemorySegment union, MemorySegment fieldValue) {
        union.set(pUniformBuffer$LAYOUT, pUniformBuffer$OFFSET, fieldValue);
    }

    private static final AddressLayout pStorageBuffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pStorageBuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pStorageBuffer
     * }
     */
    public static final AddressLayout pStorageBuffer$layout() {
        return pStorageBuffer$LAYOUT;
    }

    private static final long pStorageBuffer$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pStorageBuffer
     * }
     */
    public static final long pStorageBuffer$offset() {
        return pStorageBuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pStorageBuffer
     * }
     */
    public static MemorySegment pStorageBuffer(MemorySegment union) {
        return union.get(pStorageBuffer$LAYOUT, pStorageBuffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkDescriptorAddressInfoEXT *pStorageBuffer
     * }
     */
    public static void pStorageBuffer(MemorySegment union, MemorySegment fieldValue) {
        union.set(pStorageBuffer$LAYOUT, pStorageBuffer$OFFSET, fieldValue);
    }

    private static final OfLong accelerationStructure$LAYOUT = (OfLong)$LAYOUT.select(groupElement("accelerationStructure"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceAddress accelerationStructure
     * }
     */
    public static final OfLong accelerationStructure$layout() {
        return accelerationStructure$LAYOUT;
    }

    private static final long accelerationStructure$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceAddress accelerationStructure
     * }
     */
    public static final long accelerationStructure$offset() {
        return accelerationStructure$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceAddress accelerationStructure
     * }
     */
    public static long accelerationStructure(MemorySegment union) {
        return union.get(accelerationStructure$LAYOUT, accelerationStructure$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceAddress accelerationStructure
     * }
     */
    public static void accelerationStructure(MemorySegment union, long fieldValue) {
        union.set(accelerationStructure$LAYOUT, accelerationStructure$OFFSET, fieldValue);
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

