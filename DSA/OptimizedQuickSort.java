package DSA;

import java.util.Arrays;
import java.util.Random;

public class OptimizedQuickSort {
    private static final Random random = new Random();

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Optimization 1: Use Insertion Sort for small arrays
            // However, for pure QuickSort demonstration, we stick to recursion 
            // but use 3-way partitioning as the main optimization for duplicates.

            // Optimization 2: Randomized Pivot
            swap(arr, low, low + random.nextInt(high - low + 1));

            // 3-way Partitioning (Dutch National Flag)
            // lt: element before this index is less than pivot
            // gt: element after this index is greater than pivot
            // i: current element being examined
            int lt = low;
            int gt = high;
            int i = low + 1;
            int pivot = arr[low];

            while (i <= gt) {
                if (arr[i] < pivot) {
                    swap(arr, lt, i);
                    lt++;
                    i++;
                } else if (arr[i] > pivot) {
                    swap(arr, i, gt);
                    gt--;
                } else {
                    i++;
                }
            }

            // Recurse on the sub-arrays
            quickSort(arr, low, lt - 1);
            quickSort(arr, gt + 1, high);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5, 5, 7, 10};
        System.out.println("Original Array: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
