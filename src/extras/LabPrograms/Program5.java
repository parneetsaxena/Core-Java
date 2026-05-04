package extras.LabPrograms;
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("A before swapping: "+a);
        System.out.println("B before swapping: "+ b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("A after swapping: "+ a);
        System.out.println("B after swapping: "+ b);
    }
}
