package Basics;
import java.util.Scanner;
public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if(num%5==0 && num%3==0){
            System.out.println(num+" is divisible by both 3 and 5.");
        }else{
            System.out.println(num + " is not divisible by both 3 and 5");
        }
    }
}
