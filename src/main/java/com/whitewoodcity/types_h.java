// Generated by jextract

package com.whitewoodcity;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class types_h {

    types_h() {
        // Should not be called directly
    }

    static final Arena LIBRARY_ARENA = Arena.ofAuto();
    static final boolean TRACE_DOWNCALLS = Boolean.getBoolean("jextract.trace.downcalls");

    static void traceDowncall(String name, Object... args) {
         String traceArgs = Arrays.stream(args)
                       .map(Object::toString)
                       .collect(Collectors.joining(", "));
         System.out.printf("%s(%s)\n", name, traceArgs);
    }

    static MemorySegment findOrThrow(String symbol) {
        return SYMBOL_LOOKUP.find(symbol)
            .orElseThrow(() -> new UnsatisfiedLinkError("unresolved symbol: " + symbol));
    }

    static MethodHandle upcallHandle(Class<?> fi, String name, FunctionDescriptor fdesc) {
        try {
            return MethodHandles.lookup().findVirtual(fi, name, fdesc.toMethodType());
        } catch (ReflectiveOperationException ex) {
            throw new AssertionError(ex);
        }
    }

    static MemoryLayout align(MemoryLayout layout, long align) {
        return switch (layout) {
            case PaddingLayout p -> p;
            case ValueLayout v -> v.withByteAlignment(align);
            case GroupLayout g -> {
                MemoryLayout[] alignedMembers = g.memberLayouts().stream()
                        .map(m -> align(m, align)).toArray(MemoryLayout[]::new);
                yield g instanceof StructLayout ?
                        MemoryLayout.structLayout(alignedMembers) : MemoryLayout.unionLayout(alignedMembers);
            }
            case SequenceLayout s -> MemoryLayout.sequenceLayout(s.elementCount(), align(s.elementLayout(), align));
        };
    }

    static final SymbolLookup SYMBOL_LOOKUP = SymbolLookup.libraryLookup(System.mapLibraryName("HelloSwift"), LIBRARY_ARENA)
            .or(SymbolLookup.loaderLookup())
            .or(Linker.nativeLinker().defaultLookup());

    public static final OfBoolean C_BOOL = ValueLayout.JAVA_BOOLEAN;
    public static final OfByte C_CHAR = ValueLayout.JAVA_BYTE;
    public static final OfShort C_SHORT = ValueLayout.JAVA_SHORT;
    public static final OfInt C_INT = ValueLayout.JAVA_INT;
    public static final OfLong C_LONG_LONG = ValueLayout.JAVA_LONG;
    public static final OfFloat C_FLOAT = ValueLayout.JAVA_FLOAT;
    public static final OfDouble C_DOUBLE = ValueLayout.JAVA_DOUBLE;
    public static final AddressLayout C_POINTER = ValueLayout.ADDRESS
            .withTargetLayout(MemoryLayout.sequenceLayout(Long.MAX_VALUE, JAVA_BYTE));
    public static final OfLong C_LONG = ValueLayout.JAVA_LONG;

    private static class ism {
        public static final FunctionDescriptor DESC = FunctionDescriptor.ofVoid(    );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    types_h.findOrThrow("ism"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * void ism()
     * }
     */
    public static FunctionDescriptor ism$descriptor() {
        return ism.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * void ism()
     * }
     */
    public static MethodHandle ism$handle() {
        return ism.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * void ism()
     * }
     */
    public static void ism() {
        var mh$ = ism.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("ism");
            }
            mh$.invokeExact();
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class test {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            Point2D.layout(),
            Point2D.layout()
        );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    types_h.findOrThrow("test"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * struct Point2D test(struct Point2D)
     * }
     */
    public static FunctionDescriptor test$descriptor() {
        return test.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * struct Point2D test(struct Point2D)
     * }
     */
    public static MethodHandle test$handle() {
        return test.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * struct Point2D test(struct Point2D)
     * }
     */
    public static MemorySegment test(SegmentAllocator allocator, MemorySegment x0) {
        var mh$ = test.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("test", allocator, x0);
            }
            return (MemorySegment)mh$.invokeExact(allocator, x0);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class incre {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            types_h.C_INT,
            types_h.C_INT
        );

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(
                    types_h.findOrThrow("incre"),
                    DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * int incre(int)
     * }
     */
    public static FunctionDescriptor incre$descriptor() {
        return incre.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * int incre(int)
     * }
     */
    public static MethodHandle incre$handle() {
        return incre.HANDLE;
    }
    /**
     * {@snippet lang=c :
     * int incre(int)
     * }
     */
    public static int incre(int x0) {
        var mh$ = incre.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("incre", x0);
            }
            return (int)mh$.invokeExact(x0);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }
}

