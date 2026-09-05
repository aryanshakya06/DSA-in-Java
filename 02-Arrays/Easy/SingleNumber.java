// Problem: Find the number that appears once when all others appear twice
// LeetCode 136
// Time Complexity: O(n)
// Space Complexity: O(1)
public class SingleNumber {

    public static int onceTwice(int[] nums) {
        int xor = nums[0];
        for (int i = 1 ; i < nums.length ; i++) {
            xor ^= nums[i];
        }
        return xor;
    }

    // Better Approach
    // Time Complexity: O(n log n)
    // Space Complexity: O(1)
    // public static int onceTwice(int[] nums) {
    //     java.util.Arrays.sort(nums);
    //     for (int i = 0 ; i < nums.length; i += 2) {
    //         if (nums[i] != nums[i+1]) {
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println("Number that appears once is: " + onceTwice(arr));
    }
}