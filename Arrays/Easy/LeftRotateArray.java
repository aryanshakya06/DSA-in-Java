// Problem: Left Rotate the array by one place
// Time Complexity: O(n)
// Space Complexity: O(1)
public class LeftRotateArray {

	public static void leftRotateArrayByOne(int[] arr) {

		if (arr == null || arr.length < 2){
			return;
		}

		int i = 0;
		int temp = arr[i];
		while ( i < arr.length - 1) {
			arr[i] = arr[i+1];
			i++;
		}
		arr[i] = temp;
		
	}

// Problem: Left Rotate the array by k places
// Time Complexity: O(n)
// Space Complexity: O(k)
    public static void leftRotateArrayByK(int[] arr, int k){
        if ( arr == null || arr.length < 2 ) {
			return;
		}

		int n = arr.length;		
		k = k % n;
		int[] temp = new int[k];
		
		for( int i = 0 ; i < k ; i++) {
			temp[i] = arr[i];
		}

		for( int i = 0 ; i < n-k ; i++) {
			arr[i] = arr[i+k];
		}

		for( int i = n-k ; i < n ; i++) {
			arr[i] = temp[ i - (n-k)];
		}
    }

// Problem: Left Rotate the array by k places
// Time Complexity: O(n)
// Space Complexity: O(1)
    public static void leftRotateArrayByKOptimal(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
        reverseArray(arr, 0, n-1);
    }

    // Helper Function to print an array
    public static void printArray(int[] arr) {
        for( int i = 0 ; i < arr.length ; i++) {
			System.out.print( arr[i] + " ");
		}
        System.out.println();
    }

    // Helper function to reverse an array
    public static void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

	public static void main(String[] args) {		
		int[] arr1 = {1, 2, 3, 4, 5};
		leftRotateArrayByOne(arr1);
        printArray(arr1);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        leftRotateArrayByK(arr2, 3);
        printArray(arr2);

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        leftRotateArrayByKOptimal(arr3, 3);
        printArray(arr3);
	}
}