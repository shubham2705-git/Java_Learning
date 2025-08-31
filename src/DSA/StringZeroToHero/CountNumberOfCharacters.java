package StringZeroToHero;

public class CountNumberOfCharacters {
    public static int countChar(String s) {
        int count = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)!=' ')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "  the sky is blue     ";
        int result = countChar(s);
        System.out.println(result);
    }
}
