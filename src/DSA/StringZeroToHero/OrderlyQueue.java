package StringZeroToHero;

import java.util.Arrays;

public class OrderlyQueue {
    public static String orderlyQueue(String s, int k) {
        if (k > 1) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            return String.valueOf(ch);
        }
        String result = s;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            String temp = s.substring(i) + s.substring(0, i);
            result = (result.compareTo(temp) < 0) ? result : temp;
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "cba";
        int k =1;
        System.out.println(orderlyQueue(s,k));
    }
}
