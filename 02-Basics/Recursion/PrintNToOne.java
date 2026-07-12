// Problem: Print numbers from N to 1 using recursion
// Time Complexity: O(n)
// Space Complexity: O(n) -> call stack
public class PrintNToOne {

    public static void printNToOne(int n) {

        if (n <= 0) {
            return;
        }

        System.out.print(n + " ");
        printNToOne(n-1);
    }

    public static void main(String[] args) {
        printNToOne(10);
    }
}