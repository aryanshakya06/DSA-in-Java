public class Rearrange {

    // Brute Force
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static int[] rearrangeArray(int[] nums) {

        int[] res = new int[nums.length];
        int[] visited = new int[nums.length];
        int p = 0;
        for (int i = 0 ; i < nums.length ; i += 2) {
            
            for (int j = 0 ; j < nums.length ; j++) {
                if (nums[j] > 0 && visited[j] == 0) {
                    res[p++] = nums[j];
                    visited[j] = 1;
                    break;
                }
            }

            for (int j = 0 ; j < nums.length ; j++) {
                if (nums[j] < 0 && visited[j] == 0) {
                    res[p++] = nums[j];
                    visited[j] = 1;
                    break;
                }
            }
        }
        
        return res;
    }
    
    public static void printArray(String arrayName, int[] arr){
		System.out.print(arrayName + ":");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        printArray("Original Array", arr);
        int[] res = rearrangeArray(arr);
        printArray("Final Array", res);
    }
}