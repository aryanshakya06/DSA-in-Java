// Problem: Print a given string N times using recursion
// Time Complexity: O(n), where n is the number of times to print
// Space Complexity: O(n), due to recursion call stack
public class PrintNTimes {

    public static void printNTimes(String string, int n) {

        if (n <= 0) {
            return;
        }

        System.out.println(string);
        printNTimes(string, n-1);
    }

    public static void main(String[] args) {
        printNTimes("Hello", 10);
    }
}