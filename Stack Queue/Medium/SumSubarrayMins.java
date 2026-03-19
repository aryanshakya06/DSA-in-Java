public class SumSubarrayMins {

    // Time Complexity: O(n^3)
    // Space Complexity: O(1)
    public static int sumSubarrayMins(int[] arr) {
        int min = 0;
        int tempMin = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = i ; j < arr.length ; j++) {
                tempMin = arr[j];
                for (int k = i ; k <= j ; k++) {    
                    tempMin = Math.min(tempMin, arr[k]);
                }
                min += tempMin;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        System.out.println(sumSubarrayMins(arr));
    }
}