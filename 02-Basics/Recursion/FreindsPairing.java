// Problem: Count the number of ways n friends can remain single or be paired up
// Time Complexity: O(2^n)
// Space Complexity: O(n) -> call stack
public class FreindsPairing {

    public static int freindsPairing(int n) {
        
        if (n == 1 || n ==2) { // 1: single -> ways = 1
            return n;          // 2: single + pair -> ways = 2
        }

        return freindsPairing(n-1) + (n-1) * freindsPairing(n-2);

        // // choice: single
        // int waysnm1 = freindsPairing(n-1); // freinds left to pair = n-1

        // // choice: pair
        // int pairChoices = n-1; // one freind can pair with any of n-1 freinds
        // int freindsLeft = freindsPairing(n-2); // freinds left to pair = n-2
        // int waysnm2 = pairChoices * freindsLeft; // p&c rule

        // return waysnm1 + waysnm2;
    }
    
    public static void main(String[] args) {
        System.out.println(freindsPairing(8)); // 764
    }
}