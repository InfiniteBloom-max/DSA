# Array Circular Queue

This document explains the `ArrayCircularQueue.java` implementation.

## Overview
A Queue data structure implementation backed by a circular array that efficiently utilizes space by wrapping around when reaching the end of the array.

## Features
- **Circular Array Implementation**:
    - Uses modulo arithmetic to wrap around the array indices.
    - Efficiently reuses space that would otherwise be wasted in a linear array implementation.
- **Fixed Capacity**: 
    - The queue has a fixed capacity determined at construction time.
- **Operations**: `enqueue`, `dequeue`, `peek`, `isEmpty`, `isFull`, `size`.
- **Complexity**: O(1) for enqueue and dequeue operations.

## Implementation Details
- **Front Pointer**: Points to the first element in the queue.
- **Rear Pointer**: Points to the last element in the queue.
- **Size Tracking**: Maintains a separate size counter to distinguish between full and empty states.
- **Wraparound Logic**: Uses modulo operation `(index + 1) % capacity` for pointer movement.