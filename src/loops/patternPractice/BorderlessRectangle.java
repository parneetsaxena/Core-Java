package loops.patternPractice;
import java.util.Scanner;
public class BorderlessRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = scanner.nextInt();
        char ch ='*';
        for(int i = 1;i<=row;i++){
            for(int j = 1;j<=column;j++){
                if(i==1 || i==row || j==1 || j==column){
                    System.out.print(ch);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
