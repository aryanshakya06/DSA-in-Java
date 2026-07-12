// Problem: Check if an array is sorted in ascending order using recursion
// Time Complexity: O(n)
// Space Complexity: O(n) -> recursion call stack
public class SortedArray {

    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10};
        int[] arr3 = {1, 2, 5, 6, 8, 6};

        System.out.println(isSorted(arr1, 0));
        System.out.println(isSorted(arr2, 0));
        System.out.println(isSorted(arr3, 0));
    }
}