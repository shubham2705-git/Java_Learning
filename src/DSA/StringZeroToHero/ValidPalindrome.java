package StringZeroToHero;

public class ValidPalindrome {
    public static boolean validPalindrom(String str){
        str = str.replaceAll("[^a-zA-Z0-9]","");
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
    public static void main(String[] args) {
        String str = "9A man, a plan, a canal: panama9";
        boolean result = validPalindrom(str);
        System.out.println(result);
    }
}
