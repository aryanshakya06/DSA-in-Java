// Problem: Count the number of ways to tile a 2 × n board using 2 × 1 tiles
// LeetCode 70
// Time Complexity: O(2^n)
// Space Complexity: O(n) -> call stack
public class TilingProblem {

    public static int ways(int n) { // number of ways to tile a board of size 2 × n

        if (n == 0 || n == 1) { // for 0 size -> no ways = 1 & for 1 size -> only 1 way
            return 1;
        }

        return ways(n-1) + ways(n-2);

        // // choice: vertical choice -> Remaining board size = 2 × (n - 1)
        // int waysnm1 = ways(n-1);

        // // choice: horizontal choice -> Remaining board size = 2 × (n - 2)
        // int waysnm2 = ways(n-2);

        // return waysnm1 + waysnm2;
    }
    
    public static void main(String[] args) {
        System.out.println(ways(9));
    }
}