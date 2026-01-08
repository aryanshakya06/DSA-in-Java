// Problem: Check whether a given number is Palindrome
// Approach: Reverse the number and compare with original
// Time Complexity: O(d), where d = number of digits in the number
// Space Complexity: O(1)
import java.util.Scanner;
public class CheckPalindrome {

	public static boolean checkPalindrome(long num) {
        
        if (num < 0) {
            return false;
        }
		
        long copy = num;
		long reverse = 0;
		while (copy > 0) {
			long digit = copy % 10;
			reverse = reverse * 10 + digit;
			copy /= 10;
		}		

        if (num == reverse) {
            return true;
        }
	
		return false;
	}

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		long num = sc.nextLong();
		System.out.println("Is Palindrome: " + checkPalindrome(num));
        sc.close();
	}
}