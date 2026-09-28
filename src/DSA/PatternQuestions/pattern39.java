package PatternQuestions;

public class pattern39 {
    public static void main(String[] args) {
        int n=5;
        int first=2;
        int second=n*2-2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n*2-1; j++){
                if(j<first || j>second)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
            first++;second--;
        }
    }
}
