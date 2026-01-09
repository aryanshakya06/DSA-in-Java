public class DigitDivide {
    
    public int countDigits(int num) {
        int copy = num;
        int count = 0;
        while ( num > 0) {
            int digit = num % 10;
            num /= 10;
            if (copy % digit == 0) {
                count++;
            }
        }
        return count;
    }
}
