package Basics;
import java.util.Scanner;
public class RectangleFormulas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int l,b,area,perimeter;
        System.out.println("Enter the length: ");
        l = scanner.nextInt();
        System.out.println("Enter the breadth: ");
        b = scanner.nextInt();
        area = l*b;
        System.out.println("The area of rectangle is: "+ area);
        perimeter = 2*(l+b);
        System.out.println("The perimeter is: "+ perimeter);
    }
}
