package basics.problems;
import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.print(number + " x "+ i + " = "+ (number*i));
            System.out.println();
        }
    }
}
