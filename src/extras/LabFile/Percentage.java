package extras.LabFile;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args){
        int Hindi,English,Maths,Chemistry,Physics,total;
        float percentage;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks of Hindi: ");
        Hindi = scanner.nextInt();
        System.out.print("Enter the marks of English: ");
        English = scanner.nextInt();
        System.out.print("Enter the marks of Physics: ");
        Physics = scanner.nextInt();
        System.out.print("Enter the marks of Chemistry: ");
        Chemistry = scanner.nextInt();
        System.out.print("Enter the marks of Mathematics: ");
        Maths = scanner.nextInt();
        total = (Hindi+English+Maths+Chemistry+Physics);
        percentage = (total*100)/500;
        System.out.println("Your percentage is: " + percentage);
        if(percentage>=40){
            System.out.println("You have passed");
        } else{
            System.out.println("You have failed");
        }
    }

}
