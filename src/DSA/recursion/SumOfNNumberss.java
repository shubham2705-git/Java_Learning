package recursion;

import java.util.Scanner;

public class SumOfNNumberss {
    public static int print( int n){
        if(n==0){
            return 0;
        }
        return n+print(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        System.out.println(print(n));
    }
}
