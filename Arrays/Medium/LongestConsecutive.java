// Problem: Find the length of the longest sequence of consecutive integers in an unsorted array
// LeetCode 128
public class LongestConsecutive {

    // Brute Force
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int longest = 1;
        for (int i = 0 ; i < n ; i++) {
            int x = nums[i];
            int count = 1;
            while (linearSearch(nums, x+1) == true) {
                count++;
                x++;
            }
            longest = Math.max(longest, count);
        }

        return longest;
    }

    public static boolean linearSearch(int[] arr, int key){
		for(int i = 0 ; i < arr.length ; i++){
			if( arr[i] == key){
				return true;
			}
		}
		return false;
	}
    
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }
}