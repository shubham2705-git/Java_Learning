package BasicMaths;

public class JavaFourthQuestions {
    public static void findOnroadPrice(){
        String name = "safari";
        int price = 1000000;
        int tax = 50;
        int insurance = 0;
        int cc = 1500;
        if(tax > 0 && insurance > 0){
            price = price + tax + insurance;
        }
        else if(tax > 0){
            price = price + tax;
        }
        else if(insurance > 0){
            price = price + insurance;
        }
        System.out.println(name + ":" + "Price :" + price);
    }
    public static void calculateTax(){
        double price = 1500000;
        double tax = 0.0;
        if(price < 1000000){
            tax =  (21.0/100 * price);
        }
        else if(price >= 1000000 && price < 2000000){
            tax = (28.0/100 * price);
        }
        else if(price >= 2000000 && price < 3000000){
            tax = (32.0/100 * price);
        }
        else{
            tax = (38.0/100 * price);
        }
        System.out.println("Tax :"+ tax);
    }
    public static void calculateInsurance(){
        int cc = 990;
        int ans = 0;
        if(cc < 1000){
            ans = ans + 6550;
        }
        else if(cc >= 1000 && cc < 2000){
            ans = ans + 16750;
        }
        else if(cc >= 2000 && cc < 3000){
            ans = ans + 32800;
        }
        else{
            ans = ans + 42500;
        }
        System.out.println("Insurance : "+ans);
    }
    public static void main(String[] args) {
        findOnroadPrice();
        calculateTax();
        calculateInsurance();
        int a = 10;
        System.out.println(a++ + ++a);
        byte b = 127;
        b++;
        b++;
        System.out.println(b);
    }
}
