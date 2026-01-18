// Problem: Calculate the ratio of vowels to consonants in a string, returning the floor of the result.
// LeetCode Contest 
// Time Complexity: O(n)  
// Space Complexity: O(1) 
public class VowelScore {
    
    public static int vowelConsonantScore(String s) {
        int n = s.length();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0 ; i < n ; i++) {
            int a = (int) s.charAt(i);
            if (a == 97 || a == 101 || a == 105 || a == 111 || a == 117) {
                vowels++;
            } else if (a > 97 && a < 123) {
                consonants++;
            }
        }

        if (consonants <= 0) {
            return 0;
        } else {
            return (int) Math.floor(vowels / consonants);
        }
    }

    public static void main(String[] args) {
        System.out.println(vowelConsonantScore("cooear"));
        System.out.println(vowelConsonantScore("axeyizou"));
        System.out.println(vowelConsonantScore("au 123"));
    }
}