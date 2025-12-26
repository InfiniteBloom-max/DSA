# LinkedListFIFOQueue Documentation

## Overview
LinkedListFIFOQueue is a queue implementation using a linked list as the underlying data structure. It follows the First In, First Out (FIFO) principle where the first element added is the first one to be removed.

## Features
- Dynamic size (no fixed capacity limit)
- Efficient memory usage
- All basic queue operations supported
- O(1) time complexity for enqueue, dequeue, and peek operations

## Class Structure

### Node Class
- Private static inner class representing each element in the queue
- Contains:
  - `data`: integer value stored in the node
  - `next`: reference to the next node in the queue

### LinkedListFIFOQueue Class
- `front`: reference to the frontmost node in the queue (for dequeue operations)
- `rear`: reference to the rearmost node in the queue (for enqueue operations)
- `size`: current number of elements in the queue

## Methods

### Constructor
- `LinkedListFIFOQueue()`: Initializes an empty queue

### Core Operations
- `enqueue(int data)`: Adds an element to the rear of the queue - O(1)
- `dequeue()`: Removes and returns the front element from the queue - O(1)
- `peek()`: Returns the front element without removing it - O(1)

### Utility Methods
- `isEmpty()`: Checks if the queue is empty - O(1)
- `size()`: Returns the number of elements in the queue - O(1)
- `display()`: Prints all elements in the queue from front to rear - O(n)
- `search(int data)`: Returns the position of an element from the front (0-indexed) - O(n)

## Time Complexity
| Operation | Time Complexity |
|-----------|-----------------|
| Enqueue   | O(1)           |
| Dequeue   | O(1)           |
| Peek      | O(1)           |
| isEmpty   | O(1)           |
| Size      | O(1)           |
| Search    | O(n)           |
| Display   | O(n)           |

## Space Complexity
- O(n) where n is the number of elements in the queue
- Each node requires constant extra space

## Advantages
- Dynamic size - grows and shrinks as needed
- No memory waste like in array-based implementations
- Efficient insertion and deletion at both ends
- No risk of queue overflow (except memory limitations)
- Efficient memory utilization

## Disadvantages
- Extra memory required for pointers/references
- No random access to elements
- Not cache-friendly compared to array-based implementations
- Slightly more complex implementation

## Example Usage
```java
LinkedListFIFOQueue queue = new LinkedListFIFOQueue();

// Adding elements
queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);

// Accessing elements
System.out.println(queue.peek()); // Output: 10

// Removing elements
int frontElement = queue.dequeue(); // Returns 10
System.out.println(frontElement);

// Check if empty
System.out.println(queue.isEmpty()); // Output: false
```

## Use Cases
- Task scheduling in operating systems
- Breadth-first search algorithms
- Print job scheduling
- Buffer for data streams
- Level-order tree traversal
- Managing shared resources among multiple consumers
- Simulating real-world queues (bank, restaurant, etc.) 
