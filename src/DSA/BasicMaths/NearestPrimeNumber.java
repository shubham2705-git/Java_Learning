package BasicMaths;

public class NearestPrimeNumber {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void find(int n){

        int l = n-1, h = n+1;
        while(l>1){
            if(isPrime(l)){
                System.out.println(l);
                break;
            }
            else if(isPrime(h)){
                System.out.println(h);
                break;
            }
                l--;
                h++;
        }
    }
    public static void main(String[] args) {
        int  n = 29;
        find(n);
    }
}
