// Problem: Rotate Image
// LeetCode 48
public class RotateImage {

    // Optimal Approach: Transpose + Reverse
    // Time Complexity: O(n^2)  
    // Space Complexity: O(1)  

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    // Brute Force Approach
    // Time Complexity: O(n^2)
    // Space Complexity: O(n^2)

    // public static int[][] rotate(int[][] matrix) {
    //     int n = matrix.length;
    //     int[][] rotated = new int[n][n];
    //
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             rotated[j][n - 1 - i] = matrix[i][j];
    //         }
    //     }
    //
    //     return rotated;
    // }
}