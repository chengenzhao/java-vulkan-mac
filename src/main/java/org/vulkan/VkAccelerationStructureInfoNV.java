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
 * struct VkAccelerationStructureInfoNV {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkAccelerationStructureTypeNV type;
 *     VkBuildAccelerationStructureFlagsNV flags;
 *     uint32_t instanceCount;
 *     uint32_t geometryCount;
 *     const VkGeometryNV *pGeometries;
 * }
 * }
 */
public class VkAccelerationStructureInfoNV {

    VkAccelerationStructureInfoNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("type"),
        vulkan_h.C_INT.withName("flags"),
        vulkan_h.C_INT.withName("instanceCount"),
        vulkan_h.C_INT.withName("geometryCount"),
        vulkan_h.C_POINTER.withName("pGeometries")
    ).withName("VkAccelerationStructureInfoNV");

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

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkAccelerationStructureTypeNV type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkAccelerationStructureTypeNV type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureTypeNV type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureTypeNV type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBuildAccelerationStructureFlagsNV flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBuildAccelerationStructureFlagsNV flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBuildAccelerationStructureFlagsNV flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBuildAccelerationStructureFlagsNV flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt instanceCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("instanceCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t instanceCount
     * }
     */
    public static final OfInt instanceCount$layout() {
        return instanceCount$LAYOUT;
    }

    private static final long instanceCount$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t instanceCount
     * }
     */
    public static final long instanceCount$offset() {
        return instanceCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t instanceCount
     * }
     */
    public static int instanceCount(MemorySegment struct) {
        return struct.get(instanceCount$LAYOUT, instanceCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t instanceCount
     * }
     */
    public static void instanceCount(MemorySegment struct, int fieldValue) {
        struct.set(instanceCount$LAYOUT, instanceCount$OFFSET, fieldValue);
    }

    private static final OfInt geometryCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("geometryCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t geometryCount
     * }
     */
    public static final OfInt geometryCount$layout() {
        return geometryCount$LAYOUT;
    }

    private static final long geometryCount$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t geometryCount
     * }
     */
    public static final long geometryCount$offset() {
        return geometryCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t geometryCount
     * }
     */
    public static int geometryCount(MemorySegment struct) {
        return struct.get(geometryCount$LAYOUT, geometryCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t geometryCount
     * }
     */
    public static void geometryCount(MemorySegment struct, int fieldValue) {
        struct.set(geometryCount$LAYOUT, geometryCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pGeometries$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pGeometries"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkGeometryNV *pGeometries
     * }
     */
    public static final AddressLayout pGeometries$layout() {
        return pGeometries$LAYOUT;
    }

    private static final long pGeometries$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkGeometryNV *pGeometries
     * }
     */
    public static final long pGeometries$offset() {
        return pGeometries$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkGeometryNV *pGeometries
     * }
     */
    public static MemorySegment pGeometries(MemorySegment struct) {
        return struct.get(pGeometries$LAYOUT, pGeometries$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkGeometryNV *pGeometries
     * }
     */
    public static void pGeometries(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pGeometries$LAYOUT, pGeometries$OFFSET, fieldValue);
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

