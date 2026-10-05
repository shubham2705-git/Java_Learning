package ArrayEasyLevel;

public class PrintPrimeElements {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,6,8,11,13};
        for(int e:arr){
            if(isPrime(e))
                System.out.print(e+" ");;
        }
    }
}
