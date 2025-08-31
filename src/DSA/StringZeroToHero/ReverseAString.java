package StringZeroToHero;

public class ReverseAString {
    public static String reverse(String str){
        String result = "";
        for(int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "interview";
        String result = reverse(str);
        System.out.println(result);
    }
}
