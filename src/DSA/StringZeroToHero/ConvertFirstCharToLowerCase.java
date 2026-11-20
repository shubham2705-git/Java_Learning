package StringZeroToHero;

public class ConvertFirstCharToLowerCase {
    public static void main(String[] args) {
        String s = "his is fat Boy";
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(i==0|| ch[i-1]==' '){
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        System.out.println(ch);
    }
}
