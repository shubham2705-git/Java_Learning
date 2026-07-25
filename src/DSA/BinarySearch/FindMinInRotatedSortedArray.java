package BinarySearch;

public class FindMinInRotatedSortedArray {
    public static int find(int[] arr){
        int l = 0;
        int r = arr.length-1;
        int min = Integer.MAX_VALUE;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[l] <= arr[r]){
                min = Math.min(arr[l],min);
                break;
            }
            if(arr[l] <= arr[mid]){
                min = Math.min(arr[l], min);
                l = mid+1;
            }
            else{
                min = Math.min(arr[mid], min);
                r = mid-1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(find(arr));
    }
}
