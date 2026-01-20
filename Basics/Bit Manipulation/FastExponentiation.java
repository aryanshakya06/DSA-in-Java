// Problem: Compute x^n using Fast Exponentiation (Binary Exponentiation)
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class FastExponentiation {
    
    public static int fastExponentiation(int x, int n) {
        int ans = 1;
        while (n > 0) {
            if ( (n & 1) == 1) { // LSB - 1
                ans = ans * x;
            } 
            x = x * x;
            n = n >> 1;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExponentiation(2, 5));
    }
}