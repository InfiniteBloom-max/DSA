# Queue Implemented Using Stacks

This document explains the implementation of a Queue using two Stacks in Java.

## Overview
A Queue follows FIFO (First-In-First-Out) principle, while a Stack follows LIFO (Last-In-First-Out). We can simulate a Queue using two Stacks (`s1` and `s2`).

## Implementations

### 1. Push Friendly (`QueueStackPushFriendly.java`)
In this approach, the `enqueue` operation is optimized to be O(1).
- **Enqueue(x)**: Simply push `x` to `pushStack`.
- **Dequeue()**: If `popStack` is empty, transfer all elements from `pushStack` to `popStack`. Then pop from `popStack`. This transfer makes the operation amortized O(1).

### 2. Pop Friendly (`QueueStackPopFriendly.java`)
In this approach, the `dequeue` operation is optimized to be O(1).
- **Enqueue(x)**: 
    1. Move all elements from `s1` to `s2`.
    2. Push `x` to `s1`.
    3. Move everything back from `s2` to `s1`.
    This ensures `s1` always has elements in queue order (front at top).
- **Dequeue()**: Simply pop from `s1`.
