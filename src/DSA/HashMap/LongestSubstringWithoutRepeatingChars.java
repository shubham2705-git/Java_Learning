package HashMap;

import java.util.ArrayList;
import java.util.List;

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
        int max=0;
        for(int i=0;i<s.length();i++){
            List<Character> list = new ArrayList<>();
            for(int j=i;j<s.length();j++){
                if(list.contains(s.charAt(j))) break;
                list.add(s.charAt(j));
                max=Math.max(max,list.size());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "cadbzabcd";
        System.out.println(result(s));
    }
}
