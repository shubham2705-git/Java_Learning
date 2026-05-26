package SlidingWindow;

public class CountNumberOfNiceSubarrays {
    public static int find(int[] nums,int goal){
        int l=0, r=0, sum=0, count=0;
        if(goal < 0) return 0;
        while(r < nums.length){
            sum = sum + nums[r] % 2;
            while(sum > goal){
                sum = sum - nums[l] % 2;
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return find(nums,goal) - find(nums,goal-1);
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        int goal = 3;
        System.out.println(numSubarraysWithSum(nums, goal));
    }
}
