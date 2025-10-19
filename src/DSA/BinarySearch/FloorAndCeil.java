package BinarySearch;

public class FloorAndCeil {
    public static int ceil(int[] arr,int target){
        int low = 0;
        int ans = arr.length;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=target){
                ans=arr[mid];
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int floor(int[] arr,int target){
        int low = 0;
        int ans = arr.length;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<=target){
                ans=arr[mid];
                low=mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 25;
        System.out.println("floor is:"+floor(arr,target));
        System.out.println("ceil is: "+ceil(arr,target));
    }
}
