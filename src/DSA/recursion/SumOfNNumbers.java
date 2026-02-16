package recursion;

import java.util.Scanner;

public class SumOfNNumbers {
    public static int sumOfNNumbers(int n){
        int x;
        if(n<=1) return n;
        x = sumOfNNumbers(n-1)+n;
        return x;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        System.out.println(sumOfNNumbers(n));
    }
}
