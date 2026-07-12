// Problem: Asteroid Collision
// LeetCode 735
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            boolean destroyed = false;
            
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                
                if (stack.peek() < -asteroid) {
                    stack.pop(); 
                } 
                else if (stack.peek() == -asteroid) {
                    stack.pop(); 
                    destroyed = true;
                    break;
                } 
                else {
                    destroyed = true; 
                    break;
                }
            }
            
            if (!destroyed) {
                stack.push(asteroid);
            }
        }
        
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}