package PatternQuestions;

class Pattern26 {
    public static void main(String[] args) {

        int n = 5, sp = n-1, st = 1;

        for(int i = 1; i <= 2*n-1; i++){

            for(int j = 1; j <= sp; j++){
                System.out.print("  ");
            }

            for(int j = 1; j <= st; j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i < n){
                sp--; st+=2;
            }
            else{
                sp++; st-=2;
            }
        }
    }
}
