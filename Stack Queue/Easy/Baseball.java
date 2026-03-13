// Problem: Baseball Game
// LeetCode 682
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

class Baseball {
    public int calPoints(String[] ops) {
        
        Stack<Integer> stack = new Stack<>();
        
        for (String op : ops) {
            
            if (op.equals("+")) {
                int top = stack.pop();
                int newScore = top + stack.peek();
                stack.push(top);
                stack.push(newScore);
                
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
                
            } else if (op.equals("C")) {
                stack.pop();
                
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        
        int total = 0;
        for (int score : stack) {
            total += score;
        }
        
        return total;
    }
}