// Problem: Sort Colors (0s, 1s, and 2s) in-place
// LeetCode 75
// Algorithm: Dutch National Flag Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1) 
public class SortColors {

    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp;

        while (mid <= high) {
            if (nums[mid] == 0) {
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void printArray(String arrayName, int[] arr){
		System.out.print(arrayName + ": ");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0};
        printArray("Original Array", arr);
        sortColors(arr);
        printArray("Sorted Array", arr);    
    }
}