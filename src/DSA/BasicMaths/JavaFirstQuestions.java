package BasicMaths;

public class JavaFirstQuestions {
    public static void functionFirst(){
        int r = 10;
        double ans = (22.0/7) * r * r;
        System.out.println(ans);
    }
    public static void functionSecond(){
        int b = 10;
        int h = 10;
        double ans = (1.0/2) * b * h;
        System.out.println(ans);
    }
    public static void functionThird(){
        int phy = 40;
        int chem = 30;
        int maths = 20;
        int optional = 20;
        int sum = (phy+chem+maths+optional);
        double ans = (sum/280.0) * 100;
        System.out.println(ans);
    }
    public static void functionFourth(){
        int s1 = 25;
        int s2 = 25;
        int s3 = 25;
        int s4 = 25;
        int sum1 = s1+s2+s3+s4;
        double discount1 = (80.0/100) * sum1;

        int p1 = 25;
        int p2 = 25;
        int p3 = 25;
        int p4 = 25;
        int sum2 = p1+p2+p3+p4;
        double discount2 = (70.0/100) * sum2;
        System.out.println(discount1+discount2);
     }
    public static void functionFifth(){
        int price = 385;
        int a1 = 287;
        int a2 = 287;
        int a3 = 287;
        int sum = a1+a2+a3;
        double ans = (sum/1000.0) * price;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        functionFirst();
        functionSecond();
        functionThird();
        functionFourth();
        functionFifth();
    }
}
