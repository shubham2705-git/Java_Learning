package StringZeroToHero;

public class PalindromeString {
    public static boolean palindromeString(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        return reverse.toLowerCase().equals(s.toLowerCase());

// ------------ Optimal Solution ----------------------
//        String lower = s.toLowerCase();
//        String reversed = new StringBuilder(lower).reverse().toString();
//        return lower.equals(reversed);
    }
    public static void main(String[] args) {
        String s = "eleesBSeele" ;
        boolean result = palindromeString(s);
        System.out.println(result);
    }
}

