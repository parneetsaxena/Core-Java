package Basics;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        int p = scanner.nextInt();
        System.out.println("Enter the rate(in %) : ");
        float r = scanner.nextFloat();
        System.out.println("Enter the time taken (in years): ");
        int t = scanner.nextInt();
        float simpleInterest = (p*r*t)/100;
        System.out.println("The simple interest is: "+ simpleInterest);
    }
}
