public class Occurence {

    // Problem: Find the first occurrence of 'key' in array using recursion
    // Time Complexity: O(n) 
    // Space Complexity: O(n) -> call stack 
    public static int firstOccurence(int[] arr, int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }

    // Problem: Find the last occurrence of 'key' in array using recursion
    // Time Complexity: O(n) ->
    // Space Complexity: O(n) -> call stack 
    public static int lastOccurence(int[] arr, int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        
        int isFound = lastOccurence(arr, key, i+1);
        if (isFound == -1) {
            if (arr[i] == key) {
                return i;
            }
        }

        return isFound;

        // if (i < 0) {
        //     return -1;
        // }

        // if (arr[i] == key) {
        //     return i;
        // }

        // return lastOccurence(arr, key, i-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 5, 0 , 1, 5, 6};
        System.out.println(firstOccurence(arr, 5, 0));
        System.out.println(lastOccurence(arr, 5, 0));
    }
}