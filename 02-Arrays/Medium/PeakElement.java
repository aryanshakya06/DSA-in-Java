// Problem: Find Peak Element in the given array
// LeetCode 162
// Time Complexity: O(log n)
// Space Complexity: O(1)
public class PeakElement {

    public static int findPeakElement(int[] nums) {
       int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;    
            } else {
                right = mid;      
            }
        }

        return left; 
    } 

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println("Peak Index: " + findPeakElement(nums));
    }
}