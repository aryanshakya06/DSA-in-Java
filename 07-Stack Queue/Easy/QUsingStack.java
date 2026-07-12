// Problem: Implement Queue using Stacks
// LeetCode 232
// Time Complexity: push O(1), pop O(1)
// Space Complexity: O(n)

import java.util.*;

class QUsingStack {

    Stack<Integer> in;
    Stack<Integer> out;

    public QUsingStack() {
        in = new Stack<>();
        out = new Stack<>();
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        peek();
        return out.pop();
    }
    
    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }
    
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}