package BinarySearch;

public class BinarySearchUsingRecursion {
    public static int binarySearch(int[] arr,int low,int high,int target){
       if(low>high) return -1;
       int mid = low + (high-low)/2;
       if(arr[mid] == target ) return mid;
       else if(target > arr[mid])
           return binarySearch(arr,mid+1,high,target);
       return binarySearch(arr,low,mid-1,target);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,23,32,43,54,12,54,46,76};
        int target = 54;
        System.out.println(binarySearch(arr,0,arr.length-1,target));
    }
}
// ======== Time Complexity ====
// ===============  O(log2N) ---------------------