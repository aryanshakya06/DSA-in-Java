// Problem: Search in column-wise sorted matrix using Binary Search
// Time Complexity: O(m × log n)
// Space Complexity: O(n)  (extra array used for column)
// Note: Apply binary search on each column

public class MatrixColumnBinary {

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public static boolean matrixColumnBinary(int[][] matrix, int target) {

        int n = matrix.length;       
        int m = matrix[0].length;   

        for (int col = 0; col < m; col++) {

            // extract one column into 1D array
            int[] temp = new int[n];
            for (int row = 0; row < n; row++) {
                temp[row] = matrix[row][col];
            }

            if (binarySearch(temp, target) != -1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[][] matrix = {{1, 8, 9}, {2, 10, 12}, {3, 11, 15}, {5, 13, 20}};
        System.out.println(matrixColumnBinary(matrix, 11));
    }
}