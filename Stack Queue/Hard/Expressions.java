// Problem: Arithmetic Expressions using Stack.
import java.util.Stack;

public class Expressions {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "23*54*+9-";
        System.out.println("Result: " + evaluatePostfix(exp));
    }
}