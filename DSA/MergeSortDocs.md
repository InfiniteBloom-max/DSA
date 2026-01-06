# Merge Sort

Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.

## How It Works
1.  **Divide**: Find the middle point to divide the array into two halves.
2.  **Conquer**: Call mergeSort for the first half and the second half.
3.  **Combine**: Merge the two halves sorted in step 2.

## Complexity
-   **Time Complexity**: $O(n \log n)$ in all cases (Best, Average, Worst) as it always divides the array into two halves and takes linear time to merge two halves.
-   **Space Complexity**: $O(n)$ (Auxiliary space for the temporary arrays used in merging)

## Key Characteristics
-   **Stable**: Yes (preserves the relative order of equal elements).
-   **Not In-place**: Requires extra space.
-   Good for sorting linked lists (requires $O(1)$ extra space) and large datasets.
