package StringZeroToHero;

public class MakeTheStringGreat {
    public static String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((!sb.isEmpty()) && (ch + 32 == sb.charAt(sb.length() - 1) || ch - 32 == sb.charAt(sb.length() - 1))) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }
}
