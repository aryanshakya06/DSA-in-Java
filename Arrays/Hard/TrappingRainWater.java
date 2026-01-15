// Problem: Calculate total trapped rainwater between bars of different heights
// LeetCode 42
// Time Complexity: O(n)
// Space Complexity: O(n)
public class TrappingRainWater {

    public static int trappingRainwater(int[] arr) {

        int n = arr.length;
        if (n<=2) {
            return -1;
        }

        int trappedWater = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = arr[0];
        for (int i = 1 ; i < n ; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        rightMax[n-1] = arr[n-1];
        for (int i = n-2 ; i >= 0 ; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        for (int i = 0 ; i < n ; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 6, 3, 2 ,5};
        System.out.println("Trapped Rainwater is: " + trappingRainwater(arr));                                                 
    }
}                     