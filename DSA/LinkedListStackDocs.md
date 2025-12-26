# LinkedListStack Documentation

## Overview
LinkedListStack is a stack implementation using a linked list as the underlying data structure. It follows the Last In, First Out (LIFO) principle where the last element added is the first one to be removed.

## Features
- Dynamic size (no fixed capacity limit)
- Efficient memory usage
- All basic stack operations supported
- O(1) time complexity for push, pop, and peek operations

## Class Structure

### Node Class
- Private static inner class representing each element in the stack
- Contains:
  - `data`: integer value stored in the node
  - `next`: reference to the next node in the stack

### LinkedListStack Class
- `top`: reference to the topmost node in the stack
- `size`: current number of elements in the stack

## Methods

### Constructor
- `LinkedListStack()`: Initializes an empty stack

### Core Operations
- `push(int data)`: Adds an element to the top of the stack - O(1)
- `pop()`: Removes and returns the top element from the stack - O(1)
- `peek()`: Returns the top element without removing it - O(1)

### Utility Methods
- `isEmpty()`: Checks if the stack is empty - O(1)
- `size()`: Returns the number of elements in the stack - O(1)
- `display()`: Prints all elements in the stack from top to bottom - O(n)
- `search(int data)`: Returns the position of an element from the top (0-indexed) - O(n)

## Time Complexity
| Operation | Time Complexity |
|-----------|-----------------|
| Push      | O(1)           |
| Pop       | O(1)           |
| Peek      | O(1)           |
| isEmpty   | O(1)           |
| Size      | O(1)           |
| Search    | O(n)           |
| Display   | O(n)           |

## Space Complexity
- O(n) where n is the number of elements in the stack
- Each node requires constant extra space

## Advantages
- Dynamic size - grows and shrinks as needed
- No memory waste like in array-based implementations
- Efficient insertion and deletion at the top
- No risk of stack overflow (except memory limitations)

## Disadvantages
- Extra memory required for pointers/references
- No random access to elements
- Not cache-friendly compared to array-based implementations
- Slightly more complex implementation

## Example Usage
```java
LinkedListStack stack = new LinkedListStack();

// Adding elements
stack.push(10);
stack.push(20);
stack.push(30);

// Accessing elements
System.out.println(stack.peek()); // Output: 30

// Removing elements
int topElement = stack.pop(); // Returns 30
System.out.println(topElement);

// Check if empty
System.out.println(stack.isEmpty()); // Output: false
```

## Use Cases
- Expression evaluation and syntax parsing
- Backtracking algorithms
- Function call management (call stack)
- Undo operations in text editors
- Browser history management
- Balanced parentheses checking