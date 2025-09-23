package Basics;
import java.util.Scanner;
public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int row = scanner.nextInt();
        for(int i =0;i<=row;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
