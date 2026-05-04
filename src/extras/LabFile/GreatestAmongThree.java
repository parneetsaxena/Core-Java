package extras.LabFile;

import java.util.Scanner;

public class GreatestAmongThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        num3 = scanner.nextInt();
        if(num1>num2 && num1>num3){
            System.out.printf("%d is greater than %d & %d",num1,num2,num3);
        } else if (num2>num1 && num2>num3) {
            System.out.printf("%d is greater than %d & %d", num2,num1,num3);
        } else{
            System.out.printf("%d is greater than %d & %d", num3,num2,num1);
        }
    }

}
