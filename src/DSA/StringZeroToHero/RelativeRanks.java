package StringZeroToHero;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {
    public static String[] find(int[] arr){
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,String> map = new HashMap<>();

        for(int i = temp.length-1; i >= 0 ; i--){
            if(i == temp.length-1) map.put(temp[i], "Gold Medal");
            else if(i == temp.length-2) map.put(temp[i], "Silver Medal");
            else if(i == temp.length-3) map.put(temp[i], "Bronze Medal");
            else map.put(temp[i], String.valueOf(temp.length-i));
        }
        String[] ans = new String[arr.length];
        for(int i = 0; i<arr.length; i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,3,8,9,4};
        String[] ans = find(arr);
        System.out.println(Arrays.toString(ans));
    }
}
