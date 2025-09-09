package Basics;
import java.util.Scanner;
public class MeterToKilometre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length in centimetre: ");
        int length = scanner.nextInt();
        double meter = length/100;
        double km = length/100000.0;
        System.out.println("The length in meters is: "+ meter + "m");
        System.out.println("The length in km is: "+ km + "km");
    }
}
