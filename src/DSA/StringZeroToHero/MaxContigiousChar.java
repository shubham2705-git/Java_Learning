package StringZeroToHero;

public class MaxContigiousChar {
    public static char maxChar(String s) {
        char c = s.charAt(0);
        int max = 1;

        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }else{
                    count=1;
                }
            }
            if (count > max) {
                c = s.charAt(i);
                max = count;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(maxChar("aabbbccaaaa"));
    }
}
