package recursion;

import java.util.Scanner;

public class PrintNameNTimes {
    public static void print(int k, int n){
        if(k>n) return;
        print(k+1,n);
        System.out.println(k+" " +"Shubham");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        print(1,n);
    }
}
