package BinarySearch;

import java.util.Arrays;

public class KokoEatBananas {
    private static long calculateTotalHours(int[] piles, int speed) {
        long totalH = 0;
        for (int bananas : piles) {
            totalH += (long)Math.ceil((double)bananas / speed);
        }
        return totalH;
    }
    public static int find(int[] arr, int h){
        int maxPile = Arrays.stream(arr).max().getAsInt();
        int low = 1;
        int high = maxPile;
        int ans = maxPile;

        while(low <= high){
            int mid = (low + high)/2;
            long totalH = calculateTotalHours(arr, mid);

            if (totalH <= h) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        int h = 6;
        System.out.println(find(arr,h));
    }
}
