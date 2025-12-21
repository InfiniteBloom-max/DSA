# Doubly Linked List

This document explains the `DoublyLinkedList.java` implementation.

## Overview
A Doubly Linked List is a linear data structure where each element (node) contains data and references to both the next and previous nodes in the sequence, allowing bidirectional traversal.

## Features
- **Bidirectional Traversal**: 
    - Can traverse both forward and backward.
- **Dynamic Size**: 
    - Can grow and shrink at runtime.
- **Memory Efficiency**: 
    - Allocates memory as needed.
- **Operations**: 
    - Insertion: `addFirst`, `addLast`, `add(index, data)`
    - Deletion: `removeFirst`, `removeLast`, `removeByValue`
    - Access: `get`, `indexOf`
    - Utility: `isEmpty`, `size`, `displayForward`, `displayBackward`
- **Complexity**: 
    - Insertion at beginning: O(1)
    - Insertion at end: O(1)
    - Insertion at index: O(n)
    - Deletion at beginning: O(1)
    - Deletion at end: O(1)
    - Access by index: O(n) (optimized with midpoint selection)
    - Search by value: O(n)

## Implementation Details
- **Node Structure**: 
    - Each node contains data and references to both next and previous nodes.
- **Head and Tail References**: 
    - Head points to the first node, tail points to the last node.
- **Size Tracking**: 
    - Maintains a separate size counter for efficient size operations.
- **Optimization**: 
    - Access by index uses midpoint selection to minimize traversal distance.