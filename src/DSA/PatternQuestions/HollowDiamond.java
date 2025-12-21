package PatternQuestions;

public class HollowDiamond {
    public static void print(int n){
        int star = n/2+1;
        int space = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            for(int l=0;l<star;l++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n/2){
                space+=2;
                star-=1;
            }else{
                space-=2;
                star+=1;
            }

        }
    }
    public static void main(String[] args) {
        print(7);
    }
}
