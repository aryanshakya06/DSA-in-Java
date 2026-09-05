// Problem: Search in fully sorted 2D matrix (staircase)
// Time Complexity: O(n+m)
// Space Complexity: O(1);
// Note: Row-Column Sorted Matrix
public class MatrixStaircaseSeach {

    public static boolean staircaseSearch(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;

        while ( i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (target > matrix[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40}, {15, 25, 35, 45}, {32, 33, 39, 50}};
        System.out.println(staircaseSearch(matrix, 32));
    }
}