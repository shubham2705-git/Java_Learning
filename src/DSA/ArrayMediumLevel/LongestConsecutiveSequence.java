package ArrayMediumLevel;

import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence {
    public static int longest(int[] nums){
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int count = 1;
        int maxi = 0;
        for(int i: set){
            if(set.contains(i+1)){
                count++;
            }
            else{
                count=1;
            }
            maxi = Math.max(count,maxi);

        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longest(nums));
    }
}
