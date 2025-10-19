package BinarySearch;

public class LowerBound {
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
        int[] arr = {2,3,4,5,6,7,12,15,23};
        int target = 22;
        System.out.println(lowerBound(arr,target));
    }
}
