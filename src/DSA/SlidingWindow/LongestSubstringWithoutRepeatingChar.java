package SlidingWindow;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingChar {
    public static int find(String str){

        int[] arr = new int[256];
        Arrays.fill(arr,-1);

        int l = 0, r = 0, max = 0;

        while(r<str.length()){
            char ch = str.charAt(r);
            if(arr[ch] >= l ){
                l = arr[ch]+1;
            }
            max = Math.max(max,r-l+1);
            arr[ch] = r;
            r++;
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "abcacabb";
        System.out.println(find(str));
    }
}
