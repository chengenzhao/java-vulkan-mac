package com.example;

import java.lang.foreign.MemorySegment;

public record BufferMemoryPair(MemorySegment buffer, MemorySegment bufferMemory) {
}
