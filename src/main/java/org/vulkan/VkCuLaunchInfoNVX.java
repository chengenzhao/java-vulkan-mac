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
 * struct VkCuLaunchInfoNVX {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkCuFunctionNVX function;
 *     uint32_t gridDimX;
 *     uint32_t gridDimY;
 *     uint32_t gridDimZ;
 *     uint32_t blockDimX;
 *     uint32_t blockDimY;
 *     uint32_t blockDimZ;
 *     uint32_t sharedMemBytes;
 *     size_t paramCount;
 *     const void *const *pParams;
 *     size_t extraCount;
 *     const void *const *pExtras;
 * }
 * }
 */
public class VkCuLaunchInfoNVX {

    VkCuLaunchInfoNVX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_POINTER.withName("function"),
        vulkan_h.C_INT.withName("gridDimX"),
        vulkan_h.C_INT.withName("gridDimY"),
        vulkan_h.C_INT.withName("gridDimZ"),
        vulkan_h.C_INT.withName("blockDimX"),
        vulkan_h.C_INT.withName("blockDimY"),
        vulkan_h.C_INT.withName("blockDimZ"),
        vulkan_h.C_INT.withName("sharedMemBytes"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_LONG.withName("paramCount"),
        vulkan_h.C_POINTER.withName("pParams"),
        vulkan_h.C_LONG.withName("extraCount"),
        vulkan_h.C_POINTER.withName("pExtras")
    ).withName("VkCuLaunchInfoNVX");

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

    private static final AddressLayout function$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("function"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkCuFunctionNVX function
     * }
     */
    public static final AddressLayout function$layout() {
        return function$LAYOUT;
    }

    private static final long function$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkCuFunctionNVX function
     * }
     */
    public static final long function$offset() {
        return function$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkCuFunctionNVX function
     * }
     */
    public static MemorySegment function(MemorySegment struct) {
        return struct.get(function$LAYOUT, function$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkCuFunctionNVX function
     * }
     */
    public static void function(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(function$LAYOUT, function$OFFSET, fieldValue);
    }

    private static final OfInt gridDimX$LAYOUT = (OfInt)$LAYOUT.select(groupElement("gridDimX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t gridDimX
     * }
     */
    public static final OfInt gridDimX$layout() {
        return gridDimX$LAYOUT;
    }

    private static final long gridDimX$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t gridDimX
     * }
     */
    public static final long gridDimX$offset() {
        return gridDimX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t gridDimX
     * }
     */
    public static int gridDimX(MemorySegment struct) {
        return struct.get(gridDimX$LAYOUT, gridDimX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t gridDimX
     * }
     */
    public static void gridDimX(MemorySegment struct, int fieldValue) {
        struct.set(gridDimX$LAYOUT, gridDimX$OFFSET, fieldValue);
    }

    private static final OfInt gridDimY$LAYOUT = (OfInt)$LAYOUT.select(groupElement("gridDimY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t gridDimY
     * }
     */
    public static final OfInt gridDimY$layout() {
        return gridDimY$LAYOUT;
    }

    private static final long gridDimY$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t gridDimY
     * }
     */
    public static final long gridDimY$offset() {
        return gridDimY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t gridDimY
     * }
     */
    public static int gridDimY(MemorySegment struct) {
        return struct.get(gridDimY$LAYOUT, gridDimY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t gridDimY
     * }
     */
    public static void gridDimY(MemorySegment struct, int fieldValue) {
        struct.set(gridDimY$LAYOUT, gridDimY$OFFSET, fieldValue);
    }

    private static final OfInt gridDimZ$LAYOUT = (OfInt)$LAYOUT.select(groupElement("gridDimZ"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t gridDimZ
     * }
     */
    public static final OfInt gridDimZ$layout() {
        return gridDimZ$LAYOUT;
    }

    private static final long gridDimZ$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t gridDimZ
     * }
     */
    public static final long gridDimZ$offset() {
        return gridDimZ$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t gridDimZ
     * }
     */
    public static int gridDimZ(MemorySegment struct) {
        return struct.get(gridDimZ$LAYOUT, gridDimZ$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t gridDimZ
     * }
     */
    public static void gridDimZ(MemorySegment struct, int fieldValue) {
        struct.set(gridDimZ$LAYOUT, gridDimZ$OFFSET, fieldValue);
    }

    private static final OfInt blockDimX$LAYOUT = (OfInt)$LAYOUT.select(groupElement("blockDimX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t blockDimX
     * }
     */
    public static final OfInt blockDimX$layout() {
        return blockDimX$LAYOUT;
    }

    private static final long blockDimX$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t blockDimX
     * }
     */
    public static final long blockDimX$offset() {
        return blockDimX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t blockDimX
     * }
     */
    public static int blockDimX(MemorySegment struct) {
        return struct.get(blockDimX$LAYOUT, blockDimX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t blockDimX
     * }
     */
    public static void blockDimX(MemorySegment struct, int fieldValue) {
        struct.set(blockDimX$LAYOUT, blockDimX$OFFSET, fieldValue);
    }

    private static final OfInt blockDimY$LAYOUT = (OfInt)$LAYOUT.select(groupElement("blockDimY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t blockDimY
     * }
     */
    public static final OfInt blockDimY$layout() {
        return blockDimY$LAYOUT;
    }

    private static final long blockDimY$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t blockDimY
     * }
     */
    public static final long blockDimY$offset() {
        return blockDimY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t blockDimY
     * }
     */
    public static int blockDimY(MemorySegment struct) {
        return struct.get(blockDimY$LAYOUT, blockDimY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t blockDimY
     * }
     */
    public static void blockDimY(MemorySegment struct, int fieldValue) {
        struct.set(blockDimY$LAYOUT, blockDimY$OFFSET, fieldValue);
    }

    private static final OfInt blockDimZ$LAYOUT = (OfInt)$LAYOUT.select(groupElement("blockDimZ"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t blockDimZ
     * }
     */
    public static final OfInt blockDimZ$layout() {
        return blockDimZ$LAYOUT;
    }

    private static final long blockDimZ$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t blockDimZ
     * }
     */
    public static final long blockDimZ$offset() {
        return blockDimZ$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t blockDimZ
     * }
     */
    public static int blockDimZ(MemorySegment struct) {
        return struct.get(blockDimZ$LAYOUT, blockDimZ$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t blockDimZ
     * }
     */
    public static void blockDimZ(MemorySegment struct, int fieldValue) {
        struct.set(blockDimZ$LAYOUT, blockDimZ$OFFSET, fieldValue);
    }

    private static final OfInt sharedMemBytes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sharedMemBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t sharedMemBytes
     * }
     */
    public static final OfInt sharedMemBytes$layout() {
        return sharedMemBytes$LAYOUT;
    }

    private static final long sharedMemBytes$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t sharedMemBytes
     * }
     */
    public static final long sharedMemBytes$offset() {
        return sharedMemBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t sharedMemBytes
     * }
     */
    public static int sharedMemBytes(MemorySegment struct) {
        return struct.get(sharedMemBytes$LAYOUT, sharedMemBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t sharedMemBytes
     * }
     */
    public static void sharedMemBytes(MemorySegment struct, int fieldValue) {
        struct.set(sharedMemBytes$LAYOUT, sharedMemBytes$OFFSET, fieldValue);
    }

    private static final OfLong paramCount$LAYOUT = (OfLong)$LAYOUT.select(groupElement("paramCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t paramCount
     * }
     */
    public static final OfLong paramCount$layout() {
        return paramCount$LAYOUT;
    }

    private static final long paramCount$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t paramCount
     * }
     */
    public static final long paramCount$offset() {
        return paramCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t paramCount
     * }
     */
    public static long paramCount(MemorySegment struct) {
        return struct.get(paramCount$LAYOUT, paramCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t paramCount
     * }
     */
    public static void paramCount(MemorySegment struct, long fieldValue) {
        struct.set(paramCount$LAYOUT, paramCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pParams$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pParams"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const void *const *pParams
     * }
     */
    public static final AddressLayout pParams$layout() {
        return pParams$LAYOUT;
    }

    private static final long pParams$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *const *pParams
     * }
     */
    public static final long pParams$offset() {
        return pParams$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *const *pParams
     * }
     */
    public static MemorySegment pParams(MemorySegment struct) {
        return struct.get(pParams$LAYOUT, pParams$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *const *pParams
     * }
     */
    public static void pParams(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pParams$LAYOUT, pParams$OFFSET, fieldValue);
    }

    private static final OfLong extraCount$LAYOUT = (OfLong)$LAYOUT.select(groupElement("extraCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t extraCount
     * }
     */
    public static final OfLong extraCount$layout() {
        return extraCount$LAYOUT;
    }

    private static final long extraCount$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t extraCount
     * }
     */
    public static final long extraCount$offset() {
        return extraCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t extraCount
     * }
     */
    public static long extraCount(MemorySegment struct) {
        return struct.get(extraCount$LAYOUT, extraCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t extraCount
     * }
     */
    public static void extraCount(MemorySegment struct, long fieldValue) {
        struct.set(extraCount$LAYOUT, extraCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pExtras$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pExtras"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const void *const *pExtras
     * }
     */
    public static final AddressLayout pExtras$layout() {
        return pExtras$LAYOUT;
    }

    private static final long pExtras$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *const *pExtras
     * }
     */
    public static final long pExtras$offset() {
        return pExtras$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *const *pExtras
     * }
     */
    public static MemorySegment pExtras(MemorySegment struct) {
        return struct.get(pExtras$LAYOUT, pExtras$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *const *pExtras
     * }
     */
    public static void pExtras(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pExtras$LAYOUT, pExtras$OFFSET, fieldValue);
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

