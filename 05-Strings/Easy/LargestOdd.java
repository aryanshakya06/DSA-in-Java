// Problem:Find largest odd number substring 
// LeetCode 1903
// Time Complexity: O(n)
// Space Complexity: O(1)
public class LargestOdd {
    public static String largetOddNumber(String num){

        for (int i = num.length() -1 ; i >= 0 ; i--) {
            int temp = num.charAt(i);
            if (temp % 2 != 0) {
                return num.substring(0, i+1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(largetOddNumber("52"));
        System.out.println(largetOddNumber("4206"));
        System.out.println(largetOddNumber("52348"));
        System.out.println(largetOddNumber("35427"));
        System.out.println(largetOddNumber("1"));
    }
}