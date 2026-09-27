package PatternQuestions;

public class pattern13 {
    public static void main(String[] args) {
        int n = 5;
        int count=1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.printf("%3d",count++);
            }
            System.out.println();
        }
    }
}
