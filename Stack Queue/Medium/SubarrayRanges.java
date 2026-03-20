// Problem : Find the sum of (maximum − minimum) for every possible subarray of a given array.
// LeetCode 2104
import java.util.Stack;

public class SubarrayRanges {

    // Time Complexity: O(n)
    // Space Complexuty: O(n)
    public static long subarrayRanges(int[] nums) {
        return getSum(nums, false) - getSum(nums, true);
    }

    private static long getSum(int[] arr, boolean isMin) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && compare(arr[st.peek()], arr[i], isMin, true)) {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && compare(arr[st.peek()], arr[i], isMin, false)) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        long total = 0;

        for (int i = 0; i < n; i++) {
            long l = i - left[i];
            long r = right[i] - i;
            total += l * r * arr[i];
        }

        return total;
    }

    private static boolean compare(int a, int b, boolean isMin, boolean isLeft) {
        if (isMin) {
            return isLeft ? a > b : a >= b;
        } else {
            return isLeft ? a < b : a <= b;
        }
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // public static long subarrayRanges(int[] nums) {
    // long sum = 0;

    // for (int i = 0; i < nums.length; i++) {
    // long largest = nums[i];
    // long smallest = nums[i];

    // for (int j = i + 1; j < nums.length; j++) {
    // largest = Math.max(largest, nums[j]);
    // smallest = Math.min(smallest, nums[j]);

    // sum += (largest - smallest);
    // }
    // }

    // return sum;
    // }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2 };
        System.out.println(subarrayRanges(arr));
    }
}