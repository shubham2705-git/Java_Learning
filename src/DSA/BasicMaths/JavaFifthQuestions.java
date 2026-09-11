package BasicMaths;

import java.util.Scanner;

public class JavaFifthQuestions {
    public static void display(String name,String qualifications, char masters, int yop, int physics, int chemistry, int maths, int optional){
        System.out.println("Name: "+ name);
        System.out.println("Qualifications: "+ qualifications);
        System.out.println("Masters: "+masters);
        System.out.println("Year of passout: "+yop);
        System.out.println("Physics marks: "+physics);
        System.out.println("Chemistry marks: "+chemistry);
        System.out.println("Maths marks: "+maths);
        System.out.println("Optional: "+optional);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = sc.nextLine();
//        System.out.println("Enter your qualifications");
//        String qualifications = sc.nextLine();
//        System.out.println("Enter masters done or not");
//        String input = sc.next();
//        char master = input.charAt(0);
//        System.out.println("Enter year of passout");
//        int yop = sc.nextInt();
//        System.out.println("Enter physics marks");
//        int physics = sc.nextInt();
//        System.out.println("Enter chemistry marks");
//        int chemistry = sc.nextInt();
//        System.out.println("Enter maths marks");
//        int maths = sc.nextInt();
//        System.out.println("Enter optional marks");
//        int optional = sc.nextInt();
        // display(name, qualifications, master, yop, physics, chemistry, maths, optional);

        // Taking array as input and printing
        System.out.println("Enter length of the array");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter element of " +i+" index");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.println("Value at "+i+" index is " + arr[i]);
        }
    }
}
