// Problem: Convert a string into a 32-bit signed integer following atoi rules
// LeetCode 8
// Time Complexity: O(n)
// Space Complexity: O(1)
public class MyAtoi {

    public static int myAtoi(String s) {
        int n = s.length();
        int i = 0;

        while (i < n && s.charAt(i) == ' ')
            i++;
        if (i == n)
            return 0;

        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        int num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (num > Integer.MAX_VALUE / 10 ||
                    (num == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return num * sign;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("-042"));
        System.out.println(myAtoi("+042"));
        System.out.println(myAtoi("1337c0d3"));
        System.out.println(myAtoi("words and 987"));
    }
}