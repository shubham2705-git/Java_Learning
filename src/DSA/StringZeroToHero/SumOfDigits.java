package StringZeroToHero;

public class SumOfDigits {
    public static void main(String[] args) {
        String s = "23421";
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int j = ch-'0';
            sum +=j;
        }
        System.out.println(sum);
    }
}
