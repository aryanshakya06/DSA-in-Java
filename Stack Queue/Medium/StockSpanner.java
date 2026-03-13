// Problem: Online Stock Span
// LeetCode 901 
// Time Complexity: O(1) 
// Space Complexity: O(n)
import java.util.*;

class StockSpanner {

    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.peek()[1];
            stack.pop();
        }
        
        stack.push(new int[]{price, span});
        return span;
    }
}