// Problem: Given 2 arrays, return an array that is intersection of both arrays
// Time Complexity: O(n+m) 
// Space Complexity: O( min(n,m))
public class IntersectionOfArrays {

    public static int[] intersectionOfArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[Math.min(arr1.length, arr2.length)];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                if (k == 0 || result[k-1] != arr1[i]) {
                    result[k++] = arr1[i];
                }
                i++; 
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return java.util.Arrays.copyOf(result, k);
    }

    // Helper Function to print an array
    public static void printArray(int[] arr) {
        for( int i = 0 ; i < arr.length ; i++) {
			System.out.print( arr[i] + " ");
		}
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 6, 7};
        int[] result = intersectionOfArrays(arr1, arr2);
        printArray(result);
    }

}
