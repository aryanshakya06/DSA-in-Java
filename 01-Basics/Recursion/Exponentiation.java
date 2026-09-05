public class Exponentiation {

    // Problem: Compute num^pow using efficient recursive exponentiation (binary exponentiation)
    // Time Complexity: O(log n)
    // Space Complexity: O(log n) 
    public static long power(long num, long pow) {
        if (pow == 0) {
            return 1;
        }
        
        long temp = power(num, pow/2);

        if (pow % 2 == 0) {
            return temp * temp;
        } else {
            return num * temp * temp;
        }
    }

    // Commented: Naive recursive approach
    // Time Complexity: O(n) -> makes n recursive calls
    // Space Complexity: O(n) -> linear recursion depth     
    // public static int power(int num, int pow) {
    //     if (pow == 0) {
    //         return 1;
    //     }

    //     return num * power(num, pow-1);
    // }
    
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(power(x, n)); // compute x^n
    }
}