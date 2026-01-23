// Problem: Two Sum in a Sorted Rotated Array
// Approach: Modified Two Pointer using circular indices
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.Arrays;
public class TwoSumIII {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int pivot = -1;
        for (int k = 1; k < n; k++) {
            if (nums[k-1] > nums[k]) {
                pivot = k-1;
                break;
            }
        }

        if (pivot == -1) pivot = n-1; // array not rotated

        int i = (pivot + 1) % n; // smallest
        int j = pivot;            // largest

        int count = 0;
        while (count < n) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{i, j};
            } else if (sum < target) {
                i = (i + 1) % n;
            } else {
                j = (n + j - 1) % n;
            }
            count++;
        }

        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        System.out.println(Arrays.toString(twoSum(arr, 14))); // Output: [2, 5]
    }
}