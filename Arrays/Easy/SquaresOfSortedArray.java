// Problem: LeetCode 977
//Time Complexity: O(n)
public class SquaresOfSortedArray{
	public static int[] SquaresOfSortedArray(int[] nums){
			int n = nums.length;
			int[] result = new int[n];
			int i = 0;
			int j = n-1;
			int k = n-1;
			while( i <= j && j >= 0 && k >= 0){
				if(Math.abs(nums[i]) > Math.abs(nums[j])) {
					result[k--] = nums[i] * nums[i];
					i++;
				} else {
					result[k--] = nums[j] * nums[j];
					j--;
				}
			}
			return result;
	}

// Time Complexity: O(n logn)
// Space Complexity: O(1)
// import java.util.Arrays;


// 	public static int[] res(int[] nums){
// 		for(int i = 0 ; i < nums.length ; i++){
// 			nums[i] *= nums[i];
// 		}
// 		Arrays.sort(nums);
// 		return nums;	
// 	}

	public static void main(String[] args){
		int[] arr = {-4, -1, 0, 3, 10};
		int[] result = SquaresOfSortedArray(arr);
		for(int i = 0 ; i < result.length ; i++) {
			System.out.print(result[i] + " ");
		}
	}
}