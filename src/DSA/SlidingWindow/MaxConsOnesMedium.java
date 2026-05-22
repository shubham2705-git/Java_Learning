package SlidingWindow;

public class MaxConsOnesMedium {
    public static int find(int[] arr, int k){
        int l = 0, r = 0, max = 0, zeroes = 0;
        while(r<arr.length){
            if(arr[r] == 0) zeroes++;

            while(zeroes>k){
                if(arr[l]==0){
                    zeroes--;
                }
                l++;
            }

            if(zeroes<=k){
                max = Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(find(arr, k));

    }
}
