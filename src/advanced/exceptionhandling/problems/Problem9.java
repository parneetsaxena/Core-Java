package advanced.exceptionhandling.problems;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem9 {

     int balance = 2000;

    void deposit(int amount) throws NegativeAmountException{
        if(amount<0){
            throw new NegativeAmountException("Amount cannot be negative");
        }
        balance = balance+amount;
        System.out.println("Amount deposited successfully. Current Balance: "+balance);
    }

    void withdraw(int amount) throws ATMException,NegativeAmountException{

        if(amount<0){
            throw new NegativeAmountException("Amount cannot be negative");
        }
        if(amount>balance){
            throw new ATMException("Insufficient Balance");
        }
        balance = balance-amount;
        System.out.println("Amount Withdrawn successfully. Current Balance: "+balance);
    }

     void checkBalance(){
        System.out.println("Current Balance: "+balance);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Problem9 atm = new Problem9();
        int choice = 0;
        atmloop:
        while (true) {
            System.out.println("\n 1. Deposit\n 2. Withdraw\n 3. Check Balance\n 4. Exit\n");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1: {
                        System.out.println("Enter amount to deposit: ");
                        int amount = scanner.nextInt();
                        atm.deposit(amount);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter amount to withdraw: ");
                        int amount1 = scanner.nextInt();
                        atm.withdraw(amount1);
                        break;
                    }
                    case 3:
                        atm.checkBalance();
                        break;
                    case 4:
                        break atmloop;
                }

            } catch (InputMismatchException e) {
                System.out.println("Enter amount in numbers");

            } catch (ATMException | NegativeAmountException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Current balance: " + atm.balance);
            }

        }
        System.out.println();
    }

    }



class ATMException extends Exception{
    public ATMException(String message){
        super(message);
    }
}
class NegativeAmountException extends Exception{
    public NegativeAmountException(String message){
        super(message);
    }
}