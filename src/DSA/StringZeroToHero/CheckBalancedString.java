package StringZeroToHero;

public class CheckBalancedString {
    public static boolean isBalanced(String num){
        int even= 0;
        int odd = 0;
        for(int i=0; i<num.length(); i++){
            char ch1 = num.charAt(i);
            int number = ch1-'0';
            if(i%2==0){
                even+=number;
            }else{
                odd+=number;
            }
        }
        return even==odd;
    }
    public static void main(String[] args) {
        String num = "24123";
        System.out.println(isBalanced(num));
    }
}
