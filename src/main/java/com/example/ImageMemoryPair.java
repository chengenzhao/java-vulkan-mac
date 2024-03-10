package com.example;

import java.lang.foreign.MemorySegment;

public record ImageMemoryPair(MemorySegment image, MemorySegment imageMemory) {
}
