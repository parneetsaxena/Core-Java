package extras.LabPrograms;
import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if(age<=17){
            System.out.println("You are not an adult. You are not eligible to vote");
        }else{
            System.out.println("You are an adult. You are eligible to vote.");
        }
    }
}
