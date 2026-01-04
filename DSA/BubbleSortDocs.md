# Bubble Sort

## Description
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. It is named for the way smaller or larger elements "bubble" to the top of the list.

## Implementation Details
The algorithm uses nested loops. The outer loop controls the number of passes, and the inner loop compares adjacent elements and swaps them if needed.

## Complexity
- **Time Complexity:** 
  - Best Case: O(n) (if already sorted AND optimized, providing this file implements the standard version which loops regardless, it might be O(n^2) depending on implementation details, but standard usually refers to O(n^2) for all cases without the 'swapped' flag). *Note: The standard implementation provided without the optimization flag performs O(n^2) even in best case.*
  - Average Case: O(n^2)
  - Worst Case: O(n^2)
- **Space Complexity:** O(1) - In-place sorting.
