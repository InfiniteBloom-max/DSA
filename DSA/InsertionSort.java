package DSA;

import java.util.Arrays;

/**
 * Insertion Sort implementation.
 */
public class InsertionSort {

    /**
     * Sorts an array using the Insertion Sort algorithm.
     *
     * @param arr The array to be sorted.
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are greater than key,
               to one position ahead of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original Array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
