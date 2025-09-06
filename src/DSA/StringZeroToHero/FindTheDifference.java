package StringZeroToHero;

public class FindTheDifference {
    public static char difference(String s1,String s2){
        int total = 0;
        for(int i=0; i<s2.length();i++){
            total += s2.charAt(i);
        }
        for(int i=0; i<s1.length();i++){
            total -= s1.charAt(i);
        }
        return (char)total;
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcde";
        char ch = difference(s1,s2);
        System.out.println(ch);
    }
}
