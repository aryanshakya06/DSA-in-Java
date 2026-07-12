// Problem: Sort the given array
// Worst/Average case Time Complexity: O(n^2) 
// Best Case Time Complexity: Best O(n)
// Space Complexity: O(1)
public class InsertionSort {

	public static void insertionSort(int[] arr) {
        for( int i = 1 ; i < arr.length ; i++) {
            int current = arr[i];
            int previous = i-1;
            while( previous >= 0 && arr[previous] > current) {
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current;
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
		insertionSort(arr);
		printArray("Sorted Array", arr);
	}
}