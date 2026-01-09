public class PrintToN {

    public static void printOneToN(int n) {
        if (n <= 0) {
            return;
        }

        System.out.println(n);
        printOneToN(n-1);
    }

    public static void main(String[] args) {
        printOneToN(10);
    }
}
