package CapgeminiPracticeQuestions;

import java.util.Scanner;

public class CalculateInitialVelocity {
    public static int findInitialVelocity(int v,int a,int t){
        return v-(a*t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the final velocity");
        int v = sc.nextInt();
        System.out.println("Write the acceleration in meters/second^2");
        int a = sc.nextInt();
        System.out.println("Write the time interval in second");
        int t = sc.nextInt();
        int result = findInitialVelocity(v,a,t);
        System.out.println("initial velocity is: "+result);
    }
}
