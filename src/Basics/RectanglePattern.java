package Basics;
import java.util.Scanner;
public class RectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int x = scanner.nextInt();
        System.out.println("Enter columns: ");
        int y = scanner.nextInt();
        char ch = '*';
        for(int i = 1;i<=x;i++){
            for(int j = 1;j<=y;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
