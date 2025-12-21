# Stack Implemented Using Queues - Dequeue Friendly

This document explains the implementation of a Stack using Queues in Java with a dequeue-friendly approach.

## Overview
A Stack follows LIFO (Last-In-First-Out). We can simulate this using two Stacks (`s1` and `s2`) where the dequeue operation is optimized for O(1) time complexity.

## Implementation: Dequeue Friendly (`StackQueueDequeueFriendly.java`)
This implementation makes the pop operation efficient (O(1)) by maintaining the elements in queue order at all times.

### Operations
- **Push(x)**:
    - Move all elements from `s1` to `s2`.
    - Push `x` to `s1`.
    - Move everything back from `s2` to `s1`.
    - This ensures `s1` always has elements in queue order (front at top).
    - This operation is O(n).
- **Pop()**:
    - Simply pop from `s1`.
    - This operation is O(1).