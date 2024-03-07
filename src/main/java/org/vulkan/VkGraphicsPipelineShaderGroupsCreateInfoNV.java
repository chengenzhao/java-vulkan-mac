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
 * struct VkGraphicsPipelineShaderGroupsCreateInfoNV {
 *     VkStructureType sType;
 *     const void *pNext;
 *     uint32_t groupCount;
 *     const VkGraphicsShaderGroupCreateInfoNV *pGroups;
 *     uint32_t pipelineCount;
 *     const VkPipeline *pPipelines;
 * }
 * }
 */
public class VkGraphicsPipelineShaderGroupsCreateInfoNV {

    VkGraphicsPipelineShaderGroupsCreateInfoNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("groupCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pGroups"),
        vulkan_h.C_INT.withName("pipelineCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pPipelines")
    ).withName("VkGraphicsPipelineShaderGroupsCreateInfoNV");

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

    private static final OfInt groupCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("groupCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t groupCount
     * }
     */
    public static final OfInt groupCount$layout() {
        return groupCount$LAYOUT;
    }

    private static final long groupCount$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t groupCount
     * }
     */
    public static final long groupCount$offset() {
        return groupCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t groupCount
     * }
     */
    public static int groupCount(MemorySegment struct) {
        return struct.get(groupCount$LAYOUT, groupCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t groupCount
     * }
     */
    public static void groupCount(MemorySegment struct, int fieldValue) {
        struct.set(groupCount$LAYOUT, groupCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pGroups$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pGroups"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkGraphicsShaderGroupCreateInfoNV *pGroups
     * }
     */
    public static final AddressLayout pGroups$layout() {
        return pGroups$LAYOUT;
    }

    private static final long pGroups$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkGraphicsShaderGroupCreateInfoNV *pGroups
     * }
     */
    public static final long pGroups$offset() {
        return pGroups$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkGraphicsShaderGroupCreateInfoNV *pGroups
     * }
     */
    public static MemorySegment pGroups(MemorySegment struct) {
        return struct.get(pGroups$LAYOUT, pGroups$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkGraphicsShaderGroupCreateInfoNV *pGroups
     * }
     */
    public static void pGroups(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pGroups$LAYOUT, pGroups$OFFSET, fieldValue);
    }

    private static final OfInt pipelineCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pipelineCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t pipelineCount
     * }
     */
    public static final OfInt pipelineCount$layout() {
        return pipelineCount$LAYOUT;
    }

    private static final long pipelineCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t pipelineCount
     * }
     */
    public static final long pipelineCount$offset() {
        return pipelineCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t pipelineCount
     * }
     */
    public static int pipelineCount(MemorySegment struct) {
        return struct.get(pipelineCount$LAYOUT, pipelineCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t pipelineCount
     * }
     */
    public static void pipelineCount(MemorySegment struct, int fieldValue) {
        struct.set(pipelineCount$LAYOUT, pipelineCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pPipelines$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pPipelines"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkPipeline *pPipelines
     * }
     */
    public static final AddressLayout pPipelines$layout() {
        return pPipelines$LAYOUT;
    }

    private static final long pPipelines$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkPipeline *pPipelines
     * }
     */
    public static final long pPipelines$offset() {
        return pPipelines$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkPipeline *pPipelines
     * }
     */
    public static MemorySegment pPipelines(MemorySegment struct) {
        return struct.get(pPipelines$LAYOUT, pPipelines$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkPipeline *pPipelines
     * }
     */
    public static void pPipelines(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pPipelines$LAYOUT, pPipelines$OFFSET, fieldValue);
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

