import java.util.Stack;

// Problem: Push an element at the bottom of a stack using recursion
// Time Complexity: O(n)
// Space Complexity: O(n) (recursion stack)
public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> stack, int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack, val);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        pushAtBottom(stack, 4);
        System.out.println(stack);
    }
}