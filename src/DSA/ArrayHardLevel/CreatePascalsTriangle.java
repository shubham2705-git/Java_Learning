package ArrayHardLevel;

public class CreatePascalsTriangle {
    public static int findNcr(int n,int r){
        int res = 1;
        for(int i=0;i<r;i++)
        {
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }
    public static void printingPascalsTriangle(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<row;col++){
                System.out.print(findNcr(row-1,col-1)+" ");
            }
            System.out.print("1");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 6;
        printingPascalsTriangle(n);
    }
}
