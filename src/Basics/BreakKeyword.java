package Basics;
import java.util.Scanner;
public class BreakKeyword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements to search in: ");
        int n = scanner.nextInt();
        for(int num = 1;num<=n;num++){
            if(num%5==0 && num%7==0){
                System.out.println(num);
                break;
            }
        }

        // Using while loop
//        int num = 1;
//        while(true){
//
//            if(num%5==0 && num%7==0) {
//                System.out.println(num);
//                break;
//            }
//            num++;
//        }

    }
}
