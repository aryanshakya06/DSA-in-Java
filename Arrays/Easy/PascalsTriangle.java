// Problem: Generate Pascal's Triangle
// LeetCode 118
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

import java.util.*;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = triangle.get(i - 1).get(j - 1)
                            + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
