package basics;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of pyramid: ");
        int pyra = input.nextInt();
        int half = pyra/2;
        for(int i=1;i<=pyra && half==0;i++){
           for(int j = 1;j<=i;j++){
               System.out.print('*');
           }
            System.out.println();
        }
    }
}
