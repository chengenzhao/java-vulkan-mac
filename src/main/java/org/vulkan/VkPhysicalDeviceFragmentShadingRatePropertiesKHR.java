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
 * struct VkPhysicalDeviceFragmentShadingRatePropertiesKHR {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkExtent2D minFragmentShadingRateAttachmentTexelSize;
 *     VkExtent2D maxFragmentShadingRateAttachmentTexelSize;
 *     uint32_t maxFragmentShadingRateAttachmentTexelSizeAspectRatio;
 *     VkBool32 primitiveFragmentShadingRateWithMultipleViewports;
 *     VkBool32 layeredShadingRateAttachments;
 *     VkBool32 fragmentShadingRateNonTrivialCombinerOps;
 *     VkExtent2D maxFragmentSize;
 *     uint32_t maxFragmentSizeAspectRatio;
 *     uint32_t maxFragmentShadingRateCoverageSamples;
 *     VkSampleCountFlagBits maxFragmentShadingRateRasterizationSamples;
 *     VkBool32 fragmentShadingRateWithShaderDepthStencilWrites;
 *     VkBool32 fragmentShadingRateWithSampleMask;
 *     VkBool32 fragmentShadingRateWithShaderSampleMask;
 *     VkBool32 fragmentShadingRateWithConservativeRasterization;
 *     VkBool32 fragmentShadingRateWithFragmentShaderInterlock;
 *     VkBool32 fragmentShadingRateWithCustomSampleLocations;
 *     VkBool32 fragmentShadingRateStrictMultiplyCombiner;
 * }
 * }
 */
public class VkPhysicalDeviceFragmentShadingRatePropertiesKHR {

    VkPhysicalDeviceFragmentShadingRatePropertiesKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        VkExtent2D.layout().withName("minFragmentShadingRateAttachmentTexelSize"),
        VkExtent2D.layout().withName("maxFragmentShadingRateAttachmentTexelSize"),
        vulkan_h.C_INT.withName("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"),
        vulkan_h.C_INT.withName("primitiveFragmentShadingRateWithMultipleViewports"),
        vulkan_h.C_INT.withName("layeredShadingRateAttachments"),
        vulkan_h.C_INT.withName("fragmentShadingRateNonTrivialCombinerOps"),
        VkExtent2D.layout().withName("maxFragmentSize"),
        vulkan_h.C_INT.withName("maxFragmentSizeAspectRatio"),
        vulkan_h.C_INT.withName("maxFragmentShadingRateCoverageSamples"),
        vulkan_h.C_INT.withName("maxFragmentShadingRateRasterizationSamples"),
        vulkan_h.C_INT.withName("fragmentShadingRateWithShaderDepthStencilWrites"),
        vulkan_h.C_INT.withName("fragmentShadingRateWithSampleMask"),
        vulkan_h.C_INT.withName("fragmentShadingRateWithShaderSampleMask"),
        vulkan_h.C_INT.withName("fragmentShadingRateWithConservativeRasterization"),
        vulkan_h.C_INT.withName("fragmentShadingRateWithFragmentShaderInterlock"),
        vulkan_h.C_INT.withName("fragmentShadingRateWithCustomSampleLocations"),
        vulkan_h.C_INT.withName("fragmentShadingRateStrictMultiplyCombiner")
    ).withName("VkPhysicalDeviceFragmentShadingRatePropertiesKHR");

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

    private static final GroupLayout minFragmentShadingRateAttachmentTexelSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("minFragmentShadingRateAttachmentTexelSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D minFragmentShadingRateAttachmentTexelSize
     * }
     */
    public static final GroupLayout minFragmentShadingRateAttachmentTexelSize$layout() {
        return minFragmentShadingRateAttachmentTexelSize$LAYOUT;
    }

    private static final long minFragmentShadingRateAttachmentTexelSize$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D minFragmentShadingRateAttachmentTexelSize
     * }
     */
    public static final long minFragmentShadingRateAttachmentTexelSize$offset() {
        return minFragmentShadingRateAttachmentTexelSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D minFragmentShadingRateAttachmentTexelSize
     * }
     */
    public static MemorySegment minFragmentShadingRateAttachmentTexelSize(MemorySegment struct) {
        return struct.asSlice(minFragmentShadingRateAttachmentTexelSize$OFFSET, minFragmentShadingRateAttachmentTexelSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D minFragmentShadingRateAttachmentTexelSize
     * }
     */
    public static void minFragmentShadingRateAttachmentTexelSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, minFragmentShadingRateAttachmentTexelSize$OFFSET, minFragmentShadingRateAttachmentTexelSize$LAYOUT.byteSize());
    }

    private static final GroupLayout maxFragmentShadingRateAttachmentTexelSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("maxFragmentShadingRateAttachmentTexelSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D maxFragmentShadingRateAttachmentTexelSize
     * }
     */
    public static final GroupLayout maxFragmentShadingRateAttachmentTexelSize$layout() {
        return maxFragmentShadingRateAttachmentTexelSize$LAYOUT;
    }

    private static final long maxFragmentShadingRateAttachmentTexelSize$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D maxFragmentShadingRateAttachmentTexelSize
     * }
     */
    public static final long maxFragmentShadingRateAttachmentTexelSize$offset() {
        return maxFragmentShadingRateAttachmentTexelSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D maxFragmentShadingRateAttachmentTexelSize
     * }
     */
    public static MemorySegment maxFragmentShadingRateAttachmentTexelSize(MemorySegment struct) {
        return struct.asSlice(maxFragmentShadingRateAttachmentTexelSize$OFFSET, maxFragmentShadingRateAttachmentTexelSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D maxFragmentShadingRateAttachmentTexelSize
     * }
     */
    public static void maxFragmentShadingRateAttachmentTexelSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, maxFragmentShadingRateAttachmentTexelSize$OFFSET, maxFragmentShadingRateAttachmentTexelSize$LAYOUT.byteSize());
    }

    private static final OfInt maxFragmentShadingRateAttachmentTexelSizeAspectRatio$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxFragmentShadingRateAttachmentTexelSizeAspectRatio
     * }
     */
    public static final OfInt maxFragmentShadingRateAttachmentTexelSizeAspectRatio$layout() {
        return maxFragmentShadingRateAttachmentTexelSizeAspectRatio$LAYOUT;
    }

    private static final long maxFragmentShadingRateAttachmentTexelSizeAspectRatio$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxFragmentShadingRateAttachmentTexelSizeAspectRatio
     * }
     */
    public static final long maxFragmentShadingRateAttachmentTexelSizeAspectRatio$offset() {
        return maxFragmentShadingRateAttachmentTexelSizeAspectRatio$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxFragmentShadingRateAttachmentTexelSizeAspectRatio
     * }
     */
    public static int maxFragmentShadingRateAttachmentTexelSizeAspectRatio(MemorySegment struct) {
        return struct.get(maxFragmentShadingRateAttachmentTexelSizeAspectRatio$LAYOUT, maxFragmentShadingRateAttachmentTexelSizeAspectRatio$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxFragmentShadingRateAttachmentTexelSizeAspectRatio
     * }
     */
    public static void maxFragmentShadingRateAttachmentTexelSizeAspectRatio(MemorySegment struct, int fieldValue) {
        struct.set(maxFragmentShadingRateAttachmentTexelSizeAspectRatio$LAYOUT, maxFragmentShadingRateAttachmentTexelSizeAspectRatio$OFFSET, fieldValue);
    }

    private static final OfInt primitiveFragmentShadingRateWithMultipleViewports$LAYOUT = (OfInt)$LAYOUT.select(groupElement("primitiveFragmentShadingRateWithMultipleViewports"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 primitiveFragmentShadingRateWithMultipleViewports
     * }
     */
    public static final OfInt primitiveFragmentShadingRateWithMultipleViewports$layout() {
        return primitiveFragmentShadingRateWithMultipleViewports$LAYOUT;
    }

    private static final long primitiveFragmentShadingRateWithMultipleViewports$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 primitiveFragmentShadingRateWithMultipleViewports
     * }
     */
    public static final long primitiveFragmentShadingRateWithMultipleViewports$offset() {
        return primitiveFragmentShadingRateWithMultipleViewports$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 primitiveFragmentShadingRateWithMultipleViewports
     * }
     */
    public static int primitiveFragmentShadingRateWithMultipleViewports(MemorySegment struct) {
        return struct.get(primitiveFragmentShadingRateWithMultipleViewports$LAYOUT, primitiveFragmentShadingRateWithMultipleViewports$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 primitiveFragmentShadingRateWithMultipleViewports
     * }
     */
    public static void primitiveFragmentShadingRateWithMultipleViewports(MemorySegment struct, int fieldValue) {
        struct.set(primitiveFragmentShadingRateWithMultipleViewports$LAYOUT, primitiveFragmentShadingRateWithMultipleViewports$OFFSET, fieldValue);
    }

    private static final OfInt layeredShadingRateAttachments$LAYOUT = (OfInt)$LAYOUT.select(groupElement("layeredShadingRateAttachments"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 layeredShadingRateAttachments
     * }
     */
    public static final OfInt layeredShadingRateAttachments$layout() {
        return layeredShadingRateAttachments$LAYOUT;
    }

    private static final long layeredShadingRateAttachments$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 layeredShadingRateAttachments
     * }
     */
    public static final long layeredShadingRateAttachments$offset() {
        return layeredShadingRateAttachments$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 layeredShadingRateAttachments
     * }
     */
    public static int layeredShadingRateAttachments(MemorySegment struct) {
        return struct.get(layeredShadingRateAttachments$LAYOUT, layeredShadingRateAttachments$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 layeredShadingRateAttachments
     * }
     */
    public static void layeredShadingRateAttachments(MemorySegment struct, int fieldValue) {
        struct.set(layeredShadingRateAttachments$LAYOUT, layeredShadingRateAttachments$OFFSET, fieldValue);
    }

    private static final OfInt fragmentShadingRateNonTrivialCombinerOps$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fragmentShadingRateNonTrivialCombinerOps"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateNonTrivialCombinerOps
     * }
     */
    public static final OfInt fragmentShadingRateNonTrivialCombinerOps$layout() {
        return fragmentShadingRateNonTrivialCombinerOps$LAYOUT;
    }

    private static final long fragmentShadingRateNonTrivialCombinerOps$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateNonTrivialCombinerOps
     * }
     */
    public static final long fragmentShadingRateNonTrivialCombinerOps$offset() {
        return fragmentShadingRateNonTrivialCombinerOps$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateNonTrivialCombinerOps
     * }
     */
    public static int fragmentShadingRateNonTrivialCombinerOps(MemorySegment struct) {
        return struct.get(fragmentShadingRateNonTrivialCombinerOps$LAYOUT, fragmentShadingRateNonTrivialCombinerOps$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateNonTrivialCombinerOps
     * }
     */
    public static void fragmentShadingRateNonTrivialCombinerOps(MemorySegment struct, int fieldValue) {
        struct.set(fragmentShadingRateNonTrivialCombinerOps$LAYOUT, fragmentShadingRateNonTrivialCombinerOps$OFFSET, fieldValue);
    }

    private static final GroupLayout maxFragmentSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("maxFragmentSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D maxFragmentSize
     * }
     */
    public static final GroupLayout maxFragmentSize$layout() {
        return maxFragmentSize$LAYOUT;
    }

    private static final long maxFragmentSize$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D maxFragmentSize
     * }
     */
    public static final long maxFragmentSize$offset() {
        return maxFragmentSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D maxFragmentSize
     * }
     */
    public static MemorySegment maxFragmentSize(MemorySegment struct) {
        return struct.asSlice(maxFragmentSize$OFFSET, maxFragmentSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D maxFragmentSize
     * }
     */
    public static void maxFragmentSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, maxFragmentSize$OFFSET, maxFragmentSize$LAYOUT.byteSize());
    }

    private static final OfInt maxFragmentSizeAspectRatio$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxFragmentSizeAspectRatio"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxFragmentSizeAspectRatio
     * }
     */
    public static final OfInt maxFragmentSizeAspectRatio$layout() {
        return maxFragmentSizeAspectRatio$LAYOUT;
    }

    private static final long maxFragmentSizeAspectRatio$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxFragmentSizeAspectRatio
     * }
     */
    public static final long maxFragmentSizeAspectRatio$offset() {
        return maxFragmentSizeAspectRatio$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxFragmentSizeAspectRatio
     * }
     */
    public static int maxFragmentSizeAspectRatio(MemorySegment struct) {
        return struct.get(maxFragmentSizeAspectRatio$LAYOUT, maxFragmentSizeAspectRatio$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxFragmentSizeAspectRatio
     * }
     */
    public static void maxFragmentSizeAspectRatio(MemorySegment struct, int fieldValue) {
        struct.set(maxFragmentSizeAspectRatio$LAYOUT, maxFragmentSizeAspectRatio$OFFSET, fieldValue);
    }

    private static final OfInt maxFragmentShadingRateCoverageSamples$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxFragmentShadingRateCoverageSamples"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxFragmentShadingRateCoverageSamples
     * }
     */
    public static final OfInt maxFragmentShadingRateCoverageSamples$layout() {
        return maxFragmentShadingRateCoverageSamples$LAYOUT;
    }

    private static final long maxFragmentShadingRateCoverageSamples$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxFragmentShadingRateCoverageSamples
     * }
     */
    public static final long maxFragmentShadingRateCoverageSamples$offset() {
        return maxFragmentShadingRateCoverageSamples$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxFragmentShadingRateCoverageSamples
     * }
     */
    public static int maxFragmentShadingRateCoverageSamples(MemorySegment struct) {
        return struct.get(maxFragmentShadingRateCoverageSamples$LAYOUT, maxFragmentShadingRateCoverageSamples$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxFragmentShadingRateCoverageSamples
     * }
     */
    public static void maxFragmentShadingRateCoverageSamples(MemorySegment struct, int fieldValue) {
        struct.set(maxFragmentShadingRateCoverageSamples$LAYOUT, maxFragmentShadingRateCoverageSamples$OFFSET, fieldValue);
    }

    private static final OfInt maxFragmentShadingRateRasterizationSamples$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxFragmentShadingRateRasterizationSamples"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkSampleCountFlagBits maxFragmentShadingRateRasterizationSamples
     * }
     */
    public static final OfInt maxFragmentShadingRateRasterizationSamples$layout() {
        return maxFragmentShadingRateRasterizationSamples$LAYOUT;
    }

    private static final long maxFragmentShadingRateRasterizationSamples$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkSampleCountFlagBits maxFragmentShadingRateRasterizationSamples
     * }
     */
    public static final long maxFragmentShadingRateRasterizationSamples$offset() {
        return maxFragmentShadingRateRasterizationSamples$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkSampleCountFlagBits maxFragmentShadingRateRasterizationSamples
     * }
     */
    public static int maxFragmentShadingRateRasterizationSamples(MemorySegment struct) {
        return struct.get(maxFragmentShadingRateRasterizationSamples$LAYOUT, maxFragmentShadingRateRasterizationSamples$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkSampleCountFlagBits maxFragmentShadingRateRasterizationSamples
     * }
     */
    public static void maxFragmentShadingRateRasterizationSamples(MemorySegment struct, int fieldValue) {
        struct.set(maxFragmentShadingRateRasterizationSamples$LAYOUT, maxFragmentShadingRateRasterizationSamples$OFFSET, fieldValue);
    }

    private static final OfInt fragmentShadingRateWithShaderDepthStencilWrites$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fragmentShadingRateWithShaderDepthStencilWrites"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithShaderDepthStencilWrites
     * }
     */
    public static final OfInt fragmentShadingRateWithShaderDepthStencilWrites$layout() {
        return fragmentShadingRateWithShaderDepthStencilWrites$LAYOUT;
    }

    private static final long fragmentShadingRateWithShaderDepthStencilWrites$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithShaderDepthStencilWrites
     * }
     */
    public static final long fragmentShadingRateWithShaderDepthStencilWrites$offset() {
        return fragmentShadingRateWithShaderDepthStencilWrites$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithShaderDepthStencilWrites
     * }
     */
    public static int fragmentShadingRateWithShaderDepthStencilWrites(MemorySegment struct) {
        return struct.get(fragmentShadingRateWithShaderDepthStencilWrites$LAYOUT, fragmentShadingRateWithShaderDepthStencilWrites$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithShaderDepthStencilWrites
     * }
     */
    public static void fragmentShadingRateWithShaderDepthStencilWrites(MemorySegment struct, int fieldValue) {
        struct.set(fragmentShadingRateWithShaderDepthStencilWrites$LAYOUT, fragmentShadingRateWithShaderDepthStencilWrites$OFFSET, fieldValue);
    }

    private static final OfInt fragmentShadingRateWithSampleMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fragmentShadingRateWithSampleMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithSampleMask
     * }
     */
    public static final OfInt fragmentShadingRateWithSampleMask$layout() {
        return fragmentShadingRateWithSampleMask$LAYOUT;
    }

    private static final long fragmentShadingRateWithSampleMask$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithSampleMask
     * }
     */
    public static final long fragmentShadingRateWithSampleMask$offset() {
        return fragmentShadingRateWithSampleMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithSampleMask
     * }
     */
    public static int fragmentShadingRateWithSampleMask(MemorySegment struct) {
        return struct.get(fragmentShadingRateWithSampleMask$LAYOUT, fragmentShadingRateWithSampleMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithSampleMask
     * }
     */
    public static void fragmentShadingRateWithSampleMask(MemorySegment struct, int fieldValue) {
        struct.set(fragmentShadingRateWithSampleMask$LAYOUT, fragmentShadingRateWithSampleMask$OFFSET, fieldValue);
    }

    private static final OfInt fragmentShadingRateWithShaderSampleMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fragmentShadingRateWithShaderSampleMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithShaderSampleMask
     * }
     */
    public static final OfInt fragmentShadingRateWithShaderSampleMask$layout() {
        return fragmentShadingRateWithShaderSampleMask$LAYOUT;
    }

    private static final long fragmentShadingRateWithShaderSampleMask$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithShaderSampleMask
     * }
     */
    public static final long fragmentShadingRateWithShaderSampleMask$offset() {
        return fragmentShadingRateWithShaderSampleMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithShaderSampleMask
     * }
     */
    public static int fragmentShadingRateWithShaderSampleMask(MemorySegment struct) {
        return struct.get(fragmentShadingRateWithShaderSampleMask$LAYOUT, fragmentShadingRateWithShaderSampleMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithShaderSampleMask
     * }
     */
    public static void fragmentShadingRateWithShaderSampleMask(MemorySegment struct, int fieldValue) {
        struct.set(fragmentShadingRateWithShaderSampleMask$LAYOUT, fragmentShadingRateWithShaderSampleMask$OFFSET, fieldValue);
    }

    private static final OfInt fragmentShadingRateWithConservativeRasterization$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fragmentShadingRateWithConservativeRasterization"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithConservativeRasterization
     * }
     */
    public static final OfInt fragmentShadingRateWithConservativeRasterization$layout() {
        return fragmentShadingRateWithConservativeRasterization$LAYOUT;
    }

    private static final long fragmentShadingRateWithConservativeRasterization$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithConservativeRasterization
     * }
     */
    public static final long fragmentShadingRateWithConservativeRasterization$offset() {
        return fragmentShadingRateWithConservativeRasterization$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithConservativeRasterization
     * }
     */
    public static int fragmentShadingRateWithConservativeRasterization(MemorySegment struct) {
        return struct.get(fragmentShadingRateWithConservativeRasterization$LAYOUT, fragmentShadingRateWithConservativeRasterization$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithConservativeRasterization
     * }
     */
    public static void fragmentShadingRateWithConservativeRasterization(MemorySegment struct, int fieldValue) {
        struct.set(fragmentShadingRateWithConservativeRasterization$LAYOUT, fragmentShadingRateWithConservativeRasterization$OFFSET, fieldValue);
    }

    private static final OfInt fragmentShadingRateWithFragmentShaderInterlock$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fragmentShadingRateWithFragmentShaderInterlock"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithFragmentShaderInterlock
     * }
     */
    public static final OfInt fragmentShadingRateWithFragmentShaderInterlock$layout() {
        return fragmentShadingRateWithFragmentShaderInterlock$LAYOUT;
    }

    private static final long fragmentShadingRateWithFragmentShaderInterlock$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithFragmentShaderInterlock
     * }
     */
    public static final long fragmentShadingRateWithFragmentShaderInterlock$offset() {
        return fragmentShadingRateWithFragmentShaderInterlock$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithFragmentShaderInterlock
     * }
     */
    public static int fragmentShadingRateWithFragmentShaderInterlock(MemorySegment struct) {
        return struct.get(fragmentShadingRateWithFragmentShaderInterlock$LAYOUT, fragmentShadingRateWithFragmentShaderInterlock$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithFragmentShaderInterlock
     * }
     */
    public static void fragmentShadingRateWithFragmentShaderInterlock(MemorySegment struct, int fieldValue) {
        struct.set(fragmentShadingRateWithFragmentShaderInterlock$LAYOUT, fragmentShadingRateWithFragmentShaderInterlock$OFFSET, fieldValue);
    }

    private static final OfInt fragmentShadingRateWithCustomSampleLocations$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fragmentShadingRateWithCustomSampleLocations"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithCustomSampleLocations
     * }
     */
    public static final OfInt fragmentShadingRateWithCustomSampleLocations$layout() {
        return fragmentShadingRateWithCustomSampleLocations$LAYOUT;
    }

    private static final long fragmentShadingRateWithCustomSampleLocations$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithCustomSampleLocations
     * }
     */
    public static final long fragmentShadingRateWithCustomSampleLocations$offset() {
        return fragmentShadingRateWithCustomSampleLocations$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithCustomSampleLocations
     * }
     */
    public static int fragmentShadingRateWithCustomSampleLocations(MemorySegment struct) {
        return struct.get(fragmentShadingRateWithCustomSampleLocations$LAYOUT, fragmentShadingRateWithCustomSampleLocations$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateWithCustomSampleLocations
     * }
     */
    public static void fragmentShadingRateWithCustomSampleLocations(MemorySegment struct, int fieldValue) {
        struct.set(fragmentShadingRateWithCustomSampleLocations$LAYOUT, fragmentShadingRateWithCustomSampleLocations$OFFSET, fieldValue);
    }

    private static final OfInt fragmentShadingRateStrictMultiplyCombiner$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fragmentShadingRateStrictMultiplyCombiner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateStrictMultiplyCombiner
     * }
     */
    public static final OfInt fragmentShadingRateStrictMultiplyCombiner$layout() {
        return fragmentShadingRateStrictMultiplyCombiner$LAYOUT;
    }

    private static final long fragmentShadingRateStrictMultiplyCombiner$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateStrictMultiplyCombiner
     * }
     */
    public static final long fragmentShadingRateStrictMultiplyCombiner$offset() {
        return fragmentShadingRateStrictMultiplyCombiner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateStrictMultiplyCombiner
     * }
     */
    public static int fragmentShadingRateStrictMultiplyCombiner(MemorySegment struct) {
        return struct.get(fragmentShadingRateStrictMultiplyCombiner$LAYOUT, fragmentShadingRateStrictMultiplyCombiner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShadingRateStrictMultiplyCombiner
     * }
     */
    public static void fragmentShadingRateStrictMultiplyCombiner(MemorySegment struct, int fieldValue) {
        struct.set(fragmentShadingRateStrictMultiplyCombiner$LAYOUT, fragmentShadingRateStrictMultiplyCombiner$OFFSET, fieldValue);
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

