package BinarySearch;

import java.util.Arrays;

public class FirstAndLastOccurance {
    public static int[] searchRange(int[] arr,int target){
        int lb = lowerBound(arr,target);
        if(lb==arr.length || arr[lb]!=target){
            return new int[] {-1,-1};
        }
        return new int[] {lb,upperBound(arr,target)-1};
    }
    public static int upperBound(int[] arr,int target){
        int low = 0;
        int ans = arr.length;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int lowerBound(int[] arr,int target){
        int low = 0;
        int ans = arr.length;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
