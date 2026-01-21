# Optimized Quick Sort

This implementation of Quick Sort includes several optimizations over the standard approach to handle worst-case scenarios and duplicate elements more efficiently.

## Optimizations
1.  **Randomized Pivot**: Instead of always picking the first or last element, a random element is chosen as the pivot. This avoids the worst-case $O(n^2)$ time complexity for already sorted or nearly sorted arrays.
2.  **3-Way Partitioning (Dutch National Flag)**: The array is partitioned into three parts:
    -   Elements less than the pivot.
    -   Elements equal to the pivot.
    -   Elements greater than the pivot.
    
    This works significantly faster when the array has many duplicate elements.

## How It Works
1.  The pivot is chosen randomly and swapped to the start.
2.  The array is partitioned into `[ < pivot | == pivot | > pivot ]`.
3.  Recursive calls are made only for the `< pivot` and `> pivot` segments. The `== pivot` segment is already in its final position.

## Complexity
-   **Time Complexity**:
    -   Average Case: $O(n \log n)$
    -   Worst Case: $O(n^2)$ (extremely rare with random pivot)
-   **Space Complexity**: $O(\log n)$ (recursion stack)
