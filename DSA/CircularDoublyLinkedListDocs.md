# CircularDoublyLinkedList Documentation

## Overview
CircularDoublyLinkedList is a doubly linked list implementation where the last node connects back to the first node and the first node connects to the last node, forming a circular structure. This allows for efficient traversal in both directions and eliminates the need to handle null references for the first and last nodes.

## Features
- Bidirectional traversal (forward and backward)
- Circular structure eliminates null pointer checks
- Efficient insertion and deletion at both ends
- O(1) operations for adding/removing at head/tail
- Optimized index access by choosing the shorter path

## Class Structure

### Node Class
- Private static inner class representing each element in the list
- Contains:
  - `data`: integer value stored in the node
  - `next`: reference to the next node in the circular list
  - `prev`: reference to the previous node in the circular list

### CircularDoublyLinkedList Class
- `head`: reference to the first node in the circular list
- `size`: current number of elements in the list

## Methods

### Constructor
- `CircularDoublyLinkedList()`: Initializes an empty circular doubly linked list

### Core Operations
- `addFirst(int data)`: Adds an element at the beginning of the list - O(1)
- `addLast(int data)`: Adds an element at the end of the list - O(1)
- `add(int index, int data)`: Adds an element at the specified index - O(n), but optimized to take shorter path
- `removeFirst()`: Removes and returns the first element - O(1)
- `removeLast()`: Removes and returns the last element - O(1)
- `removeByValue(int data)`: Removes the first occurrence of the specified value - O(n)

### Utility Methods
- `get(int index)`: Returns the element at the specified index - O(n), but optimized to take shorter path
- `indexOf(int data)`: Returns the index of the first occurrence of the specified value - O(n)
- `isEmpty()`: Checks if the list is empty - O(1)
- `size()`: Returns the number of elements in the list - O(1)
- `displayForward()`: Prints all elements from head to tail - O(n)
- `displayBackward()`: Prints all elements from tail to head - O(n)

## Time Complexity
| Operation | Time Complexity |
|-----------|-----------------|
| Add First | O(1)           |
| Add Last  | O(1)           |
| Add Index | O(n)           |
| Remove First | O(1)         |
| Remove Last | O(1)          |
| Remove Value | O(n)         |
| Get Index | O(n)*          |
| Index Of  | O(n)           |
| isEmpty   | O(1)           |
| Size      | O(1)           |

*Optimized to take the shorter path (from head or tail)

## Space Complexity
- O(n) where n is the number of elements in the list
- Each node requires extra space for both next and previous pointers

## Advantages
- Efficient insertion and deletion at both ends (O(1))
- No need to handle null pointers due to circular nature
- Bidirectional traversal capability
- Can start traversal from any node and reach all other nodes
- Optimized access to elements by choosing the shorter path

## Disadvantages
- Extra memory required for previous pointers
- More complex implementation compared to singly linked lists
- Risk of infinite loops if not handled properly
- Slightly more overhead for simple operations

## Example Usage
```java
CircularDoublyLinkedList list = new CircularDoublyLinkedList();

// Adding elements
list.addFirst(10);
list.addLast(20);
list.add(1, 15); // Add 15 at index 1

// Display the list
list.displayForward();  // Output: [10, 15, 20]
list.displayBackward(); // Output: [20, 15, 10]

// Access elements
System.out.println("Element at index 1: " + list.get(1)); // Output: 15
System.out.println("Index of value 20: " + list.indexOf(20)); // Output: 2

// Remove elements
int first = list.removeFirst(); // Returns 10
int last = list.removeLast();   // Returns 20
System.out.println("Removed: " + first + ", " + last);
```

## Use Cases
- Implementing circular buffers
- Navigation systems with wraparound capability
- Music playlists that loop continuously
- Game development for turn-based systems
- Operating system process scheduling
- Managing resources in a circular fashion 
