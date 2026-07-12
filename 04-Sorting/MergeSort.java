// Problem: Sort the given array using Merge Sort
// Time Complexity: O(n log n)
// Space Complexity: O(n)
public class MergeSort {

    public static void printArray(String arrayName, int[] arr) {
        System.out.print(arrayName + ": ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) { // start > end (invalid) & start = end (single element)
            int mid = start + (end - start) / 2; // to prevent integer overflow
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[arr.length];
        int i = start;
        int j = mid + 1;
        int k = start;

        while (i <= mid && j <= end) {
            if (arr[i] > arr[j]) {
                temp[k++] = arr[j++];
            } else {
                temp[k++] = arr[i++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (int p = start; p <= end; p++) {
            arr[p] = temp[p];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 12, 10, 9, 1};
        printArray("Original Array", arr);
        mergeSort(arr, 0, arr.length - 1);
        printArray("Sorted Array", arr);
        
        // Original Array: 6 5 12 10 9 1 
        // Sorted Array: 1 5 6 9 10 12
    }
}