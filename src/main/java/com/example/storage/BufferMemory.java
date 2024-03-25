package com.example.storage;

import java.lang.foreign.MemorySegment;

public record BufferMemory(MemorySegment buffer, MemorySegment memory) {
}
