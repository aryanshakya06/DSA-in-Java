// Problem: Container With Most Water
// LeetCode 11
public class ContainerMax {

    // Approach: Brute Force (Check all possible pairs)
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int maxArea(int[] arr) {
        int maxWater = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int height = Math.min(arr[i], arr[j]);
                int width = j - i;
                int currWater = height * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(arr));
    }
}