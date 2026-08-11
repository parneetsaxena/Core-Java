package advanced.exceptionhandling.problems;
import java.util.Scanner;
public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int num = scanner.nextInt();
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            scanner.close();
            System.out.println("Program finished");
        }
    }
}
