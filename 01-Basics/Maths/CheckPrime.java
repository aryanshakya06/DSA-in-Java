// Problem: Check whether a given number is prime
// Time Complexity: O(√n), where n = the given number
// Space Complexity: O(1)
import java.util.Scanner;
public class CheckPrime {

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
		System.out.println("Is Prime: " + checkPrime(num));
        sc.close();
	}
}