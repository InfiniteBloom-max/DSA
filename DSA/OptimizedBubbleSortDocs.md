# Optimized Bubble Sort

## Description
The standard Bubble Sort algorithm always runs in O(n^2) time even if the array is already sorted. The optimized version introduces a flag variable `swapped`. If no elements are swapped during a pass, it means the array is already sorted, and the algorithm can terminate early.

## Implementation Details
We initialize `swapped = false` at the beginning of each outer loop iteration. If a swap occurs in the inner loop, we set `swapped = true`. If the inner loop completes and `swapped` is still `false`, we break out of the loop.

## Complexity
- **Time Complexity:**
  - Best Case: O(n) - When the array is already sorted.
  - Average Case: O(n^2)
  - Worst Case: O(n^2)
- **Space Complexity:** O(1) - In-place sorting.
