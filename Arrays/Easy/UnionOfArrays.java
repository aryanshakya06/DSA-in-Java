// Problem: Given 2 arrays, return an array that is union of both arrays
import java.util.Arrays;
public class UnionOfArrays {

// Time Complexity: O(n+m)
// Space Complexity: O(n+m) -> ONLY TO RETURN THE ARRAY (if vector used)
    public static int[] unionOfArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        int[] result = new int[n+m];
        int k = 0;
        result[k] = arr1[i++];
        while( i < n && j < m) {
            if( arr1[i] <= arr2[j]) {
                if( result[k] != arr1[i]) {
                    result[++k] = arr1[i];
                }
                i++;
            } else {
                if( result[k] != arr2[j]) {
                    result[++k] = arr2[j];
                }
                j++;
            }
        }

        while( i < n) {
            if( result[k] != arr1[i]) {
                result[++k] = arr1[i];
            }
            i++;
        }

        while( j < m) {
            if( result[k] != arr2[j]) {
                    result[++k] = arr2[j];
                }
                j++;
        }

        return Arrays.copyOf(result, k+1);
    }

    // Helper Function to print an array
    public static void printArray(int[] arr) {
        for( int i = 0 ; i < arr.length ; i++) {
			System.out.print( arr[i] + " ");
		}
        System.out.println();
    }

// Brute Force - Without Java Sets
// Time Complexity: O(n+m)
// Space Complexity: O(n+m)
    // public static void unionOfArrays(int[] arr1, int[] arr2) {
    //     int n = arr1.length;
    //     int m = arr2.length;
    //     int[] union = new int[n+m];
    //     int j = 0;
    //     union[j] = arr1[0];
    //     for(int i = j+1 ; i < n ; i++) {
    //         if( union[j] < arr1[i] ) {
    //             union[++j] = arr1[i];
    //         }
    //     }

    //     for( int i = 0 ; i < m ; i++) {
    //         if( union[j] < arr2[i] ) {
    //             union[++j] = arr2[i];
    //         }
    //     }
    // }
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 5, 6};
        int[] result = unionOfArrays( arr1, arr2);
        printArray(result);
    }
}