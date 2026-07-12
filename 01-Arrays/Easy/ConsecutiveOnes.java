// Problem: Find Maximum Consecutive Ones in a Binary Array
// LeetCode 485
// Time Complexity: O(n)
// Space Complexity: O(1)
public class ConsecutiveOnes {

    public static int maxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;

        for (int i = 0 ; i < nums.length ; i++) {

            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println("Maximum Consecutive Ones: " + maxConsecutiveOnes(arr));
    }
}