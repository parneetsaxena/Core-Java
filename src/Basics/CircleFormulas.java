package Basics;
import java.util.Scanner;
public class CircleFormulas {
    public static void main(String[] args){
        double radius,diameter,area,circumference;
        double pi = Math.PI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = scanner.nextDouble();
        diameter = radius*2;
        area = pi*radius*radius;
        circumference = 2*pi*radius;
        System.out.println("The diameter is: "+diameter);
        System.out.println("The area is: "+area);
        System.out.println("The circumference is: "+circumference);

    }
}
