// Problem: Search an element in a sorted array using Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Note: Array must be sorted before applying binary search
public class BinarySearch {

    public static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56 ,72, 91};
        System.out.println(binarySearch(arr, 8));
    }
}
