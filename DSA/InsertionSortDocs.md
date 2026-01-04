# Insertion Sort

## Description
Insertion Sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. However, it is efficient for small data sets and is stable (does not change the relative order of elements with equal keys).

## Implementation Details
The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.

## Complexity
- **Time Complexity:**
  - Best Case: O(n) - When the array is already sorted.
  - Average Case: O(n^2)
  - Worst Case: O(n^2) - When the array is sorted in reverse order.
- **Space Complexity:** O(1) - In-place sorting.
