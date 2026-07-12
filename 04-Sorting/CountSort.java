// Problem: Sort the given array
// Time Complexity: O(n+k)
// Space Complexity: O(k)
// Constraints: Small range and Positive numbers only
public class CountSort {

	public static void countSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        int[] count = new int[largest+1];
        for (int i = 0 ; i < arr.length ; i++) {
            ++count[arr[i]];
        }

        int j = 0;
        for (int i = 0 ; i < count.length ; i++) {
            while (count[i] > 0 && j < arr.length) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }
	public static void printArray(String name, int[] arr) {
		System.out.print(name + ": ");
		for (int i = 0 ; i < arr.length ; i++) {	
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {	
		int[] arr = {5, 4, 2, 1, 6, 3};
		printArray("Original Array", arr);
		countSort(arr);
		printArray("Sorted Array", arr);
	}
}