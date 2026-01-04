# Hanoi Tower

## Description
The Tower of Hanoi is a mathematical puzzle where we have three rods and `n` disks. The objective is to move the entire stack to another rod, obeying the following simple rules:
1. Only one disk can be moved at a time.
2. Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
3. No larger disk may be placed on top of a smaller disk.

## Implementation Details
The solution uses recursion. To move `n` disks from Source to Destination:
1. Move `n-1` disks from Source to Auxiliary.
2. Move the largest disk (nth disk) from Source to Destination.
3. Move `n-1` disks from Auxiliary to Destination.

## Complexity
- **Time Complexity:** O(2^n) - Specifically T(n) = 2T(n-1) + 1.
- **Space Complexity:** O(n) - Due to the recursion stack depth.
