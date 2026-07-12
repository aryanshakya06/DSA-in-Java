// Problem: Find GCD of two numbers using Euclidean Algorithm (recursion)
// Time Complexity: O(log(min(a, b)))
// Space Complexity: O(log(min(a, b)))
import java.util.Scanner;
public class GCD {
    public static int gcd(int num1, int num2) {

        if (num2 > num1) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 == 0) {
            return num1;
        }

        return gcd(num2, num1 % num2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number2: ");
        int num2 = sc.nextInt();
        System.out.println("GCD or HCF of given numbers is: " + gcd(num1, num2));
        sc.close();
    }
}