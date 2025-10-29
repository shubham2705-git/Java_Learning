package BinarySearch;

public class FindNumberOfOccurence {
    public static int first(int[] arr,int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int first = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]==target){
                first = mid;
                high = mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return first;
    }
    public static int last(int[] arr,int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int last = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]==target){
                last = mid;
                low = mid+1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return last;
    }
    public static int findNumberOfOccurences(int[] arr,int target){
        int first = first(arr,target);
        int last = last(arr,target);
        if(first == -1) return 0;
        return last - first+1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 2;
        int result = findNumberOfOccurences(arr,target);
        System.out.println(result);
    }
}
