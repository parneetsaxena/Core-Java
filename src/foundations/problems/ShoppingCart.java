package foundations.problems;
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to buy? : ");
        String item = scanner.next();
        System.out.println("How many items would you like to buy? : ");
        int quantity = scanner.nextInt();
        System.out.println("What is the price of the item? : ");
        double price = scanner.nextDouble();
        double total = quantity*price;
        System.out.println("Your total is: $"+ total);
    }
}
