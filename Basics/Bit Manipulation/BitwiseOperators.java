// Bit Manipulation

public class BitwiseOperators {

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 1) {
            return 1;
        }
        return 0;
    }

    public static void checkEvenOrOdd(int n) {
        // if LSB is 1 then number is odd else even
        int bitMask = 1; // 00000000000000000000000000000001
        if ((n & bitMask) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

    public static void main(String[] args) {
        System.out.println(4 & 5);
        System.out.println(4 | 5);
        System.out.println(4 ^ 5);
        System.out.println(~0);
        System.out.println(~1);
        System.out.println(~5);

        // left shift 
        // a << b = a * 2^b
        System.out.println(5 << 2); // 20

        // right shift 
        // a >> b = a / 2^b
        System.out.println(5 >> 2); // 1

        // using bit manipulation
        checkEvenOrOdd(5);
        checkEvenOrOdd(6);

        //get ith bit
        System.out.println(getIthBit(34, 2));

        // set ith bit to 1
        System.out.println(setIthBit(34, 2));
    }
}