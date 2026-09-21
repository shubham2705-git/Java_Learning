package BasicMaths;

public class FirstNPrimeNumbers {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void print(int n){
        int i = 1;
        int count = 0;
        while(count < n){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
}
