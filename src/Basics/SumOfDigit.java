package Basics;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int sumOfDigit = 0;
        while(num>0){
            int remainder = num%10;
            sumOfDigit += remainder;
            num = num/10;
        }
        System.out.println(sumOfDigit);
    }
}
