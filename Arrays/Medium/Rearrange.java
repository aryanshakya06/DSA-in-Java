// Rearrange the array so that positive and negative numbers appear alternately while preserving their original order.
// LeetCode 2149
public class Rearrange {

    // Optimal Approach
    // Time Complexity: O(n) - one iteration 
    // Space Complexity: O(n)
    public static int[] rearrangeArray(int[] nums) {
            int pos = 0;
            int neg = 1;
            int[] result = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    result[pos] = nums[i];
                    pos += 2;
                } else {
                    result[neg] = nums[i];
                    neg += 2;
                }
            }
            return result;
    }

    // Better Approach
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // public static int[] rearrangeArray(int[] nums) {
    // int[] positive = new int[nums.length / 2];
    // int[] negative = new int[nums.length / 2];
    // int pos = 0;
    // int neg = 0;
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] > 0) {
    // positive[pos] = nums[i];
    // pos++;
    // } else {
    // negative[neg] = nums[i];
    // neg++;
    // }
    // }
    // for (int i = 0; i < nums.length / 2; i++) {
    // nums[2 * i] = positive[i];
    // nums[2 * i + 1] = negative[i];
    // }
    // return nums;
    // }

    // Brute Force
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    // public static int[] rearrangeArray(int[] nums) {

    // int[] res = new int[nums.length];
    // int[] visited = new int[nums.length];
    // int p = 0;
    // for (int i = 0 ; i < nums.length ; i += 2) {

    // for (int j = 0 ; j < nums.length ; j++) {
    // if (nums[j] > 0 && visited[j] == 0) {
    // res[p++] = nums[j];
    // visited[j] = 1;
    // break;
    // }
    // }

    // for (int j = 0 ; j < nums.length ; j++) {
    // if (nums[j] < 0 && visited[j] == 0) {
    // res[p++] = nums[j];
    // visited[j] = 1;
    // break;
    // }
    // }
    // }

    // return res;
    // }

    public static void printArray(String arrayName, int[] arr) {
        System.out.print(arrayName + ":");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        printArray("Original Array", arr);
        int[] res = rearrangeArray(arr);
        printArray("Final Array", res);
    }
}