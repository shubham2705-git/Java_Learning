package CustomException;

public class Bank {
    public static void withdraw(int balance,int amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new IndexOutOfBoundsException("Insufficient Balance !");
        }
        System.out.println("Withdraw Successfull");
    }

    public static void main(String[] args) {
        try{
            withdraw(500,550);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
