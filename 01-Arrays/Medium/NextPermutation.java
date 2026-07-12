// Problem: // Find the next lexicographical permutation of the array in-place.
// LeetCode 31
// Time Complexity: O(n)
// Space Complexity: O(1)
public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for (int i = n-2 ; i >= 0 ; i--) {
            if (nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverseArray(nums, 0 , n);
            return;
        }

        for (int i = n-1 ; i >= 0 ; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        reverseArray(nums, index+1, n);
    }

    public static void reverseArray(int[] arr, int start, int end){
		
		if( arr == null || arr.length < 2){
			return;
		}
        end = end - 1;
		while( start < end ){
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
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
        int[] arr = {2, 1, 5, 4, 3, 0, 0,};
        printArray("Original Array", arr);
        nextPermutation(arr);
        printArray("Next Permutation", arr);
    }
}