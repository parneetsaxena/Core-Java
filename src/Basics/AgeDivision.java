package Basics;
import java.util.Scanner;
public class AgeDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if(age<=12 && age>0){
            System.out.println("You are a child.");
        }else if(age>12 && age<18){
            System.out.println("You are a teenager.");
        }else{
            System.out.println("You are an adult.");
        }
    }
}
