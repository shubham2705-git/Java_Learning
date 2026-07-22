package NumberBasedQuestions;

public class CheckTypeOfTriangle {
    public static void check(int a,int b,int c){
        if ((a + b > c) && (b + c > a) && (c + a > b)) {

            if (a == b && b == c) {
                System.out.println("It is Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("It is Isosceles");
            } else {
                System.out.println("It is Scalene");
            }

        } else {
            System.out.println("Not a valid triangle");
        }
    }
    public static void main(String[] args) {
        int a = 70;
        int b = 80;
        int c = 90;
        check(a,b,c);
    }
}
