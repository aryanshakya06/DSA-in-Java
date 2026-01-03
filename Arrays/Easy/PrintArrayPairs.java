// Problem: Print all pairs for elements of a java Array
// Time Complexity: O(n^2)
// Space Complexity: O(1)
public class PrintArrayPairs {

        public static void pairs(int[] a){
        int tp = 0;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = i+1 ; j < a.length ; j++){
                System.out.print("(" + a[i] + "," + a[j] + ") " );
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + tp);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        pairs(arr);
    }
}
