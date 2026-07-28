package foundations;
import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String string1 = scanner.nextLine();
        System.out.print("\nEnter second string: ");
        String string2 = scanner.nextLine();
        System.out.println("The length of string a: "+string1.length());
        System.out.println("The length of string b: "+string2.length());
        System.out.println("The concatenation is: "+string1.concat(string2));
        System.out.println("First string to uppercase: "+string1.toUpperCase());




        // Strings can also be split to get different values from files like CSV

        String str = "John,Brock,Roman,Seth";
        String names[] = str.split(",");
        for(String s: names){
            System.out.println(s);
        }
    }

}

