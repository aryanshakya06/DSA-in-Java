// Problem: Find the subarray with the maximum sum and return its sum
public class MaximumSubarray {

// Brute Force
// Time Complexity: O(n^3)
// Space Complexity: O(1)
    public static int bruteForce(int[] nums) {
        int mSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++) {
            for( int j = i ; j < nums.length ; j++) {
                int sum = 0;
                for(int k = i ; k <= j ; k++) {
                    sum += nums[k];
                    mSum = Math.max(sum, mSum);
                }
            }
        }
        return mSum;
    }
    public static void main(String[] args) {
        int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Sum of maximum subarrays is: " + bruteForce(nums));
    }
}