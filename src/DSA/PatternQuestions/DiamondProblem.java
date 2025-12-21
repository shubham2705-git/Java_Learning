package PatternQuestions;

public class DiamondProblem {
    public static void print(int n){
        int nstr = 1;
        int spc = n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<spc;j++) {
                System.out.print(" ");
            }
                for(int k=0;k<nstr;k++){
                    System.out.print("*");
                }
                if(i<n/2){
                    nstr+=2;
                    spc-=1;
                }else{
                    nstr-=2;
                    spc+=1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
     print(7);
    }
}
