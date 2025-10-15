package recursion;

public class PrintingNumbers {
    public static void print(int count){
        if(count==51){
            return;
        }
        System.out.println(count);
        count++;
        print(count);
    }
    public static void main(String[] args) {
        int count = 1;
        print(count);
    }
}
