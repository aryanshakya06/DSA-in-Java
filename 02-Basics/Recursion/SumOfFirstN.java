// Problem: Find sum of first N natural numbers using recursion
// Time Complexity: O(n)
// Space Complexity: O(n) -> call stack
import java.util.Scanner;
public class SumOfFirstN {

    // with recursion
    public static int sumOfFirstN(int n) {

        if (n <= 0) {
            return 0;
        }

        return n + sumOfFirstN(n-1);
    }

    // without recursion
    // public static int sumOfFirstN(int n) {
    //     return (n * (n+1)) / 2;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println(sumOfFirstN(n));

        sc.close();
    }
}