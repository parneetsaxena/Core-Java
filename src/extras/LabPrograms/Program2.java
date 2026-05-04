package extras.LabPrograms;
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int a = scanner.nextInt();
        System.out.print("Enter second value: ");
        int b = scanner.nextInt();
        int c = a+b;
        System.out.println("The sum of "+ a+ " & "+ b+ " is: "+c);
    }
}
