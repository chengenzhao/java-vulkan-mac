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
 * struct VkPresentInfoKHR {
 *     VkStructureType sType;
 *     const void *pNext;
 *     uint32_t waitSemaphoreCount;
 *     const VkSemaphore *pWaitSemaphores;
 *     uint32_t swapchainCount;
 *     const VkSwapchainKHR *pSwapchains;
 *     const uint32_t *pImageIndices;
 *     VkResult *pResults;
 * }
 * }
 */
public class VkPresentInfoKHR {

    VkPresentInfoKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("waitSemaphoreCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pWaitSemaphores"),
        vulkan_h.C_INT.withName("swapchainCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pSwapchains"),
        vulkan_h.C_POINTER.withName("pImageIndices"),
        vulkan_h.C_POINTER.withName("pResults")
    ).withName("VkPresentInfoKHR");

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

    private static final OfInt waitSemaphoreCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("waitSemaphoreCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t waitSemaphoreCount
     * }
     */
    public static final OfInt waitSemaphoreCount$layout() {
        return waitSemaphoreCount$LAYOUT;
    }

    private static final long waitSemaphoreCount$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t waitSemaphoreCount
     * }
     */
    public static final long waitSemaphoreCount$offset() {
        return waitSemaphoreCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t waitSemaphoreCount
     * }
     */
    public static int waitSemaphoreCount(MemorySegment struct) {
        return struct.get(waitSemaphoreCount$LAYOUT, waitSemaphoreCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t waitSemaphoreCount
     * }
     */
    public static void waitSemaphoreCount(MemorySegment struct, int fieldValue) {
        struct.set(waitSemaphoreCount$LAYOUT, waitSemaphoreCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pWaitSemaphores$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pWaitSemaphores"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkSemaphore *pWaitSemaphores
     * }
     */
    public static final AddressLayout pWaitSemaphores$layout() {
        return pWaitSemaphores$LAYOUT;
    }

    private static final long pWaitSemaphores$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkSemaphore *pWaitSemaphores
     * }
     */
    public static final long pWaitSemaphores$offset() {
        return pWaitSemaphores$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkSemaphore *pWaitSemaphores
     * }
     */
    public static MemorySegment pWaitSemaphores(MemorySegment struct) {
        return struct.get(pWaitSemaphores$LAYOUT, pWaitSemaphores$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkSemaphore *pWaitSemaphores
     * }
     */
    public static void pWaitSemaphores(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pWaitSemaphores$LAYOUT, pWaitSemaphores$OFFSET, fieldValue);
    }

    private static final OfInt swapchainCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("swapchainCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t swapchainCount
     * }
     */
    public static final OfInt swapchainCount$layout() {
        return swapchainCount$LAYOUT;
    }

    private static final long swapchainCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t swapchainCount
     * }
     */
    public static final long swapchainCount$offset() {
        return swapchainCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t swapchainCount
     * }
     */
    public static int swapchainCount(MemorySegment struct) {
        return struct.get(swapchainCount$LAYOUT, swapchainCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t swapchainCount
     * }
     */
    public static void swapchainCount(MemorySegment struct, int fieldValue) {
        struct.set(swapchainCount$LAYOUT, swapchainCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pSwapchains$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pSwapchains"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkSwapchainKHR *pSwapchains
     * }
     */
    public static final AddressLayout pSwapchains$layout() {
        return pSwapchains$LAYOUT;
    }

    private static final long pSwapchains$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkSwapchainKHR *pSwapchains
     * }
     */
    public static final long pSwapchains$offset() {
        return pSwapchains$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkSwapchainKHR *pSwapchains
     * }
     */
    public static MemorySegment pSwapchains(MemorySegment struct) {
        return struct.get(pSwapchains$LAYOUT, pSwapchains$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkSwapchainKHR *pSwapchains
     * }
     */
    public static void pSwapchains(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pSwapchains$LAYOUT, pSwapchains$OFFSET, fieldValue);
    }

    private static final AddressLayout pImageIndices$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pImageIndices"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const uint32_t *pImageIndices
     * }
     */
    public static final AddressLayout pImageIndices$layout() {
        return pImageIndices$LAYOUT;
    }

    private static final long pImageIndices$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const uint32_t *pImageIndices
     * }
     */
    public static final long pImageIndices$offset() {
        return pImageIndices$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const uint32_t *pImageIndices
     * }
     */
    public static MemorySegment pImageIndices(MemorySegment struct) {
        return struct.get(pImageIndices$LAYOUT, pImageIndices$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const uint32_t *pImageIndices
     * }
     */
    public static void pImageIndices(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pImageIndices$LAYOUT, pImageIndices$OFFSET, fieldValue);
    }

    private static final AddressLayout pResults$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pResults"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkResult *pResults
     * }
     */
    public static final AddressLayout pResults$layout() {
        return pResults$LAYOUT;
    }

    private static final long pResults$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkResult *pResults
     * }
     */
    public static final long pResults$offset() {
        return pResults$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkResult *pResults
     * }
     */
    public static MemorySegment pResults(MemorySegment struct) {
        return struct.get(pResults$LAYOUT, pResults$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkResult *pResults
     * }
     */
    public static void pResults(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pResults$LAYOUT, pResults$OFFSET, fieldValue);
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

