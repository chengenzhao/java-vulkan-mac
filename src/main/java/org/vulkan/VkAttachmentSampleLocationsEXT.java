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
 * struct VkAttachmentSampleLocationsEXT {
 *     uint32_t attachmentIndex;
 *     VkSampleLocationsInfoEXT sampleLocationsInfo;
 * }
 * }
 */
public class VkAttachmentSampleLocationsEXT {

    VkAttachmentSampleLocationsEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("attachmentIndex"),
        MemoryLayout.paddingLayout(4),
        VkSampleLocationsInfoEXT.layout().withName("sampleLocationsInfo")
    ).withName("VkAttachmentSampleLocationsEXT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt attachmentIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("attachmentIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t attachmentIndex
     * }
     */
    public static final OfInt attachmentIndex$layout() {
        return attachmentIndex$LAYOUT;
    }

    private static final long attachmentIndex$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t attachmentIndex
     * }
     */
    public static final long attachmentIndex$offset() {
        return attachmentIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t attachmentIndex
     * }
     */
    public static int attachmentIndex(MemorySegment struct) {
        return struct.get(attachmentIndex$LAYOUT, attachmentIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t attachmentIndex
     * }
     */
    public static void attachmentIndex(MemorySegment struct, int fieldValue) {
        struct.set(attachmentIndex$LAYOUT, attachmentIndex$OFFSET, fieldValue);
    }

    private static final GroupLayout sampleLocationsInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("sampleLocationsInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkSampleLocationsInfoEXT sampleLocationsInfo
     * }
     */
    public static final GroupLayout sampleLocationsInfo$layout() {
        return sampleLocationsInfo$LAYOUT;
    }

    private static final long sampleLocationsInfo$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkSampleLocationsInfoEXT sampleLocationsInfo
     * }
     */
    public static final long sampleLocationsInfo$offset() {
        return sampleLocationsInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkSampleLocationsInfoEXT sampleLocationsInfo
     * }
     */
    public static MemorySegment sampleLocationsInfo(MemorySegment struct) {
        return struct.asSlice(sampleLocationsInfo$OFFSET, sampleLocationsInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkSampleLocationsInfoEXT sampleLocationsInfo
     * }
     */
    public static void sampleLocationsInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, sampleLocationsInfo$OFFSET, sampleLocationsInfo$LAYOUT.byteSize());
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

