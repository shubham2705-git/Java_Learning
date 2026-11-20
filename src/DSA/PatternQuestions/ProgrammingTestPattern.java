package PatternQuestions;

public class ProgrammingTestPattern {
    public static void main(String[] args) {
        int n = 7;
        int insp = -1;
        int ousp = n/2;
        for(int i=0;i<n;i++){
                for(int k=0;k<ousp;k++){
                    System.out.print("  ");
                }
                System.out.print((i+1)+" ");
                for(int k=0;k<insp;k++){
                    System.out.print("  ");
                }
                if(i!=0 && i!=n-1){
                    System.out.print(" "+(i+1));
                }

            if(i<n/2){
                insp+=2;
                ousp--;
            }else{
                insp-=2;
                ousp++;
            }
            System.out.println();
        }
    }
}
