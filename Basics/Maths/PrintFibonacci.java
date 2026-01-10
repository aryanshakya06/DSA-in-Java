import java.util.Scanner;
public class PrintFibonacci {

    public static void printFibonacci(int n) {
        if (n<0) {
            System.out.println("Invalid Input");
            return;
        }

        if (n==0) {
            System.err.println("0");
            return;
        }

        long fib0 = 0;
        long fib1 = 1;

        for (int i = 0 ; i < n ; i++) {
            System.out.print(fib0 + " ");
            long fibn = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibn;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        printFibonacci(n);

        sc.close();
    }
}