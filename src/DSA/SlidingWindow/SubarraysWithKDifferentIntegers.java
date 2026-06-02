package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKDifferentIntegers {
    public static int find(int[] nums,int k){
        int l=0;
        int r=0;
        int count=0;
        Map<Integer,Integer> map = new HashMap<>();
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);

            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
    public static int solution(int[] nums, int k){
        return find(nums,k)-find(nums,k-1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3};
        int k = 2;
        System.out.println(solution(nums,k));
    }
}
