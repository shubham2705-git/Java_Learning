package recursion;

public class CheckPalindrome {
    public static boolean checkPalindrome(String str){
        if(str.length()<=1) return true;
        if(str.charAt(0)!=str.charAt(str.length()-1)) return false;
        return checkPalindrome(str.substring(1,str.length()-1));
    }
    public static void main(String[] args) {
        String str = "natin";
        boolean result = checkPalindrome(str);
        System.out.println(result);
    }
}

