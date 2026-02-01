package RevisionQuestions;

public class HollowRectangle {
    public static void print(){
        for(int i=0; i<7; i++){
            if(i==0 || i==6){
                for(int j=0; j<7; j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int k=0; k<5; k++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print();
    }
}
