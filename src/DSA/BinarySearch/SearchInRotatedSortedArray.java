package BinarySearch;

public class SearchInRotatedSortedArray {
    public static int searchInRotatedSortedArray(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]==key) return mid;
            if(arr[low] <= arr[mid]){
                if(arr[low] <= key && key<=arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid] <= key && key <= arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        System.out.println(searchInRotatedSortedArray(arr,key));
    }
}
