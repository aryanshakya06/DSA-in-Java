// Problem: Find Minimum in Rotated Sorted Array
// LeetCode 153
// Time Complexity: O(log n)
// Space Complexity: O(1)
public class FindMin {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[low] <= nums[high]) {
                ans = Math.min(ans, nums[low]);
                break;
            }

            if (nums[low] <= nums[mid]) {
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            }

            else {
                high = mid - 1;
                ans = Math.min(ans, nums[mid]);
            }
        }

        return ans;
    }

}