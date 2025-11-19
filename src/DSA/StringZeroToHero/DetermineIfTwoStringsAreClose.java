package StringZeroToHero;

import java.util.Arrays;

public class DetermineIfTwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i=0;i<word1.length();i++){
            char ch1= word1.charAt(i);
            char ch2= word2.charAt(i);
            freq1[ch1-'a']++;
            freq2[ch2-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=0 && freq2[i]!=0) continue;
            if(freq1[i]==0 && freq2[i]==0) continue;
            return false;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1,freq2);
    }
    public static void main(String[] args) {
        String word1 = "cabbba";
        String word2 = "abbccc";
        System.out.println(closeStrings(word1,word2));
    }
}
