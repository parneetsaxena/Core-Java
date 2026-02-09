package LabPrograms;
import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int a = scanner.nextInt();
        System.out.print("Enter second value: ");
        int b = scanner.nextInt();
        System.out.println("Select the operation: \n Press 1 for addition \n Press 2 for subtraction \n Press 3 for multiplication \n Press 4 for division");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("The sum is: "+(a+b));  break;
            case 2:
                System.out.println("The difference is : "+ (a-b)); break;
            case 3:
                System.out.println("The product is: "+ (a*b)); break;
            case 4:
                System.out.println("The quotient is: "+ (a/b)); break;
            default:
                System.out.println("Please enter a valid choice next time.");
        }
    }
}
