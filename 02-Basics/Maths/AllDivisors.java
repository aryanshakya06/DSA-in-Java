import java.util.Scanner;
public class AllDivisors {

    public static void allDivisors(int num) {

        if (num <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        for (int i = 1 ; i <= num/2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        } 
        System.out.println(num);
    }

    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.print("All Divisors: ");
        allDivisors(num);
        sc.close();
	}
}