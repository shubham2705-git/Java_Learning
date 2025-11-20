package StringZeroToHero;

public class RepeatedSubstringPattern {
        public static boolean repeatedSubstringPattern(String s) {
            for(int i=s.length()/2;i>0;i--){
                if(s.length()%i==0){
                    int times=s.length()/i;
                    String pattern = s.substring(0,i);
                    String newStr = "";
                    while(times!=0){
                        newStr+=pattern;
                        times--;
                    }
                    if(newStr.equals(s)){
                        return true;
                    }
                }
            }
            return false;
            // on line solution
            // return ((s + s).substring(1, 2 * s.length() - 1).contains(s));
    }
    public static void main(String[] args) {
        String str="abcabcabcabc";
        System.out.println(repeatedSubstringPattern(str));
    }
}
