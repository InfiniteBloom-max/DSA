# Stack Implemented Using Queues

This document explains the implementation of a Stack using Queues in Java.

## Overview
A Stack follows LIFO (Last-In-First-Out). We can simulate this using two Queues (`q1` and `q2`).

## Implementation: Enqueue Friendly (`StackQueueEnqueueFriendly.java`)
This implementation makes the push operation efficient (O(1)), which corresponds to the `enqueue` operation of the underlying queue.

### Operations
- **Push(x)**:
    - Add `x` to the active queue `q1`. This is O(1).
- **Pop()**:
    - Move all elements except the last one from `q1` to `q2`.
    - The last element remaining in `q1` is the "top" of the stack. Remove and return it.
    - Swap the roles of `q1` and `q2`.
    - This operation is O(n).
