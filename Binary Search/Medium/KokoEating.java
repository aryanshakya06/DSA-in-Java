// Problem: Koko Eating Bananas
// LeetCode 875
// Time Complexity: O(n log m)
// Space Complexity: O(1)
public class KokoEating {

    public int findMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        int n = piles.length;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, piles[i]);
        }

        return max;
    }

    public int calculateTotalHours(int[] piles, int hourly) {
        int totalH = 0;
        int n = piles.length;

        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double) piles[i] / (double) hourly);
        }

        return totalH;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);

        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(piles, mid);

            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}