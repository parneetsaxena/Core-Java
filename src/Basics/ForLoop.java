package Basics;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of numbers to be printed: ");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1; i<=num;i++){

            sum = sum+i;

        }
        System.out.println(sum);
    }
}
