// Problem: Print all prime numbers less than a given number n
// Time Complexity: O(n√n), where n is the given number
// Space Complexity: O(1)
import java.util.Scanner;
public class PrintPrime {
    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        } 
        
        if ( num == 2) {
            return true;
        }

        for (int i = 2 ; i <= Math.sqrt(num) ; i++ ) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
        System.out.print("Prime Numbers till n: ");
        for (int i = 2 ; i < num ; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
	}
}