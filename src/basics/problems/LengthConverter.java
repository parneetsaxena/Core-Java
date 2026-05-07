package basics.problems;
import java.util.Scanner;
public class LengthConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length in cm: ");
        double cm = input.nextDouble();
        double meter = cm/100;
        double kilometer = cm/100000;
        System.out.println("The length of "+cm+" cm in meter is: "+meter);
        System.out.println("The length of "+cm+" cm in kilometer is: "+kilometer);
    }
}
