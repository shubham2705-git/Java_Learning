package NumberBasedQuestions;

public class CheckLargestAmongThree {
    public static void check(int a,int b,int c){
        if(a>b){
            if(a>c){
                System.out.println("A is largest");
            }else{
                System.out.println("C is largest");
            }
        }else{
            if(b>c){
                System.out.println("B is largest");
            }else{
                System.out.println("C is largest");
            }
        }
    }
    public static void main(String[] args) {
        int a = 71;
        int b = 45;
        int c = 8;
        check(a,b,c);
    }
}
