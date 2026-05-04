package extras.LabPrograms;
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if(num==0){
            System.out.println("Invalid input. Zero is neither odd nor even");
        }else if(num%2==0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
    }
}
