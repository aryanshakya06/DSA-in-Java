// Problem: Move all the zeroes to end of the array
// Time Complexity: O(n)
// Space Complexity: O(1)
public class MoveZeroesToEnd {

	public static void moveZeroesToEnd(int[] arr) {
		int j = -1;
		for( int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if( j == -1) {
            return;
        }

        for( int i = j+1 ; i < arr.length ; i++) {
            if( arr[i] != 0) {
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
            }
        }
	}
	
// Time Complexity: O(n)
// Space Complexity: O(n)
	// public static void moveZeroesToEnd(int[] arr) {
	// 	int[] temp = new int[arr.length];
	// 	int nonZero = 0;
	
	// 	for( int i = 0 ; i < arr.length ; i++) {
	// 		if( arr[i] != 0) {
	// 			temp[nonZero] = arr[i];
	// 			nonZero++;
	// 		}
	// 	}

	// 	for( int i = 0 ; i < nonZero ; i++) {
	// 		arr[i] = temp[i];
	// 	}

	// 	for( int i = nonZero ; i < arr.length ; i++) {
	// 		arr[i] = 0;
	// 	}
	// }

    // Helper function to print array
	public static void printArray(String arrName, int[] arr) {
        System.out.print(arrName + ": ");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        printArray("Input Array", arr);
		moveZeroesToEnd(arr);
		printArray("Output Array", arr);
	}
}