package Basics;
import java.util.Scanner;
public class IsEvenAndDivisibleByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if(num % 2 == 0){
            if(num%3==0){
                System.out.println(num + " is even and divisible by 3");
            }else{
                System.out.println(num + " is even but not divisible by 3");
            }
        }else if(num % 3 ==0){
            System.out.println(num + " is not even but divisible by 3");
        }else{
            System.out.println(num + " is neither even nor divisible by 3");
        }
    }
}
