package Basics;
import java.util.Scanner;
public class SumOfStreams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to add: ");
        int num = input.nextInt();
        for(;num!=-1;){
            sum += num;
            num = input.nextInt();
        }
        System.out.println(sum);
    }
}
