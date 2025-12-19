package HashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public static int result(String s){
//        int maxLen=0;
//        for(int i=0;i<s.length();i++){
//            int[] arr = new int[256];
//            int len = 0;
//            for(int j=i;j<s.length();j++){
//                char ch = s.charAt(j);
//                if(arr[ch]==1) break;
//                len=j-i+1;
//                maxLen=Math.max(len,maxLen);
//                arr[ch-'a']=1;
//            }
//        }
//        return maxLen;


//        int max=0;
//        for(int i=0;i<s.length();i++){
//            Set<Character> set = new HashSet<>();
//            for(int j=i;j<s.length();j++){
//                if(set.contains(s.charAt(j))) break;
//                set.add(s.charAt(j));
//                max=Math.max(max,set.size());
//            }
//        }
//        return max;

        int[] arr = new int[256];
        Arrays.fill(arr,-1);
        int l=0,r=0,max=0;
        while(r<s.length()){
            char ch = s.charAt(r);
            if(arr[ch]!=-1){
                l=Math.max(arr[ch]+1,l);
            }
            int len = r-l+1;
            max=Math.max(max,len);
            arr[ch]=r;
            r++;
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "cadbzabcd";
        System.out.println(result(s));
    }
}
