# Unbounded Array Stack

This document explains the `UnboundedArrayStack.java` implementation.

## Overview
A Stack data structure implementation backed by a dynamic array that resizes itself based on the number of elements.

## Features
- **Dynamic Resizing**:
    - **Grow**: When the stack is full (size == capacity), the array capacity is doubled.
    - **Shrink**: When the stack is one-quarter full (size == capacity / 4), the array capacity is halved to save space.
- **Operations**: `push`, `pop`, `peek`, `isEmpty`, `size`.
- **Complexity**: Amortized O(1) for push and pop operations.
