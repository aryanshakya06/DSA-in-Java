// Problem: Capitalize the first letter of each word in a given string
// Time Complexity: O(n) 
// Space Complexity: O(n)

public class LettersUpper {

    public static String lettersUpper(String s) {

        if (s == null || s.isEmpty()) {
            return s; 
        }

        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(s.charAt(0)));

        for (int i = 1 ; i < s.length() ; i++) {
            if (s.charAt(i) == ' ' && i < s.length() - 1) {
                sb.append(' ');
                if (i + 1 < s.length()) {
                    i++;
                    sb.append(Character.toUpperCase(s.charAt(i)));
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = new String("my name is aryan shakya");
        System.out.println(lettersUpper(s));
    }
}