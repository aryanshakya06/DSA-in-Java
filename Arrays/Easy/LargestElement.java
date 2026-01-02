// Problem: Find the largest element in an array
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LargestElement {

    public static int largestElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4};
        int result = largestElement(arr);
        System.out.println("Largest Element is: " + result);
    }
}