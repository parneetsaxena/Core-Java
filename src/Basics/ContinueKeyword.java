package Basics;
import java.util.Scanner;
public class ContinueKeyword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int num = scanner.nextInt();
        for(int n = 1; n<=num;n++){
            if(n%3==0){
                continue;
            }else{
                System.out.println(n);
            }
        }

        // Using while loop
//        int nn = 1;
//        while(nn<=num){
//            if(nn%3==0){
//                nn++;
//                continue;
//            }
//                System.out.println(nn);
//                nn++;
//        }

    }
}
