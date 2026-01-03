// Problem: LeetCode 977
// Time Complexity: O(n logn)
// Space Complexity: O(1)
import java.util.Arrays;
public class SquaresOfSortedArray{

	public static int[] res(int[] nums){
		for(int i = 0 ; i < nums.length ; i++){
			nums[i] *= nums[i];
		}
		Arrays.sort(nums);
		return nums;	
	}

	public static void main(String[] args){
		int[] arr = {-4, -1, 0, 3, 10};
		int[] result = res(arr);
		for(int i = 0 ; i < result.length ; i++) {
			System.out.print(result[i] + " ");
		}
	}
}