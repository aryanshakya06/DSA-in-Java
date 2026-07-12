// Problem: Check whether two strings are anagrams of each other
// LeetCode 242 - Valid Anagram
// Time Complexity: O(n)
// Space Complexity: O(1)
public class ValidAnagram {
    
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {   
            return false;
        }

        int[] freqS = new int[26];
        int[] freqT = new int[26];

        for (int i = 0 ; i < s.length() ; i++) {
            ++freqS[s.charAt(i) - 'a'];
            ++freqT[t.charAt(i) - 'a'];
        }

        for (int i = 0 ; i < 26 ; i++) {
            if (freqS[i] != freqT[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
