package recursion;

public class CheckPalindrome {
    public static boolean checkPalindrome(String str, int i){
        if(i>=str.length()/2) return true;
        if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;
        return checkPalindrome(str,i+1);
    }
    public static void main(String[] args) {
        String str = "jgjgj";
        int i = 0;
        boolean result = checkPalindrome(str,i);
        System.out.println(result);
    }
}
