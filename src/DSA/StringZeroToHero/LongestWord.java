package StringZeroToHero;

public class LongestWord {
    public static String longest(String s){
        StringBuilder sb = new StringBuilder();
        String ans = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            if(ch==' ') sb=new StringBuilder();
            if(ans.length()<sb.length()) ans = sb.toString();
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "This is the largest";
        System.out.println(longest(s));
    }
}
