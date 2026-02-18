package ArrayEasyLevel;

public class CheckArmstrongNumber {
    public static boolean isArmstrong(int num){
        int original = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while(num>0){
            int digit = num%10;
            sum = sum + (int)Math.pow(digit,digits);
            num/= 10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        int num = 153;

        if(isArmstrong(num)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
