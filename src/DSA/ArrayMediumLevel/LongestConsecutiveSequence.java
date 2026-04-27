package ArrayMediumLevel;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longest(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int curnum = i;
                int count=1;

                while(set.contains(curnum+1)){
                    count++;
                    curnum++;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longest(nums));
    }
}
