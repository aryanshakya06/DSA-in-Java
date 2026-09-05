// Problem: Count number of digits in an integer
// Approach: Repeatedly divide the number by 10 until it becomes 0
// Time Complexity: O(d), where d = number of digits in the number
// Space Complexity: O(1)
import java.util.Scanner;
public class CountDigits {

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
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Digits in the number are: " + countDigits(num));
        sc.close();
    }
}