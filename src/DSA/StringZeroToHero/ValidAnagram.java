package StringZeroToHero;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean validAnagram(String s, String t){
// ========  Easy Solution ==============
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);

    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = validAnagram(s,t);
        System.out.println(result);
    }
}

//----------------------------------------------------------------------------------------------------------------------
// ======== Hard Solution =================
/*  int m = s.length();
    int n = t.length();
    if(m!=n) return false;
      int count[] = new int[26];
      for(int i=0; i<m;i++){
        count[s.charAt(i)-'a']++;
      }
      for(int i=0;i<n;i++){
       count[t.charAt(i)-'a']--;
      }
      for(int i:count){
      if(i!=0) return false;
        }
        return true;
    }
 */