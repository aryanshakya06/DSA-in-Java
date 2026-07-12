// Problem: Set entire row and column to zero if a cell is zero, in-place
// LeetCode 73
public class SetMatrixZeroes {

    // Optimal Approach
    // Time Complexity: O(m * n)
    // Space Complexity: O(1)
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int col0 = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        for (int i = 1 ; i < m ; i++) {
            for (int j = 1 ; j < n ; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 0 ; j < n ; j++) {
                matrix[0][j] = 0;
            }
        }

        if (col0 == 0) {
            for (int i = 0 ; i < m ; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    // Better Approach
    // Time Complexity: O(m * n)
    // Space Complexity: O(m + n)
    // public static void setZeroes(int[][] matrix) {
    // int m = matrix.length;
    // int n = matrix[0].length;

    // if (m < 1 || n < 1) {
    // return;
    // }

    // int[] row = new int[m];
    // int[] col = new int[n];

    // for (int i = 0; i < m; i++) {
    // for (int j = 0; j < n; j++) {
    // if (matrix[i][j] == 0) {
    // row[i] = 1;
    // col[j] = 1;
    // }
    // }
    // }

    // for (int i = 0 ; i < m ; i++) {
    // for (int j = 0 ; j < n ; j++) {
    // if (row[i] == 1 || col[j] == 1) {
    // matrix[i][j] = 0;
    // }
    // }
    // }
    // }

    // Time Complexity: O(m * n * (m + n))
    // Space Complexity: O(1)
    // public static void setZeroes(int[][] matrix) {
    // int m = matrix.length;
    // int n = matrix[0].length;

    // if (m < 1 || n < 1) {
    // return;
    // }

    // for (int i = 0; i < m; i++) {
    // for (int j = 0; j < n; j++) {
    // if (matrix[i][j] == 0) {
    // markRow(i, matrix);
    // markCol(j, matrix);
    // }
    // }
    // }

    // for (int i = 0; i < m; i++) {
    // for (int j = 0; j < n; j++) {
    // if (matrix[i][j] == -1) {
    // matrix[i][j] = 0;
    // }
    // }
    // }
    // }

    // public static void markRow(int i, int[][] matrix) {
    // int n = matrix[0].length;
    // int j = 0;
    // while (j < n) {
    // if (matrix[i][j] != 0) {
    // matrix[i][j] = -1;
    // }
    // j++;
    // }
    // }

    // public static void markCol(int j, int[][] matrix) {
    // int m = matrix.length;
    // int i = 0;
    // while (i < m) {
    // if (matrix[i][j] != 0) {
    // matrix[i][j] = -1;
    // }
    // i++;
    // }
    // }

    public static void printMatrix(String name, int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows < 0) {
            return;
        }

        System.out.println(name + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        printMatrix("Original Matrix", matrix);
        setZeroes(matrix);
        printMatrix("Final Matrix", matrix);
    }
}