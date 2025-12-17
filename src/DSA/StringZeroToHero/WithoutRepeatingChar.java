package StringZeroToHero;

import java.util.HashSet;
import java.util.Set;

public class WithoutRepeatingChar {
    public static int longestSubstring(String s)
    {
        int maxi = 0;

        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (!set.contains(ch)) {
                    set.add(ch);
                } else {
                    break;
                }
            }
            maxi = Math.max(maxi, set.size());
        }
        return maxi;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        int result = longestSubstring(s);
        System.out.println(result);
    }
}
