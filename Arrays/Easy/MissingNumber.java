// Problem: Find the Missing Number in an array containing numbers from 0 to n
// LeetCode 268
// Time Complexity: O(n)
// Space Complexity: O(1)
public class MissingNumber {
    
    public static int missingNumber(int[] nums) {
        int xor = nums.length;
        
        for (int i = 0 ; i < nums.length ; i++) {
            xor ^= i;
            xor ^= nums[i];
        }

        return xor;
    }

    // Sum Approach -> Optimal But Xor is best
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // public static int missingNumber(int[] nums) {
    //     int n = nums.length;
    //     int sum = (n*(n+1)) / 2;
    //     int arrSum = 0;
    //     for (int i = 0 ; i < n ; i++) {
    //         arrSum += nums[i];
    //     }
    //     return sum - arrSum;
    // }

    // Better Approach
    // Time Complexity: O(n log n)
    // Space Complexity: O(1) 
    // public static int missingNumber(int[] nums) {
    //     java.util.Arrays.sort(nums);
        
    //     for (int i = 1 ; i < nums.length ; i++) {
    //         if (nums[i-1] != nums[i] - 1) {
    //             return nums[i] - 1;
    //         }
    //     }
    //     return -1;
    // }

    // Brute Force
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // public static int missingNumber(int[] nums) {

    //     int[] visited = new int[nums.length+1];

    //     for (int i = 0 ; i < nums.length ; i++) {
    //         ++visited[nums[i]];
    //     }

    //     for (int i = 0 ; i < visited.length ; i++) {
    //         if (visited[i] == 0) {
    //             return i;
    //         }
    //     }

    //     return -1;
    // }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println("Missing Number is: " + missingNumber(arr));
    }
}