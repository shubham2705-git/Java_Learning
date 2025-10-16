package recursion;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void print(int i,int sum){
        if(i<0) {
            System.out.println(sum);
            return;
        }
        print(i-1, sum+i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        print(n,0);
    }
}
