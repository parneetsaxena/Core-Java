package Basics;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int num = 1;
        do{
            System.out.println(num);
            num++;
        }while(num<=n);
    }
}
