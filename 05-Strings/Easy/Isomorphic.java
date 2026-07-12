// Problem: Check if two strings are Isomorphic
// LeetCode 205
// Time Complexity: O(n)
// Space Complexity: O(1)
public class Isomorphic {

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] indexS = new int[256];
        int[] indexT = new int[256];

        int len = s.length();

        for (int i = 0; i < len; i++) {

            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (indexS[chS] != indexT[chT]) {
                return false;
            }

            indexS[chS] = i + 1;
            indexT[chT] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("add", "egg"));
    }
}