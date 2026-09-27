package PatternQuestions;

public class pattern29 {
    public static void main(String[] args) {
        int n = 5, st = 2*n-1, sp=0;

        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<n){
                st-=2;
                sp++;
            }
            else{
                st+=2;
                sp--;
            }
        }
    }
}
