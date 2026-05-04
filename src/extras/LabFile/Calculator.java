package extras.LabFile;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        int sum,sub,prod,div,choice,num1,num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();
        System.out.println("\n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n Enter your choice: ");
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("The sum is: " +(num1+num2));
                break;
            case 2:
                System.out.println("The difference is: " + (num1-num2));
                break;
            case 3:
                System.out.println("The product is: "+ (num1*num2));
                break;
            case 4:
                System.out.println("The division is: "+ (num1/num2));
                break;
        }
    }

}
