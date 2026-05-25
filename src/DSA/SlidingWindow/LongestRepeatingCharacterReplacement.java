package SlidingWindow;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int l=0, r=0, maxF=0, maxLen = 0;
        int[] hash = new int[26];

        while(r<s.length()){
            char ch = s.charAt(r);
            hash[ch-'A']++;
            maxF = Math.max(maxF, hash[ch-'A']);

            while((r-l+1)-maxF > k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }
}
