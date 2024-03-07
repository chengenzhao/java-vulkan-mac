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
 * struct VkWriteDescriptorSet {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkDescriptorSet dstSet;
 *     uint32_t dstBinding;
 *     uint32_t dstArrayElement;
 *     uint32_t descriptorCount;
 *     VkDescriptorType descriptorType;
 *     const VkDescriptorImageInfo *pImageInfo;
 *     const VkDescriptorBufferInfo *pBufferInfo;
 *     const VkBufferView *pTexelBufferView;
 * }
 * }
 */
public class VkWriteDescriptorSet {

    VkWriteDescriptorSet() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_POINTER.withName("dstSet"),
        vulkan_h.C_INT.withName("dstBinding"),
        vulkan_h.C_INT.withName("dstArrayElement"),
        vulkan_h.C_INT.withName("descriptorCount"),
        vulkan_h.C_INT.withName("descriptorType"),
        vulkan_h.C_POINTER.withName("pImageInfo"),
        vulkan_h.C_POINTER.withName("pBufferInfo"),
        vulkan_h.C_POINTER.withName("pTexelBufferView")
    ).withName("VkWriteDescriptorSet");

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

    private static final AddressLayout dstSet$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dstSet"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDescriptorSet dstSet
     * }
     */
    public static final AddressLayout dstSet$layout() {
        return dstSet$LAYOUT;
    }

    private static final long dstSet$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDescriptorSet dstSet
     * }
     */
    public static final long dstSet$offset() {
        return dstSet$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDescriptorSet dstSet
     * }
     */
    public static MemorySegment dstSet(MemorySegment struct) {
        return struct.get(dstSet$LAYOUT, dstSet$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDescriptorSet dstSet
     * }
     */
    public static void dstSet(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dstSet$LAYOUT, dstSet$OFFSET, fieldValue);
    }

    private static final OfInt dstBinding$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dstBinding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t dstBinding
     * }
     */
    public static final OfInt dstBinding$layout() {
        return dstBinding$LAYOUT;
    }

    private static final long dstBinding$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t dstBinding
     * }
     */
    public static final long dstBinding$offset() {
        return dstBinding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t dstBinding
     * }
     */
    public static int dstBinding(MemorySegment struct) {
        return struct.get(dstBinding$LAYOUT, dstBinding$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t dstBinding
     * }
     */
    public static void dstBinding(MemorySegment struct, int fieldValue) {
        struct.set(dstBinding$LAYOUT, dstBinding$OFFSET, fieldValue);
    }

    private static final OfInt dstArrayElement$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dstArrayElement"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t dstArrayElement
     * }
     */
    public static final OfInt dstArrayElement$layout() {
        return dstArrayElement$LAYOUT;
    }

    private static final long dstArrayElement$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t dstArrayElement
     * }
     */
    public static final long dstArrayElement$offset() {
        return dstArrayElement$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t dstArrayElement
     * }
     */
    public static int dstArrayElement(MemorySegment struct) {
        return struct.get(dstArrayElement$LAYOUT, dstArrayElement$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t dstArrayElement
     * }
     */
    public static void dstArrayElement(MemorySegment struct, int fieldValue) {
        struct.set(dstArrayElement$LAYOUT, dstArrayElement$OFFSET, fieldValue);
    }

    private static final OfInt descriptorCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("descriptorCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t descriptorCount
     * }
     */
    public static final OfInt descriptorCount$layout() {
        return descriptorCount$LAYOUT;
    }

    private static final long descriptorCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t descriptorCount
     * }
     */
    public static final long descriptorCount$offset() {
        return descriptorCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t descriptorCount
     * }
     */
    public static int descriptorCount(MemorySegment struct) {
        return struct.get(descriptorCount$LAYOUT, descriptorCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t descriptorCount
     * }
     */
    public static void descriptorCount(MemorySegment struct, int fieldValue) {
        struct.set(descriptorCount$LAYOUT, descriptorCount$OFFSET, fieldValue);
    }

    private static final OfInt descriptorType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("descriptorType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDescriptorType descriptorType
     * }
     */
    public static final OfInt descriptorType$layout() {
        return descriptorType$LAYOUT;
    }

    private static final long descriptorType$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDescriptorType descriptorType
     * }
     */
    public static final long descriptorType$offset() {
        return descriptorType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDescriptorType descriptorType
     * }
     */
    public static int descriptorType(MemorySegment struct) {
        return struct.get(descriptorType$LAYOUT, descriptorType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDescriptorType descriptorType
     * }
     */
    public static void descriptorType(MemorySegment struct, int fieldValue) {
        struct.set(descriptorType$LAYOUT, descriptorType$OFFSET, fieldValue);
    }

    private static final AddressLayout pImageInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pImageInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pImageInfo
     * }
     */
    public static final AddressLayout pImageInfo$layout() {
        return pImageInfo$LAYOUT;
    }

    private static final long pImageInfo$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pImageInfo
     * }
     */
    public static final long pImageInfo$offset() {
        return pImageInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pImageInfo
     * }
     */
    public static MemorySegment pImageInfo(MemorySegment struct) {
        return struct.get(pImageInfo$LAYOUT, pImageInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkDescriptorImageInfo *pImageInfo
     * }
     */
    public static void pImageInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pImageInfo$LAYOUT, pImageInfo$OFFSET, fieldValue);
    }

    private static final AddressLayout pBufferInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pBufferInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkDescriptorBufferInfo *pBufferInfo
     * }
     */
    public static final AddressLayout pBufferInfo$layout() {
        return pBufferInfo$LAYOUT;
    }

    private static final long pBufferInfo$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkDescriptorBufferInfo *pBufferInfo
     * }
     */
    public static final long pBufferInfo$offset() {
        return pBufferInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkDescriptorBufferInfo *pBufferInfo
     * }
     */
    public static MemorySegment pBufferInfo(MemorySegment struct) {
        return struct.get(pBufferInfo$LAYOUT, pBufferInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkDescriptorBufferInfo *pBufferInfo
     * }
     */
    public static void pBufferInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pBufferInfo$LAYOUT, pBufferInfo$OFFSET, fieldValue);
    }

    private static final AddressLayout pTexelBufferView$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pTexelBufferView"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkBufferView *pTexelBufferView
     * }
     */
    public static final AddressLayout pTexelBufferView$layout() {
        return pTexelBufferView$LAYOUT;
    }

    private static final long pTexelBufferView$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkBufferView *pTexelBufferView
     * }
     */
    public static final long pTexelBufferView$offset() {
        return pTexelBufferView$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkBufferView *pTexelBufferView
     * }
     */
    public static MemorySegment pTexelBufferView(MemorySegment struct) {
        return struct.get(pTexelBufferView$LAYOUT, pTexelBufferView$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkBufferView *pTexelBufferView
     * }
     */
    public static void pTexelBufferView(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pTexelBufferView$LAYOUT, pTexelBufferView$OFFSET, fieldValue);
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

