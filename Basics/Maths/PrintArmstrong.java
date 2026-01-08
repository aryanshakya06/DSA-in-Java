// Problem: Print all Armstrong numbers from 0 to n
// Approach: For each number, check if it is Armstrong using digit-power method
// Time Complexity: O(n * d), where d = digits in n
// Space Complexity: O(1)
import java.util.Scanner;
public class PrintArmstrong {

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

        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();
        
        System.out.print("Armstrong numbers till n: ");
        for (int i = 0 ; i <= num ; i++) {
            if (checkArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}