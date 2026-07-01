package foundations;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.print("Hey ");
        System.out.print(name);
        System.out.println(", How's it going?");
    }
}
