package recursion;

public class BinarySearch {
    public static int bs(int[] nums,int low,int high,int target){
        if(low>high) return -1;
        int mid = low+(high-low)/2;
        if(target==nums[mid]) return mid;
        else if(target>nums[mid])
            return bs(nums,mid+1,high,target);
        return bs(nums,low,mid-1,target);
    }
    public static int search(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
    }
    public static void main(String[] args) {
        int[] arr = {6,4,5,6,7,2,10,65,23};
        int target = 6;
        int result = search(arr,target);
        System.out.println(result);
    }
}
