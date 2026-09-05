// Problem: Reverse a given Array
// Time Complexity: O(n)
// Space Complexity: O(1)
public class ReverseArray{
	public static void reverseArray(int[] arr){
		
		if( arr == null || arr.length < 2){
			return;
		}

		int start = 0;
		int end = arr.length-1;
		while( start < end ){
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
		
	}

	public static void printArray(String arrayName, int[] arr){
		System.out.print(arrayName + ": ");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int[] arr = {1, 5, 3, 2, 4};
		printArray("Original Array", arr);
		reverseArray(arr);
		printArray("Reversed Array", arr);
	}
}