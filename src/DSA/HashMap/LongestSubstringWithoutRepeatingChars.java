package HashMap;

public class LongestSubstringWithoutRepeatingChars {
    public static int result(String s){
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            int[] arr = new int[256];
            int len = 0;
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                if(arr[ch]==1) break;
                len=j-i+1;
                maxLen=Math.max(len,maxLen);
                arr[ch-'a']=1;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "cadbzabcd";
        System.out.println(result(s));
    }
}
