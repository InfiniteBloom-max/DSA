# DSA Implementations

This repository contains custom implementations of Stack and Queue data structures in Java. The project explores different algorithmic optimizations for standard operations.

## Contents

The `DSA` directory contains the source code and documentation for the following:

### 1. Queue using Stacks
- **QueueStackPushFriendly.java**: Implementation where the Enqueue operation is O(1).
- **QueueStackPopFriendly.java**: Implementation where the Dequeue operation is O(1).

### 2. Stack using Queues
- **StackQueueEnqueueFriendly.java**: Implementation where the Push operation (via Enqueue) is O(1).

### 3. Unbounded Stack
- **UnboundedArrayStack.java**: A stack implementation using a dynamically resizing array. It doubles in size when full and shrinks when one-quarter full to optimize memory usage.

## Documentation
Detailed explanations of the logic and complexity for each implementation can be found in the accompanying markdown files:
- `DSA/QueueStackDocs.md`
- `DSA/UnboundedStackDocs.md`
- `DSA/StackQueueDocs.md`
