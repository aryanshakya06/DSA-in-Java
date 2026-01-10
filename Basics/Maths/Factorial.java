// Problem: Find factorial of a number using iteration
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.Scanner;
public class Factorial {

    public static int factorial(int n) {
        
        if ( n == 0 || n == 1) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1 ; i <=n ; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Factorial: " + factorial(n));

        sc.close();
    }
}