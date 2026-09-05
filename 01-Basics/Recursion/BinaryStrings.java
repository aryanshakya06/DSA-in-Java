// Problem: Generate all binary strings of length n without consecutive 1s
// Time Complexity: O(2^n) 
// Space Complexity: O(n)
public class BinaryStrings {

    public static void binaryStrings(int n, int lastPlace, String s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }

        binaryStrings(n-1, 0, s+"0");
        if (lastPlace == 0) {
            binaryStrings(n-1, 1, s+"1");
        }
    }

    public static void main(String[] args) {
        binaryStrings(3, 0, "");
    }
}