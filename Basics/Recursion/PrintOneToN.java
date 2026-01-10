// Problem: Print numbers from 1 to N using recursion
// Time Complexity: O(n)
// Space Complexity: O(n) -> call stack
public class PrintOneToN {

    public static void printOneToN(int n) {

        if (n <= 0) {
            return;
        }

        printOneToN(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printOneToN(10);
    }
}
