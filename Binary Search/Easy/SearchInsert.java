// Problem: Find the index where the target should be inserted in a sorted array
// LeetCode 35
// Time Complexity: O(log n)
// Space Complexity: O(1)
public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        int[] nums2 = {1, 3, 5, 6};
        int[] nums3 = {1, 3, 5, 6};

        System.out.println(searchInsert(nums1, 5)); // 2        
        System.out.println(searchInsert(nums2, 2)); // 1        
        System.out.println(searchInsert(nums3, 7)); // 4
    }
}