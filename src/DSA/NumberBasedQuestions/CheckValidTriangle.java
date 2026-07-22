package NumberBasedQuestions;

public class CheckValidTriangle {
    public static void check(int a,int b,int c){
        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Not a valid triangle");
        }
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 6;
        check(a,b,c);
    }
}
