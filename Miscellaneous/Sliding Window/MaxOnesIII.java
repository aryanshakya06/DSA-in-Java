// Problem: Given a binary array, return the maximum length of a contiguous subarray containing only 1s after flipping at most k zeros.
// LeetCode 1004
// Time Complexity: O(n)
// Space Complexity: O(1)
public class MaxOnesIII {
    public int longestOnes(int[] nums, int k) {
        int left = 0, zeros = 0, maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}