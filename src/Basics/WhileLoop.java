package Basics;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num =1, sum=0;
        System.out.println("Enter the value of number to be printed: ");
        int n = input.nextInt();
        while(num<=n){
//            System.out.println(num);
            sum = sum+num;

            num++;
        }
        System.out.println(sum);
    }
}
