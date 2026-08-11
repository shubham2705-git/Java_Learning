package BasicMaths;

public class NumberOfDaysInMonth {
    public static void printDays(){
        int n = 13;
        if(n==1 || n==3||n==5||n==7||n==8||n==10||n==12) System.out.println("31 Days");
        if(n==2) System.out.println("28 Or 29 Days");
        if(n>12) System.out.println("Invalid");
        if(n==4||n==6||n==9||n==11) System.out.println("30 Days");
    }
    public static void deposit(){
        int bal = 75000;
        int amount = 45000;
        boolean panCard = false;
        int ans = 0;
        if(amount<50000 ||panCard==true){
            ans = bal+amount;
            System.out.println("new balance =" + ans);
        }else{
            System.out.println("Link pan card");
        }
    }
    public static void main(String[] args) {
      //  printDays();
        deposit();
    }
}
