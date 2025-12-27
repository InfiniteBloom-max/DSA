# DSA Implementations

This repository contains custom implementations of various data structures in Java. The project explores different algorithmic optimizations for standard operations.

## Contents

The `DSA` directory contains the source code and documentation for the following:

### 1. Queue using Stacks
- **QueueStackPushFriendly.java**: Implementation where the Enqueue operation is O(1).
- **QueueStackPopFriendly.java**: Implementation where the Dequeue operation is O(1).

### 2. Stack using Queues
- **StackQueueEnqueueFriendly.java**: Implementation where the Push operation (via Enqueue) is O(1).
- **StackQueueDequeueFriendly.java**: Implementation where the Pop operation (via Dequeue) is O(1).

### 3. Unbounded Stack
- **UnboundedArrayStack.java**: A stack implementation using a dynamically resizing array. It doubles in size when full and shrinks when one-quarter full to optimize memory usage.

### 4. Circular Queue
- **ArrayCircularQueue.java**: A queue implementation using a circular array for efficient space utilization.

### 5. Linked Lists
- **SinglyLinkedList.java**: A singly linked list implementation with forward traversal only.
- **DoublyLinkedList.java**: A doubly linked list implementation with bidirectional traversal.
- **CircularDoublyLinkedList.java**: A circular doubly linked list implementation with bidirectional traversal and circular connections.
- **LinkedListStack.java**: A stack implementation using a linked list (O(1) push/pop).
- **LinkedListFIFOQueue.java**: A FIFO queue implementation using a linked list (O(1) enqueue/dequeue).

### 6. Mathematical Problems
- **RabbitProblem.java**: Implementation of the classic rabbit population growth problem with multiple algorithmic approaches (recursive, memoization, and iterative).

## Documentation

Detailed explanations of the logic and complexity for each implementation can be found in the accompanying markdown files:

- `DSA/QueueStackDocs.md`
- `DSA/UnboundedStackDocs.md`
- `DSA/StackQueueDocs.md`
- `DSA/StackQueueDequeueFriendlyDocs.md`
- `DSA/ArrayCircularQueueDocs.md`
- `DSA/SinglyLinkedListDocs.md`
- `DSA/DoublyLinkedListDocs.md`
- `DSA/CircularDoublyLinkedListDocs.md`
- `DSA/LinkedListStackDocs.md`
- `DSA/LinkedListFIFOQueueDocs.md`
- `DSA/RabbitProblemDocs.md`

## Built by Ronith
