package BasicMaths;

public class FirstNthPrimeNumber {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void find(int n){
        int i = 1;
        int count = 0;
        while(count!=n){
            if(isPrime(i)) count++;
            if(count==n) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int n = 4;
        find(n);
    }
}
