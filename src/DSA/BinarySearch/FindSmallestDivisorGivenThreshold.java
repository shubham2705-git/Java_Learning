package BinarySearch;

import java.util.Arrays;

public class FindSmallestDivisorGivenThreshold {
    public static boolean isPossible(int[] arr,int num, int threshold){
        int ans = 0;
        for(int i : arr){
            ans += (int)Math.ceil((double)i/num);
        }
        if(ans<=threshold){
            return true;
        }
        return false;
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        if(nums.length > threshold) return -1;
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isPossible(nums, mid, threshold)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(arr, threshold));
    }
}
