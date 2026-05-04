package extras.LabPrograms;
import java.util.Scanner;
public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int first = scanner.nextInt();
        System.out.print("Enter second value: ");
        int second = scanner.nextInt();
        System.out.print("Enter third value: ");
        int third = scanner.nextInt();
        if(first>second && first>third){
            System.out.println(first + " is the greatest.");
        }else if(second>third && second>first){
            System.out.println(second+ " is the greatest");
        }else{
            System.out.println(third+ " is the greatest");
        }
     scanner.close();
    }
}
