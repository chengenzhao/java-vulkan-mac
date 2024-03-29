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
 * struct VkComputePipelineIndirectBufferInfoNV {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkDeviceAddress deviceAddress;
 *     VkDeviceSize size;
 *     VkDeviceAddress pipelineDeviceAddressCaptureReplay;
 * }
 * }
 */
public class VkComputePipelineIndirectBufferInfoNV {

    VkComputePipelineIndirectBufferInfoNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_LONG_LONG.withName("deviceAddress"),
        vulkan_h.C_LONG_LONG.withName("size"),
        vulkan_h.C_LONG_LONG.withName("pipelineDeviceAddressCaptureReplay")
    ).withName("VkComputePipelineIndirectBufferInfoNV");

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

    private static final OfLong deviceAddress$LAYOUT = (OfLong)$LAYOUT.select(groupElement("deviceAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceAddress deviceAddress
     * }
     */
    public static final OfLong deviceAddress$layout() {
        return deviceAddress$LAYOUT;
    }

    private static final long deviceAddress$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceAddress deviceAddress
     * }
     */
    public static final long deviceAddress$offset() {
        return deviceAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceAddress deviceAddress
     * }
     */
    public static long deviceAddress(MemorySegment struct) {
        return struct.get(deviceAddress$LAYOUT, deviceAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceAddress deviceAddress
     * }
     */
    public static void deviceAddress(MemorySegment struct, long fieldValue) {
        struct.set(deviceAddress$LAYOUT, deviceAddress$OFFSET, fieldValue);
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

    private static final long size$OFFSET = 24;

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

    private static final OfLong pipelineDeviceAddressCaptureReplay$LAYOUT = (OfLong)$LAYOUT.select(groupElement("pipelineDeviceAddressCaptureReplay"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceAddress pipelineDeviceAddressCaptureReplay
     * }
     */
    public static final OfLong pipelineDeviceAddressCaptureReplay$layout() {
        return pipelineDeviceAddressCaptureReplay$LAYOUT;
    }

    private static final long pipelineDeviceAddressCaptureReplay$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceAddress pipelineDeviceAddressCaptureReplay
     * }
     */
    public static final long pipelineDeviceAddressCaptureReplay$offset() {
        return pipelineDeviceAddressCaptureReplay$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceAddress pipelineDeviceAddressCaptureReplay
     * }
     */
    public static long pipelineDeviceAddressCaptureReplay(MemorySegment struct) {
        return struct.get(pipelineDeviceAddressCaptureReplay$LAYOUT, pipelineDeviceAddressCaptureReplay$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceAddress pipelineDeviceAddressCaptureReplay
     * }
     */
    public static void pipelineDeviceAddressCaptureReplay(MemorySegment struct, long fieldValue) {
        struct.set(pipelineDeviceAddressCaptureReplay$LAYOUT, pipelineDeviceAddressCaptureReplay$OFFSET, fieldValue);
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

