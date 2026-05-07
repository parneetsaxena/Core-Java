package basics.problems;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int sum;
        int first = 0;
        int second =1;
        System.out.print("Enter the range: ");
        int n = scanner.nextInt();
        for(int i = 0;i<=n;i++){
            sum = first + second;
            System.out.print(sum+ " ");
            first = second;
            second = sum;


        }
    }
}
