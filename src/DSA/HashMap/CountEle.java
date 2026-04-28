package HashMap;


public class CountEle {
    public static void find(int n){
        if((n&1) ==1){
            System.out.println("odd");
        }
        if((n&1)==0){
            System.out.println("even");
        }
    }
    public static void main(String[] args) {
        find(5);
        }
    }
