// Problem: Implement Stack using Queues
// LeetCode 225
// Time Complexity: push O(n), pop O(1), top O(1)
// Space Complexity: O(n)

import java.util.*;

class StackUsingQ {

    Queue<Integer> q;

    public StackUsingQ() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
        
        for (int i = 0; i < q.size() - 1; i++) {
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}