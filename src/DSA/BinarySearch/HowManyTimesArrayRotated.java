package BinarySearch;

public class HowManyTimesArrayRotated {
    public static int find(int[] arr){
        int l = 0;
        int r = arr.length-1;
        int ans = Integer.MAX_VALUE;
        int index = 0;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[l] <= arr[r]){
                if(arr[l] < ans){
                    index = l;
                    ans = arr[l];
                }
                break;
            }
            if(arr[l] <= arr[mid]){
                if(arr[l] < ans){
                    index = l;
                    ans = arr[l];
                }
                l = mid+1;
            }
            else{
                r = mid-1;
                if(arr[mid] < ans){
                    index = mid;
                    ans = arr[mid];
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,101,2,3,4};
        System.out.println(find(arr));
    }
}
