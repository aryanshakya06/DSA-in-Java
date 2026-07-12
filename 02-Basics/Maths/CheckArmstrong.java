// Problem: Print all divisors of a given positive integer
// Time Complexity: O(n), where n = num
// Space Complexity: O(1)
import java.util.Scanner;

public class CheckArmstrong {

    public static int countDigits(int num) {

        if ( num < 0 ) {
            return -1;
        }

        if ( num == 0 ) {
            return 1;
        }

        int digits = 0;
        while ( num > 0) {
            digits++;
            num /= 10;
        }

        return digits;
    }

    public static boolean checkArmstrong(int num) {

        if (num < 0) {
            return false;
        }

        if (num == 0) {
            return true;
        }

        int digits = countDigits(num);
        if (digits == -1) {
            return false;
        }

        int copy = num;
        int sum = 0;
        while ( copy > 0) {
            int digit = copy % 10;
            sum = sum + (int)Math.pow(digit, digits);
            copy /= 10;
        }

        return sum == num;
    }
    
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Is Armstrong: " + checkArmstrong(num));
        sc.close();
	}
}