package PatternQuestions;

public class NumericalDiamond {
    public static void print(int n){
        int star = 1;
        int space=n/2+1;
        int count1=1;
        int count2=2;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int k=0;k<star;k++){
                if(k<n/2 && i<n/2){
                    System.out.print(count1++);
                }
                if(k>n/2 && i>n/2){
                    System.out.print(--count1);
                }
                if(k>n/2 && i>n/2){
                    System.out.print(count2++);
                }
                if(k<n/2 && i <n/2){
                    System.out.print(--count1);
                }
            }
            if(i<n/2){
                star+=2;
                space-=1;
            }else{
                star-=2;
                space+=1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(5);
    }
}
