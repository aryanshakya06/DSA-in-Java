// Problem: Two Sum II - Input Array Is Sorted
// LeetCode 167 (Easy)
// Time Complexity: O(n) - two pointer
// Space Complexity: O(1)
import java.util.Arrays;
public class TwoSumII {
    
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                return new int[] {i+1, j+1};
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                j--;
            }
        } 
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
}