package SlidingWindow;

public class MaxPointsFromCards {
    public static int find(int[] arr, int k){
        int lsum = 0;
        int rsum = 0;
        for(int i=0; i<k; i++){
            lsum += arr[i];
        }
        int ans = lsum;
        for(int i=0; i<k; i++){
            lsum -= arr[k-i-1];
            rsum += arr[arr.length-1-i];
            ans = Math.max(ans, lsum + rsum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(find(arr,k));
    }
}
