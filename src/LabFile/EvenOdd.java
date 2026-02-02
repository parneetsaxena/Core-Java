package LabFile;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.print("Enter a positive number: ");
        value = scanner.nextInt();
        if(value%2==0){
            System.out.println(value + " is an even number");
        } else{
            System.out.println(value + " is an odd number");
        }
    }

}
