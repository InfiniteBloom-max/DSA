# Selection Sort

Selection Sort is a simple comparison-based sorting algorithm. It divides the input list into two parts: a sorted sublist of items which is built up from left to right at the front (left) of the list and a sublist of the remaining unsorted items.

## How It Works
1.  Find the minimum element in the unsorted subarray.
2.  Swap it with the element at the beginning of the unsorted subarray.
3.  Move the boundary of the sorted subarray one element to the right.
4.  Repeat until the array is sorted.

## Complexity
-   **Time Complexity**: $O(n^2)$ for all cases (Best, Average, Worst) because it always scans the remaining array to find the minimum.
-   **Space Complexity**: $O(1)$ (In-place sorting)

## Key Characteristics
-   Simple to implement.
-   Performs well on small lists.
-   Minimizes the number of swaps (max $n-1$ swaps), which can be useful if write operations are expensive.
