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
 * struct VkPipelineMultisampleStateCreateInfo {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkPipelineMultisampleStateCreateFlags flags;
 *     VkSampleCountFlagBits rasterizationSamples;
 *     VkBool32 sampleShadingEnable;
 *     float minSampleShading;
 *     const VkSampleMask *pSampleMask;
 *     VkBool32 alphaToCoverageEnable;
 *     VkBool32 alphaToOneEnable;
 * }
 * }
 */
public class VkPipelineMultisampleStateCreateInfo {

    VkPipelineMultisampleStateCreateInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("flags"),
        vulkan_h.C_INT.withName("rasterizationSamples"),
        vulkan_h.C_INT.withName("sampleShadingEnable"),
        vulkan_h.C_FLOAT.withName("minSampleShading"),
        vulkan_h.C_POINTER.withName("pSampleMask"),
        vulkan_h.C_INT.withName("alphaToCoverageEnable"),
        vulkan_h.C_INT.withName("alphaToOneEnable")
    ).withName("VkPipelineMultisampleStateCreateInfo");

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

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPipelineMultisampleStateCreateFlags flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPipelineMultisampleStateCreateFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPipelineMultisampleStateCreateFlags flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPipelineMultisampleStateCreateFlags flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt rasterizationSamples$LAYOUT = (OfInt)$LAYOUT.select(groupElement("rasterizationSamples"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkSampleCountFlagBits rasterizationSamples
     * }
     */
    public static final OfInt rasterizationSamples$layout() {
        return rasterizationSamples$LAYOUT;
    }

    private static final long rasterizationSamples$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkSampleCountFlagBits rasterizationSamples
     * }
     */
    public static final long rasterizationSamples$offset() {
        return rasterizationSamples$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkSampleCountFlagBits rasterizationSamples
     * }
     */
    public static int rasterizationSamples(MemorySegment struct) {
        return struct.get(rasterizationSamples$LAYOUT, rasterizationSamples$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkSampleCountFlagBits rasterizationSamples
     * }
     */
    public static void rasterizationSamples(MemorySegment struct, int fieldValue) {
        struct.set(rasterizationSamples$LAYOUT, rasterizationSamples$OFFSET, fieldValue);
    }

    private static final OfInt sampleShadingEnable$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sampleShadingEnable"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 sampleShadingEnable
     * }
     */
    public static final OfInt sampleShadingEnable$layout() {
        return sampleShadingEnable$LAYOUT;
    }

    private static final long sampleShadingEnable$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 sampleShadingEnable
     * }
     */
    public static final long sampleShadingEnable$offset() {
        return sampleShadingEnable$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 sampleShadingEnable
     * }
     */
    public static int sampleShadingEnable(MemorySegment struct) {
        return struct.get(sampleShadingEnable$LAYOUT, sampleShadingEnable$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 sampleShadingEnable
     * }
     */
    public static void sampleShadingEnable(MemorySegment struct, int fieldValue) {
        struct.set(sampleShadingEnable$LAYOUT, sampleShadingEnable$OFFSET, fieldValue);
    }

    private static final OfFloat minSampleShading$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("minSampleShading"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float minSampleShading
     * }
     */
    public static final OfFloat minSampleShading$layout() {
        return minSampleShading$LAYOUT;
    }

    private static final long minSampleShading$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float minSampleShading
     * }
     */
    public static final long minSampleShading$offset() {
        return minSampleShading$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float minSampleShading
     * }
     */
    public static float minSampleShading(MemorySegment struct) {
        return struct.get(minSampleShading$LAYOUT, minSampleShading$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float minSampleShading
     * }
     */
    public static void minSampleShading(MemorySegment struct, float fieldValue) {
        struct.set(minSampleShading$LAYOUT, minSampleShading$OFFSET, fieldValue);
    }

    private static final AddressLayout pSampleMask$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pSampleMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkSampleMask *pSampleMask
     * }
     */
    public static final AddressLayout pSampleMask$layout() {
        return pSampleMask$LAYOUT;
    }

    private static final long pSampleMask$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkSampleMask *pSampleMask
     * }
     */
    public static final long pSampleMask$offset() {
        return pSampleMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkSampleMask *pSampleMask
     * }
     */
    public static MemorySegment pSampleMask(MemorySegment struct) {
        return struct.get(pSampleMask$LAYOUT, pSampleMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkSampleMask *pSampleMask
     * }
     */
    public static void pSampleMask(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pSampleMask$LAYOUT, pSampleMask$OFFSET, fieldValue);
    }

    private static final OfInt alphaToCoverageEnable$LAYOUT = (OfInt)$LAYOUT.select(groupElement("alphaToCoverageEnable"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 alphaToCoverageEnable
     * }
     */
    public static final OfInt alphaToCoverageEnable$layout() {
        return alphaToCoverageEnable$LAYOUT;
    }

    private static final long alphaToCoverageEnable$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 alphaToCoverageEnable
     * }
     */
    public static final long alphaToCoverageEnable$offset() {
        return alphaToCoverageEnable$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 alphaToCoverageEnable
     * }
     */
    public static int alphaToCoverageEnable(MemorySegment struct) {
        return struct.get(alphaToCoverageEnable$LAYOUT, alphaToCoverageEnable$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 alphaToCoverageEnable
     * }
     */
    public static void alphaToCoverageEnable(MemorySegment struct, int fieldValue) {
        struct.set(alphaToCoverageEnable$LAYOUT, alphaToCoverageEnable$OFFSET, fieldValue);
    }

    private static final OfInt alphaToOneEnable$LAYOUT = (OfInt)$LAYOUT.select(groupElement("alphaToOneEnable"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 alphaToOneEnable
     * }
     */
    public static final OfInt alphaToOneEnable$layout() {
        return alphaToOneEnable$LAYOUT;
    }

    private static final long alphaToOneEnable$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 alphaToOneEnable
     * }
     */
    public static final long alphaToOneEnable$offset() {
        return alphaToOneEnable$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 alphaToOneEnable
     * }
     */
    public static int alphaToOneEnable(MemorySegment struct) {
        return struct.get(alphaToOneEnable$LAYOUT, alphaToOneEnable$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 alphaToOneEnable
     * }
     */
    public static void alphaToOneEnable(MemorySegment struct, int fieldValue) {
        struct.set(alphaToOneEnable$LAYOUT, alphaToOneEnable$OFFSET, fieldValue);
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

