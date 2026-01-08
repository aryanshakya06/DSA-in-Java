// Problem: Search in fully sorted 2D matrix
// LeetCode 74 (Medium)

// Time Complexity: O(log(n × m))
// Space Complexity: O(1)
// Note: Strictly Sorted Matrix
public class MatrixBinarySearch {

    public static boolean binarySearch(int[][] matrix, int target) {
        
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = (rows * cols) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = matrix[mid / cols][mid % cols];

            if (midVal == target) {
                return true;
            } else if (target > midVal) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(binarySearch(matrix, 30)); 
    }
}