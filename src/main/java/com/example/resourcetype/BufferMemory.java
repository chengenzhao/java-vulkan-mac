package com.example.resourcetype;

import java.lang.foreign.MemorySegment;

public record BufferMemory(MemorySegment buffer, MemorySegment memory) {
}
