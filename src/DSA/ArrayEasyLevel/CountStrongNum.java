package ArrayEasyLevel;

public class CountStrongNum {
    public static int findFact(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
    public static boolean isStrong(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=findFact(digit);
            n=n/10;
        }
        return sum==temp;
    }
    public static void main(String[] args) {
        int[] arr = {145,145,145,56,43};
        int count=0;
        for(int e:arr){
            if(isStrong(e)) count++;
        }
        System.out.println(count);
    }
}
