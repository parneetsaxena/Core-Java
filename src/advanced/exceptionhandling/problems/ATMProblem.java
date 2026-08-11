package advanced.exceptionhandling.problems;

public class ATMProblem {
     int balance = 0;

     void deposit(int amount) throws IllegalArgumentException{
        if(amount<0){
            throw new IllegalArgumentException("Cannot deposit negative amount");
        }
        balance+=amount;
         System.out.println("Amount deposited successfully");
    }
     void withdraw(int amount) throws IllegalArgumentException{
        if(amount<0){
            throw new IllegalArgumentException("Cannot withdraw negative amount");
        }
        balance-=amount;
         System.out.println("Amount withdrawn Successfully");
    }
     void checkBalance(){
         System.out.println("Current Balance: "+balance);
    }

    public static void main(String[] args) {
         ATMProblem atm = new ATMProblem();
        try{
            atm.deposit(300);

        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
        try{
            atm.withdraw(299);
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
        try{
            atm.checkBalance();
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
