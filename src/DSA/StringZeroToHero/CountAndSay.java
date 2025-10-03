package StringZeroToHero;

public class CountAndSay {
    public static String countAndSay(int n){
        if(n == 1) return "1";
        String say = countAndSay(n-1);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < say.length(); i++){
            char ch = say.charAt(i);
            int count = 1;
            while(i < say.length()-1 && say.charAt(i) == say.charAt(i+1)){
                count++;
                i++;
            }
            result.append(count).append(ch);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        int n = 4;
        String result = countAndSay(n);
        System.out.println(result);
    }
}
