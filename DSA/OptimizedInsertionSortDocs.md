# Optimized Insertion Sort (Binary Insertion Sort)

Binary Insertion Sort is a variation of Insertion Sort that uses binary search to find the correct position for the current element, reducing the number of comparisons.

## How It Works
1.  Iterate from the second element to the last.
2.  For the current element, use **binary search** on the sorted portion of the array (0 to `i-1`) to find its correct position.
3.  Shift elements to the right to make space.
4.  Insert the element.

## Complexity
-   **Time Complexity**:
    -   Best Case: $O(n \log n)$ (comparisons), $O(n)$ (swaps/shifts) - actually still $O(n^2)$ shift operations dominate.
    -   Average Case: $O(n^2)$
    -   Worst Case: $O(n^2)$
-   **Space Complexity**: $O(1)$ (Auxiliary)

## Comparison with Standard Insertion Sort
-   **Comparisons**: Reduced from $O(n)$ per element to $O(\log n)$.
-   **Shifts**: Remains $O(n)$ per element.
-   Overall, it performs fewer comparisons but the same number of data movements.
