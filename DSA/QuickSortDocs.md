# Quick Sort

Quick Sort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions the given array around the picked pivot.

## How It Works
1.  **Pivot Selection**: Pick an element from the array (e.g., last element, first element, random element, or median).
2.  **Partition**: Reorder the array so that all elements with values less than the pivot come before the pivot, while all elements with values greater than the pivot come after it (equal values can go either way). After this partitioning, the pivot is in its final position.
3.  **Recursion**: Recursively apply the above steps to the sub-array of elements with smaller values and separately to the sub-array of elements with greater values.

## Complexity
-   **Time Complexity**:
    -   Best Case: $O(n \log n)$
    -   Average Case: $O(n \log n)$
    -   Worst Case: $O(n^2)$ (occurs when the smallest or largest element is always chosen as the pivot)
-   **Space Complexity**: $O(\log n)$ (recursion stack space)

## Key Characteristics
-   **Not Stable**: The relative order of equal sort items is not preserved.
-   **In-place**: Yes (requires small amount of stack space).
-   Often faster in practice than Merge Sort and Heap Sort.
