// Problem: Sort the given array
// Worst/Average case Time Complexity: O(n^2) 
// Best Case Time Complexity: Best O(n)
// Space Complexity: O(1)
public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
        int totalSwap = 0;
		for( int i = 0 ; i < n ; i++) {
			int swap = 0;
			for( int j = 1 ; j < n-i ; j++) {
				if( arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swap++;
                    totalSwap++;
				}
				
			}
			if( swap == 0) {
 				break;
			}
		}
        System.out.println("Total Swaps: " + totalSwap);
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
		bubbleSort(arr);
		printArray("Sorted Array", arr);
	}
}