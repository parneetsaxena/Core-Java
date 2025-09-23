package Basics;
import java.util.Scanner;
public class Exponential {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        long powered = 1;
        for(int i =1;i<=b;i++){
            powered *=a;
        }
        System.out.println(powered);

    }
}
