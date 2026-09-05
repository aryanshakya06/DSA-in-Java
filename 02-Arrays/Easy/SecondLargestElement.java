// Problem: Find the second largest element in an array
// Time Complexity: O(n)
// Space Complexity: O(1)
public class SecondLargestElement {

    public static int secondLargest(int[] arr) {

        if (arr == null || arr.length < 2) {
            return -1;
        }

        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }

        return slargest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4};
        int slargest = secondLargest(arr);
        System.out.println("The second largest element is: " + slargest);
    }
}