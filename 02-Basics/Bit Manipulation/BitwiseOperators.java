// Bit Manipulation
// Covering Leetcode - 50, 191, 231, 338

public class BitwiseOperators {
    
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) { // check is LSB is 1
                count++;
            }
            n = n >> 1;
        }

        return count;
    }

    public static void checkIsPowerOf2(int n) {
        if ( (n & (n-1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not power of 2");
        }
    }

    public static int clearRange(int n, int i, int j) {
        int bitMask = ((~0) << (j+1)) | (1 << i) - 1; // 11100000 | 00000011 = 11100011
        return n & bitMask;
    }

    public static int clearLastIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int val) {
        n = clearIthBit(n, i);
        int bitMask = val << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

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

        // get ith bit
        System.out.println(getIthBit(34, 2)); // 0

        // set ith bit to 1
        System.out.println(setIthBit(34, 2)); // 38

        // clear ith bit to 0
        System.out.println(clearIthBit(38, 2)); // 34

        // update ith bit as choice
        System.out.println(updateIthBit(34, 2, 1)); // 38
        System.out.println(updateIthBit(38, 2, 0)); // 34 

        // clear last i bits 
        System.out.println(clearLastIBits(31, 2)); // 28

        // clear range of bits
        System.out.println(clearRange(1257, 2, 7)); // 1025

        // check if a number is in power of 2
        checkIsPowerOf2(5);
        checkIsPowerOf2(8);

        // count set bits in a number
        System.out.println(countSetBits(5));
        System.out.println(countSetBits(8));
    }

    // easy approach
    // public static int updateIthBit(int n, int i, int val) {
    //     int result = -1;
        
    //     if (val == 1) {
    //         result = setIthBit(n, i);
    //     } else {
    //         result = clearIthBit(n, i);
    //     }

    //     return result;
    // }
}