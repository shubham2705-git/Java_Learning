package BinarySearch;

import java.util.Arrays;

public class MinimumDaysToMakeMBouquetes {
    public static boolean possible(int[] arr, int day, int m, int k){
        int count = 0;
        int nob = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= day){
                count++;
            }else{
                nob += (count/k);
                count = 0;
            }
        }
        nob += count/k;
        if(nob>=m) return true;
        return false;
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < (long) m * k) return -1;
        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int ans = high;
        while(low <= high){
            int mid =(low + high)/2;
            if(possible(bloomDay, mid, m, k)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;
        System.out.println(minDays(arr,m,k));
    }
}
