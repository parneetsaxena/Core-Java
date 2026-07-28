package advanced.exceptionhandling.problems;

public class Problem4 {
    static void withdraw(double amount){
        double balance = 1000;
        if(amount<0){
            throw new IllegalArgumentException("Cannot withdraw in negative");
        }
        if(amount>balance){
            throw new RuntimeException("Insufficient Balance");
        }
        {
            balance = balance-amount;
            System.out.println("Amount successfully withdrawn");
        }
    }
    public static void main(String[] args) {
        withdraw(200);
    }
}
