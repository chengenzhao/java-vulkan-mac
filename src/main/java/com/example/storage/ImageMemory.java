package com.example.storage;

import java.lang.foreign.MemorySegment;

public record ImageMemory(MemorySegment image, MemorySegment memory) {
}
