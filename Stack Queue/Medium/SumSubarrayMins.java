// Problem: Find the sum of the minimum element of every possible subarray of a given array.
import java.util.Stack;

public class SumSubarrayMins {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = (int) 1e9 + 7;

        int[] pse = findPSE(arr); 
        int[] nse = findNSE(arr);  

        long total = 0;

        for (int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;

            total = (total + (left * right % MOD) * arr[i] % MOD) % MOD;
        }

        return (int) total;
    }

    private static int[] findPSE(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return pse;
    }

    private static int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return nse;
    }

    // Time Complexity: O(n^3)
    // Space Complexity: O(1)
    // public static int sumSubarrayMins(int[] arr) {
    //     int min = 0;
    //     int tempMin = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i; j < arr.length; j++) {
    //             tempMin = arr[j];
    //             for (int k = i; k <= j; k++) {
    //                 tempMin = Math.min(tempMin, arr[k]);
    //             }
    //             min += tempMin;
    //         }
    //     }

    //     return min;
    // }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        System.out.println(sumSubarrayMins(arr));
    }
}