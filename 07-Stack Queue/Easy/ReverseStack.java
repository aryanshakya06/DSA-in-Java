import java.util.Stack;

public class ReverseStack {

    // Problem: Reverse a stack using recursion
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }

        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack, top);
    }

    public static void pushAtBottom(Stack<Integer> stack, int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack, val);
        stack.push(top);
    }

    // Problem: Reverse a stack using an auxiliary stack
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // public static Stack<Integer> reverseStack(Stack<Integer> stack) {
    // Stack<Integer> resultStack = new Stack<>();
    // while (!stack.isEmpty()) {
    // resultStack.push(stack.pop());
    // }

    // return resultStack;
    // }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }
}