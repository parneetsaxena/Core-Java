package problems;
import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in degree Celsius: ");
        int celsius = input.nextInt();
        double fahrenheit = ((celsius*9)/5)+32;
        System.out.println("The temperature from "+celsius+" to Fahrenheit is: "+fahrenheit);
    }
}
