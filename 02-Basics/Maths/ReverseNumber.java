// Problem: Return the reverse of a given number
// Approach: Extract last digit using % 10 and build reverse by multiplying by 10
// Time Complexity: O(d), where d = number of digits in the number
// Space Complexity: O(1)
import java.util.Scanner;
public class ReverseNumber {

	public static long reverseNumber(long num) {	
		if (num < 10) {
			return num;
		}
		
		long reverse = 0;
		while (num > 0) {
			long digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}		
	
		return reverse;
	}

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		long num = sc.nextLong();
		System.out.println("Reverse of the given number is: " + reverseNumber(num));
		sc.close();
	}
}