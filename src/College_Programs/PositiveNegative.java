package College_Programs;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if(num<0){
            System.out.println(num + " is a negative number.");
        } else if(num==0){
            System.out.println("Invalid input. Please enter a number other than zero.");
        } else{
            System.out.println(num + " is a positive number.");
        }
    }
}
