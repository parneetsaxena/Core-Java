// You can allocate resources with try block. When initialized using try block, the resource will automatically be deallocated when executed
// The resource does not need closing when initialized with try block

package advanced.exceptionhandling;
import java.util.Scanner;
public class ExceptionTryWithResources {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in);){
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        }
    }
}
