package BinarySearch;

public class CheckElementInRotatedSortedArrayWithDuplicate {
    public static boolean searchInRotatedSortedArray(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]==key) return true;
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
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
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,1,2,3,3};
        int key = 3;
        System.out.println(searchInRotatedSortedArray(arr,key));
    }
}
