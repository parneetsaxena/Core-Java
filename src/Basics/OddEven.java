package Basics;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println(num+ " is even");
        }else{
            System.out.println(num + " is odd");
        }

        int num2 = input.nextInt();
        String result = (num2 % 3 == 0)?"Multiple of 3":"Not a multiple of 3";
        System.out.println(result);
    }
}
