import java.util.Stack;

// Problem: Remove K digits from the number so that the new number is the smallest possible
// LeetCode 402 
// Time Complexity: O(n)
// Space Complexity: O(n)
public class RemoveKDigits {

    public static String removeKDigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (char digit: num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder("");
        
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.reverse();

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeKDigits("1432219", 3));
    }
}