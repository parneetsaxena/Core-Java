package Basics;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int integer = scanner.nextInt();
        System.out.println("Enter a float value: ");
        float fraction = scanner.nextFloat();
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Enter a boolean: ");
        boolean bool = scanner.nextBoolean();
        System.out.println("The integer,float,char,boolean are as followed: "+integer+fraction+ch+bool);

    }
}
