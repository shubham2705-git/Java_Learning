package BasicMaths;

public class CheckNumberPalindrome {
    public static boolean check(int n){
        int count = 0;
        int temp = n;
        while(temp>0){
            count++;
            temp=temp/10;
        }

        int power= 1;
        for(int i=1;i<count;i++){
            power = power * 10;
        }
        int left = n;
        int right = n;

        for(int i=0;i<count/2;i++){
            int lastDigit = left%10;
            int firstDigit = right/power;
            if(lastDigit != firstDigit){
                return false;
            }
            left = left/10;
            right = right%power;
            power = power/10;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 1234321;
        System.out.println(check(n));
    }
}
