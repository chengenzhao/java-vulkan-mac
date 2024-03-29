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
 * struct VkPhysicalDeviceShaderTileImagePropertiesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkBool32 shaderTileImageCoherentReadAccelerated;
 *     VkBool32 shaderTileImageReadSampleFromPixelRateInvocation;
 *     VkBool32 shaderTileImageReadFromHelperInvocation;
 * }
 * }
 */
public class VkPhysicalDeviceShaderTileImagePropertiesEXT {

    VkPhysicalDeviceShaderTileImagePropertiesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("shaderTileImageCoherentReadAccelerated"),
        vulkan_h.C_INT.withName("shaderTileImageReadSampleFromPixelRateInvocation"),
        vulkan_h.C_INT.withName("shaderTileImageReadFromHelperInvocation"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceShaderTileImagePropertiesEXT");

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

    private static final OfInt shaderTileImageCoherentReadAccelerated$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderTileImageCoherentReadAccelerated"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderTileImageCoherentReadAccelerated
     * }
     */
    public static final OfInt shaderTileImageCoherentReadAccelerated$layout() {
        return shaderTileImageCoherentReadAccelerated$LAYOUT;
    }

    private static final long shaderTileImageCoherentReadAccelerated$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderTileImageCoherentReadAccelerated
     * }
     */
    public static final long shaderTileImageCoherentReadAccelerated$offset() {
        return shaderTileImageCoherentReadAccelerated$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderTileImageCoherentReadAccelerated
     * }
     */
    public static int shaderTileImageCoherentReadAccelerated(MemorySegment struct) {
        return struct.get(shaderTileImageCoherentReadAccelerated$LAYOUT, shaderTileImageCoherentReadAccelerated$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderTileImageCoherentReadAccelerated
     * }
     */
    public static void shaderTileImageCoherentReadAccelerated(MemorySegment struct, int fieldValue) {
        struct.set(shaderTileImageCoherentReadAccelerated$LAYOUT, shaderTileImageCoherentReadAccelerated$OFFSET, fieldValue);
    }

    private static final OfInt shaderTileImageReadSampleFromPixelRateInvocation$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderTileImageReadSampleFromPixelRateInvocation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderTileImageReadSampleFromPixelRateInvocation
     * }
     */
    public static final OfInt shaderTileImageReadSampleFromPixelRateInvocation$layout() {
        return shaderTileImageReadSampleFromPixelRateInvocation$LAYOUT;
    }

    private static final long shaderTileImageReadSampleFromPixelRateInvocation$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderTileImageReadSampleFromPixelRateInvocation
     * }
     */
    public static final long shaderTileImageReadSampleFromPixelRateInvocation$offset() {
        return shaderTileImageReadSampleFromPixelRateInvocation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderTileImageReadSampleFromPixelRateInvocation
     * }
     */
    public static int shaderTileImageReadSampleFromPixelRateInvocation(MemorySegment struct) {
        return struct.get(shaderTileImageReadSampleFromPixelRateInvocation$LAYOUT, shaderTileImageReadSampleFromPixelRateInvocation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderTileImageReadSampleFromPixelRateInvocation
     * }
     */
    public static void shaderTileImageReadSampleFromPixelRateInvocation(MemorySegment struct, int fieldValue) {
        struct.set(shaderTileImageReadSampleFromPixelRateInvocation$LAYOUT, shaderTileImageReadSampleFromPixelRateInvocation$OFFSET, fieldValue);
    }

    private static final OfInt shaderTileImageReadFromHelperInvocation$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderTileImageReadFromHelperInvocation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderTileImageReadFromHelperInvocation
     * }
     */
    public static final OfInt shaderTileImageReadFromHelperInvocation$layout() {
        return shaderTileImageReadFromHelperInvocation$LAYOUT;
    }

    private static final long shaderTileImageReadFromHelperInvocation$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderTileImageReadFromHelperInvocation
     * }
     */
    public static final long shaderTileImageReadFromHelperInvocation$offset() {
        return shaderTileImageReadFromHelperInvocation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderTileImageReadFromHelperInvocation
     * }
     */
    public static int shaderTileImageReadFromHelperInvocation(MemorySegment struct) {
        return struct.get(shaderTileImageReadFromHelperInvocation$LAYOUT, shaderTileImageReadFromHelperInvocation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderTileImageReadFromHelperInvocation
     * }
     */
    public static void shaderTileImageReadFromHelperInvocation(MemorySegment struct, int fieldValue) {
        struct.set(shaderTileImageReadFromHelperInvocation$LAYOUT, shaderTileImageReadFromHelperInvocation$OFFSET, fieldValue);
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

