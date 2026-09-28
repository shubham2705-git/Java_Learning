package PatternQuestions;

public class pattern34 {
    public static void main(String[] args) {
        int n=7, st=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<=n/2) st++;
            else st--;
        }
    }
}
