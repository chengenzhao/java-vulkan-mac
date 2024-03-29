package com.example.resourcetype;

import java.lang.foreign.MemorySegment;

public record ImageMemory(MemorySegment image, MemorySegment memory) { }
