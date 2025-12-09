package ArrayEasyLevel;

public class ArmStrongNumbers {
    public static void armStrong(int n){
        int cube =0;
        for(int i=1;i<n;i++){
            int temp = i;
            int sum = 0;
            while(temp!=0){
                int remain = temp%10;
                cube = remain * remain * remain;
                sum+=cube;
                temp=temp/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int n = 1000;
        armStrong(n);
    }
}
