// Problem: Find the subarray with the maximum sum and return its sum
// LeetCode 53 (Medium)

// Optimal Approach: Kadane's Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)
public class KadanesAlgo {

    public static int kadanesAlgorithm(int[] nums) {
        int mSum = nums[0];
        int cSum = nums[0];
        for( int i = 1 ; i < nums.length ; i++) {

            cSum = Math.max(nums[i], cSum + nums[i]);

            mSum = Math.max(cSum, mSum);
        }

        return mSum;
    }
    public static void main(String[] args) {
        int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Sum of maximum subarrays is: " + kadanesAlgorithm(nums));
    }
}
