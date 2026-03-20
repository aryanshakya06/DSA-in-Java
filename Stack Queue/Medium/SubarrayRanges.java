public class SubarrayRanges {

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static long subarrayRanges(int[] nums) {
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            long largest = nums[i];
            long smallest = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                largest = Math.max(largest, nums[j]);
                smallest = Math.min(smallest, nums[j]);

                sum += (largest - smallest);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2 };
        System.out.println(subarrayRanges(arr));
    }
}