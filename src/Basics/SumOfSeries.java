package Basics;
import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the stream: ");
        int num = scanner.nextInt();
        int sumOfSeries = 0;
        for(int i =1;i<=num;i++){
            if(i %2==0){
                sumOfSeries +=i;
            }else{
                sumOfSeries-=i;
            }
        }
        System.out.println(sumOfSeries);
    }
}
