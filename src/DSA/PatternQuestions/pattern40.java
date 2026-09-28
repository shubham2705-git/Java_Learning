package PatternQuestions;

public class pattern40 {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static int nthPrime(int num){
        int count=0;
        int i=1;
        while(true){
            if(isPrime(i)) count++;
            if(count==num) return i;
            i++;
        }
    }
    public static void main(String[] args) {
        int num = 1;
        int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(nthPrime(num)+" ");
                num++;
            }
            System.out.println();
        }
    }
}
