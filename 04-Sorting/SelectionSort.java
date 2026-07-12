// Problem: Sort the given array
// Time Complexity: O(n^2) 
// Space Complexity: O(1)
public class SelectionSort {

	public static void selectionSort(int[] arr) {
        int n = arr.length;
		for( int i = 0 ; i < n ; i++) {
            int minPos = i;
            for( int j = i ; j < n ; j++) {
                if( arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
	}

	public static void printArray(String name, int[] arr) {
		System.out.print(name + ": ");
		for( int i = 0 ; i < arr.length ; i++) {	
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {	
		int[] arr = {5, 4, 2, 1, 6, 3};
		printArray("Original Array", arr);
		selectionSort(arr);
		printArray("Sorted Array", arr);
	}
}