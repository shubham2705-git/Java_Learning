package recursion;

public class Print1ToN {
    public static void print(int count){
        if(count>0) {
            print(count - 1);
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        int count = 5;
        print(count);
    }
}
