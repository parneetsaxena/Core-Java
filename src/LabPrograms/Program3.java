package LabPrograms;
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first float value: ");
        float a = scanner.nextFloat();
        System.out.print("Enter second float value: ");
        float b = scanner.nextFloat();
        float c = a+b;
        System.out.println("The product of "+a+" and "+ b+ " is "+c);
    }
}
