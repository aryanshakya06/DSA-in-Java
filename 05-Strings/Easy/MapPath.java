// Problem: Find the distance of the final position from the origin based on given directions
// Topic: String Traversal, Coordinate Geometry
// Time Complexity: O(n)
// Space Complexity: O(1)
public class MapPath {
    public static double distance(String s) {

        int x = 0;
        int y = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            
            if (s.charAt(i) == 'N') {
                y++;
            } else if (s.charAt(i) == 'S') {
                y--;
            } else if (s.charAt(i) == 'E') {
                x++;
            } else if (s.charAt(i) == 'W') {
                x--;
            }
        }

       double distance = Math.sqrt(x*x + y*y);
        return distance;
    }

    public static void main(String[] args) {
        String s = new String("SWESSNSEE");
        System.out.println("Distance from origin: " + distance(s));
    }
}