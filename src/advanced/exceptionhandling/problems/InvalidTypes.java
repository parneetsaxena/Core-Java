package advanced.exceptionhandling.problems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidTypes {
    public static void main(String[] args) {
        String[] names = {"Rohul","Amon","Rohon"};
        Scanner scanner = new Scanner(System.in);
        int index;
        try{
            index = scanner.nextInt();
            System.out.println(names[index]);

        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
