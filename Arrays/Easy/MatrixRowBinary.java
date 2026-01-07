// Problem: Search in row-wise sorted matrix using Binary Search
// Time Complexity: O(n × log m)
// Space Complexity: O(1)
// Note: Apply binary search on each row
public class MatrixRowBinary {

    public static int matrixBinarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static boolean matrixRowBinary(int[][] matrix, int target) {

        int n = matrix.length;

        for (int i = 0 ; i < n ; i++) {
            int flag = matrixBinarySearch(matrix[i], target);
            if ( flag != -1) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 10}, {2, 5, 8, 11}, {3, 6, 9, 15}};
        System.out.println(matrixRowBinary(matrix, 1));
    }
}