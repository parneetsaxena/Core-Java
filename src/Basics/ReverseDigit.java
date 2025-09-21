package Basics;
import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int digit = scanner.nextInt();
        int reversed = 0;
        while(digit>0){
            int first = digit%10;
           reversed = (reversed*10)+ (first);
           digit/=10;

        }
        System.out.println(reversed);
    }
}
