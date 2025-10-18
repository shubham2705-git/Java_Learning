package recursion;

public class MultipleRecursionCallsFabonacciSeries {
     public static int fabonacciSeries(int n){
         if(n<=1) return n;
         int last = fabonacciSeries(n-1);
         int slast = fabonacciSeries(n-2);
         return last+slast;
     }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fabonacciSeries(n));
    }
}
