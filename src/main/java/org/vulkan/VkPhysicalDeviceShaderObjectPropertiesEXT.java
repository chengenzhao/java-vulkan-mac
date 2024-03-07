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
 * struct VkPhysicalDeviceShaderObjectPropertiesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     uint8_t shaderBinaryUUID[16];
 *     uint32_t shaderBinaryVersion;
 * }
 * }
 */
public class VkPhysicalDeviceShaderObjectPropertiesEXT {

    VkPhysicalDeviceShaderObjectPropertiesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        MemoryLayout.sequenceLayout(16, vulkan_h.C_CHAR).withName("shaderBinaryUUID"),
        vulkan_h.C_INT.withName("shaderBinaryVersion"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceShaderObjectPropertiesEXT");

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

    private static final SequenceLayout shaderBinaryUUID$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("shaderBinaryUUID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t shaderBinaryUUID[16]
     * }
     */
    public static final SequenceLayout shaderBinaryUUID$layout() {
        return shaderBinaryUUID$LAYOUT;
    }

    private static final long shaderBinaryUUID$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t shaderBinaryUUID[16]
     * }
     */
    public static final long shaderBinaryUUID$offset() {
        return shaderBinaryUUID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t shaderBinaryUUID[16]
     * }
     */
    public static MemorySegment shaderBinaryUUID(MemorySegment struct) {
        return struct.asSlice(shaderBinaryUUID$OFFSET, shaderBinaryUUID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t shaderBinaryUUID[16]
     * }
     */
    public static void shaderBinaryUUID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, shaderBinaryUUID$OFFSET, shaderBinaryUUID$LAYOUT.byteSize());
    }

    private static long[] shaderBinaryUUID$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t shaderBinaryUUID[16]
     * }
     */
    public static long[] shaderBinaryUUID$dimensions() {
        return shaderBinaryUUID$DIMS;
    }
    private static final VarHandle shaderBinaryUUID$ELEM_HANDLE = shaderBinaryUUID$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t shaderBinaryUUID[16]
     * }
     */
    public static byte shaderBinaryUUID(MemorySegment struct, long index0) {
        return (byte)shaderBinaryUUID$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t shaderBinaryUUID[16]
     * }
     */
    public static void shaderBinaryUUID(MemorySegment struct, long index0, byte fieldValue) {
        shaderBinaryUUID$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt shaderBinaryVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderBinaryVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t shaderBinaryVersion
     * }
     */
    public static final OfInt shaderBinaryVersion$layout() {
        return shaderBinaryVersion$LAYOUT;
    }

    private static final long shaderBinaryVersion$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t shaderBinaryVersion
     * }
     */
    public static final long shaderBinaryVersion$offset() {
        return shaderBinaryVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t shaderBinaryVersion
     * }
     */
    public static int shaderBinaryVersion(MemorySegment struct) {
        return struct.get(shaderBinaryVersion$LAYOUT, shaderBinaryVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t shaderBinaryVersion
     * }
     */
    public static void shaderBinaryVersion(MemorySegment struct, int fieldValue) {
        struct.set(shaderBinaryVersion$LAYOUT, shaderBinaryVersion$OFFSET, fieldValue);
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

