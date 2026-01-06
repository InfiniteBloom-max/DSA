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

### 7. Sorting Algorithms
- **BubbleSort.java**: Standard Bubble Sort implementation.
- **OptimizedBubbleSort.java**: Bubble Sort with a flag to stop early if sorted.
- **InsertionSort.java**: Standard Insertion Sort implementation.
- **OptimizedInsertionSort.java**: Binary Insertion Sort (uses binary search for finding position).
- **SelectionSort.java**: Standard Selection Sort implementation.
- **MergeSort.java**: Recursive Merge Sort implementation (Divide and Conquer).
- **QuickSort.java**: Recursive Quick Sort implementation (Divide and Conquer).
- **HanoiTower.java**: Recursive solution to the Tower of Hanoi problem.

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
- `DSA/BubbleSortDocs.md`
- `DSA/OptimizedBubbleSortDocs.md`
- `DSA/InsertionSortDocs.md`
- `DSA/OptimizedInsertionSortDocs.md`
- `DSA/SelectionSortDocs.md`
- `DSA/MergeSortDocs.md`
- `DSA/QuickSortDocs.md`
- `DSA/HanoiTowerDocs.md`

## Time Complexity Summary

| Data Structure / Algorithm | Operation / Case | Complexity |
|----------------|-----------|------------|
| QueueStackPushFriendly | Enqueue | O(1) |
| QueueStackPushFriendly | Dequeue | Amortized O(1) |
| QueueStackPopFriendly | Enqueue | O(n) |
| QueueStackPopFriendly | Dequeue | O(1) |
| StackQueueEnqueueFriendly | Push | O(1) |
| StackQueueEnqueueFriendly | Pop | O(n) |
| StackQueueDequeueFriendly | Push | O(n) |
| StackQueueDequeueFriendly | Pop | O(1) |
| ArrayCircularQueue | Enqueue | O(1) |
| ArrayCircularQueue | Dequeue | O(1) |
| UnboundedArrayStack | Push | Amortized O(1) |
| UnboundedArrayStack | Pop | Amortized O(1) |
| SinglyLinkedList | Add First | O(1) |
| SinglyLinkedList | Add Last | O(n) |
| SinglyLinkedList | Remove First | O(1) |
| SinglyLinkedList | Remove Last | O(n) |
| SinglyLinkedList | Access by Index | O(n) |
| DoublyLinkedList | Add First | O(1) |
| DoublyLinkedList | Add Last | O(1) |
| DoublyLinkedList | Remove First | O(1) |
| DoublyLinkedList | Remove Last | O(1) |
| DoublyLinkedList | Access by Index | O(n) |
| Bubble Sort | Average/Worst | O(n^2) |
| Optimized Bubble Sort | Best Case | O(n) |
| Insertion Sort | Average/Worst | O(n^2) |
| Optimized Insertion Sort | Comparisons | O(n log n) |
| Selection Sort | All Cases | O(n^2) |
| Merge Sort | All Cases | O(n log n) |
| Quick Sort | Average Case | O(n log n) |
| Quick Sort | Worst Case | O(n^2) |
## Built by Ronith
