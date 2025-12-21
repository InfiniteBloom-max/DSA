# Singly Linked List

This document explains the `SinglyLinkedList.java` implementation.

## Overview
A Singly Linked List is a linear data structure where each element (node) contains data and a reference (link) to the next node in the sequence.

## Features
- **Dynamic Size**: 
    - Can grow and shrink at runtime.
- **Memory Efficiency**: 
    - Allocates memory as needed.
- **Operations**: 
    - Insertion: `addFirst`, `addLast`, `add(index, data)`
    - Deletion: `removeFirst`, `removeLast`, `removeByValue`
    - Access: `get`, `indexOf`
    - Utility: `isEmpty`, `size`, `display`
- **Complexity**: 
    - Insertion at beginning: O(1)
    - Insertion at end: O(n)
    - Insertion at index: O(n)
    - Deletion at beginning: O(1)
    - Deletion at end: O(n)
    - Access by index: O(n)
    - Search by value: O(n)

## Implementation Details
- **Node Structure**: 
    - Each node contains data and a reference to the next node.
- **Head Reference**: 
    - Points to the first node in the list.
- **Size Tracking**: 
    - Maintains a separate size counter for efficient size operations.