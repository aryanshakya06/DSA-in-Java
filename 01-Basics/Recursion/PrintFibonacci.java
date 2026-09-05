// Problem: Find N-th Fibonacci number using recursion
// Time Complexity: O(2^n)
// Space Complexity: O(n)  // call stack
import java.util.Scanner;
public class PrintFibonacci {

    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("N-th-Fibonacci: " +  fibonacci(n));

        sc.close();
    }
}