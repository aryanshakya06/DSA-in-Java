// Problem: Search an element in a 2D matrix using Brute Force
// Time Complexity: O(n × m)
// Space Complexity: O(1)
// Note: Checks every element
public class Search2DBrute {

    public static boolean search2DBrute(int[][] matrix, int key) {

        int n = matrix.length;
        int m = matrix[0].length;
        
        for (int i = 0 ; i < n ; i++) {
            for ( int j = 0 ; j < m ; j++) {
                if (matrix[i][j] == key) {
                    return true;
                }
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{5, 12, 7}, {3, 9, 1}, {8, 4, 6}};
        System.out.println(search2DBrute(matrix, 1));
    }
}