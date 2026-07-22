package ArrayEasyLevel;

public class ArmStrongNumbers {
    public static void armStrong(int n){
        for(int i=100;i<n;i++){
            int temp = i;
            int count = 0;
            int result = 0;
            while(temp>0){
                count++;
                temp = temp/10;
            }
            temp = i;
            while(temp>0){
                int digit = temp%10;
                int power = 1;
                for(int j=0;j<count;j++){
                    power = power * digit;
                }
                result = result + power;
                temp  = temp/10;
            }
            if(result==i){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int n = 10000;
        armStrong(n);
    }
}
