// Problem: Remove duplicate characters from a string using recursion while preserving order
// Time Complexity: O(n)
// Space Complexity: O(n) -> call stack
public class RemoveDuplicates {

    public static void removeDuplicates(String s, int index, StringBuilder newStr, boolean[] map) {

        if (index == s.length()) {
            System.out.println(newStr);
            return;
        }

        char ch = s.charAt(index);
        if (map[ch - 'a'] == true) {
            removeDuplicates(s, index+1, newStr, map);
        } else {
            map[ch - 'a'] = true;
            newStr.append(ch);
            removeDuplicates(s, index+1, newStr, map);
        }
    }
    
    public static void main(String[] args) {
        removeDuplicates("mynameisaryanshakya", 0, new StringBuilder(""), new boolean[26]);
        // output: mynaeisrhk
    }
}