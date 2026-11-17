package recursion;

public class ReverseTheString {
    public static String reverse(String s){
        if(s.length()==0) return s;
        return reverse(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
        String s = "abcdefgh";
        System.out.println(reverse(s));
    }
}
