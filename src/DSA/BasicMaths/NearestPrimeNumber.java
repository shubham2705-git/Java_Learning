package BasicMaths;

public class NearestPrimeNumber {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static int find(int n){
        if(isPrime(n)){
            return n;
        }
        int l = n-1 ;
        int h = n+1;
        while(l>1){
            if(isPrime(l)){
                return l;
            }
            else if(isPrime(h)){
                return h;
            }else{
                l--;
                h++;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int  n = 29;
        System.out.println(find(n));
    }
}
