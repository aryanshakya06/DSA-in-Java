// Bit Manipulation

public class BitwiseOperators {
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
    }
}