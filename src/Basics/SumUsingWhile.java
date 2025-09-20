package Basics;
import java.util.Scanner;
public class SumUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter number to add: ");
//        int num = input.nextInt();
//        while(num!=0){
//            sum = sum+num;
//            num = input.nextInt();
//        }
        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            } sum +=num;
        }
       System.out.println("Sum = " + sum);

    }
}


