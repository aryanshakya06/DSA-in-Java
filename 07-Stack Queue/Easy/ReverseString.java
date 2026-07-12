import java.util.Stack;

// Problem: Reverse a string using a stack
// Time Complexity: O(n)
// Space Complexity: O(n)
public class ReverseString {

    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Reversed String: " + reverseString(str));
    }
}