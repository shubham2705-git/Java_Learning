package NumberBasedQuestions;

public class CheckOddEvenOrZero {
    public static void check(int num){
        if(num==0){
            System.out.println("Number is zero");
        }
        else if(num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        int num = 22;
        check(num);
    }
}
