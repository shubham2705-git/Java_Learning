package PatternQuestions;

public class pattern32 {
    public static void main(String[] args) {
        int n = 5, spOuter = n-1, spInner = -1;

        for(int i=1; i<=2*n-1; i++){

            for(int j=1; j<=spOuter; j++){
                System.out.print("  ");
            }
            System.out.print("* ");

            for(int j=1; j<=spInner; j++){
                System.out.print("  ");
            }
            if(spInner>=1) System.out.print("* ");

            System.out.println();
            if(i<n){
                spOuter--;
                spInner+=2;
            }
            else{
                spOuter++;
                spInner-=2;
            }
        }
    }
}
