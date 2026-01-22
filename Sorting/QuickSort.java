// Problem: Sort the given array using Quick Sort
// Time Complexity: 
//   Best Case: O(n log n)
//   Average Case: O(n log n)
//   Worst Case: O(n^2)
// Space Complexity: O(log n) -> call stack
public class QuickSort {

    public static void printArray(String arrayName, int[] arr) {
        System.out.print(arrayName + ": ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);
            quickSort(arr, start, pi-1);
            quickSort(arr, pi+1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start-1;
        for (int j = start ; j < end ; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }  

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 5, 12, 10, 9, 1 };
        printArray("Original Array", arr);
        quickSort(arr, 0, arr.length - 1);
        printArray("Sorted Array", arr);

        // Original Array: 6 5 12 10 9 1
        // Sorted Array: 1 5 6 9 10 12
    }
}