package ArrayHardLevel;

public class Ncr {
    // find the value in pascal triangle at give index
    public static int findNcr(int n,int r){
        int res = 1;
        for(int i=0;i<r;i++)
        {
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }
    // print the given row in pascal triangle
    public static void printRow(int n){
        for(int i=1;i<=n;i++){
            System.out.print(findNcr(n-1,i-1)+" ");
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int r = 3;
        int result = findNcr(n-1,r-1);
        System.out.println("printing given index value");
        System.out.println(result);
        System.out.println("printing row");
        printRow(n);
    }
}
