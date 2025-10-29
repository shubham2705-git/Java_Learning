package BinarySearch;

import java.util.ArrayList;
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


// ============ Optimal approach ===================
// User function Template for Java

//class FirstAndLastOccurance {
//    public static int first(int[] arr,int target){
//        int n = arr.length;
//        int low = 0;
//        int high = n-1;
//        int first = -1;
//        while(low<=high){
//            int mid = low + (high - low)/2;
//            if(arr[mid]==target){
//                first = mid;
//                high = mid-1;
//            }
//            else if(arr[mid]<target){
//                low = mid+1;
//            }
//            else{
//                high = mid-1;
//            }
//        }
//        return first;
//    }
//    public static int last(int[] arr,int target){
//        int n = arr.length;
//        int low = 0;
//        int high = n-1;
//        int last = -1;
//        while(low<=high){
//            int mid = low + (high - low)/2;
//            if(arr[mid]==target){
//                last = mid;
//                low = mid+1;
//            }
//            else if(arr[mid]<target){
//                low = mid+1;
//            }
//            else{
//                high = mid-1;
//            }
//        }
//        return last;
//    }
//    ArrayList<Integer> find(int arr[], int x) {
//        int[] arr = {2,4,5,5,5,5,5,7,8,11,11,11,11,14,15};
//        int x = 5;
//        int first = first(arr,x);
//        int last = last(arr,x);
//        int[] arr = {2,4,5,7,8,11,14,15};
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(first);
//        list.add(last);
//        return list;
//    }
//}
