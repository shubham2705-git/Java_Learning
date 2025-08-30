package StringZeroToHero;

public class LengthOfLastWord {
    public static int lengthOfLast(String str){
        String s = str.trim();
        int count = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str ="  fly me  to   moon";
        int result = lengthOfLast(str);
        System.out.println(result);
    }
}
