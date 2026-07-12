// Problem: Check whether the robot returns to the origin after following given directions
// LeetCode 657
// Time Complexity: O(n)
// Space Complexity: O(1)
public class RobotReturn {

    public static boolean judgeCircle(String s) {
        
        int x = 0;
        int y = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            
            if (s.charAt(i) == 'U') {
                y++;
            } else if (s.charAt(i) == 'D') {
                y--;
            } else if (s.charAt(i) == 'R') {
                x++;
            } else if (s.charAt(i) == 'L') {
                x--;
            }
        }

        if ( x == 0 && y == 0) {
            return true;
        }

        return false;
    }
    
    public static void main(String[] args) {
        String s1 = new String("UD");
        String s2 = new String("LL");
        System.out.println(judgeCircle(s1));
        System.out.println(judgeCircle(s2));
    }
}