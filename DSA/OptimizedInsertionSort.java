package DSA;

import java.util.Arrays;

public class OptimizedInsertionSort {
    public static void binaryInsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int insertedPosition = binarySearch(arr, key, 0, i - 1);
            
            // Shift elements to make space for key
            for (int j = i - 1; j >= insertedPosition; j--) {
                arr[j + 1] = arr[j];
            }
            arr[insertedPosition] = key;
        }
    }

    private static int binarySearch(int[] arr, int item, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (item == arr[mid])
                return mid + 1;
            else if (item > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original Array: " + Arrays.toString(arr));
        binaryInsertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
