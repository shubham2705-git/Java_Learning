package NumberBasedQuestions;

public class CheckWeather {
    public static void check(int temp){
        if(temp<10){
            System.out.println("Cold");
        }else if(temp>10 && temp <=35){
            System.out.println("Warm");
        }else{
            System.out.println("Hot");
        }
    }
    public static void main(String[] args) {
        int temp = 17;
        check(temp);
    }
}
