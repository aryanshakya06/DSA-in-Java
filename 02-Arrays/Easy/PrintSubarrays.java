// Problem: Print all the subarrays of a java array
// Time Complexity: O(n^3)
// Space Complexity: O(1)
public class PrintSubarrays {
    public static void subarrays(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++)
                    System.out.print(a[k] + " ");
                System.out.println();
                count++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays : " + count);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        subarrays(arr);
    }
}