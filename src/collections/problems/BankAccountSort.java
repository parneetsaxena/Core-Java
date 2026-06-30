package collections.problems;
import java.util.*;
public class BankAccountSort {
    public static void main(String[] args) {
        List<BankAccount> bank = new ArrayList<>(Arrays.asList(
                new BankAccount("Raj",50000,"A103"),
                new BankAccount("Aman",70000,"A101"),
                new BankAccount("Karan",50000,"A102"),
                new BankAccount("Raj",50000,"A100")

                ));
        Collections.sort(bank);
        for(BankAccount b:bank){
            System.out.println(b.accountHolder+" "+b.balance+" "+b.accountNumber);
        }
    }
}
class BankAccount implements Comparable<BankAccount>{
    String accountHolder;
    int balance;
    String accountNumber;
    BankAccount(String accountHolder,int balance,String accountNumber){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public int compareTo(BankAccount b){
        if(this.balance!=b.balance){
            if(this.balance>b.balance){
                return -1;
            }return 1;
        }
        if(!this.accountHolder.equals(b.accountHolder)){
            return this.accountHolder.compareTo(b.accountHolder);
        }
        if(!this.accountNumber.equals(b.accountNumber)){
            return this.accountNumber.compareTo(b.accountNumber);
        }
        return 1;
    }
}
