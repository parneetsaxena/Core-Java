package LabPrograms;
import java.util.Scanner;
public class Program12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks of first subject: ");
        int s1 = scanner.nextInt();
        System.out.print("Enter marks of second subject: ");
        int s2 = scanner.nextInt();
        System.out.print("Enter marks of third subject: ");
        int s3 = scanner.nextInt();
        System.out.print("Enter marks of fourth subject: ");
        int s4 = scanner.nextInt();
        System.out.print("Enter marks of fifth subject: ");
        int s5 = scanner.nextInt();
        System.out.print("Enter marks of sixth subject: ");
        int s6 = scanner.nextInt();
        System.out.print("Enter marks of seventh subject: ");
        int s7 = scanner.nextInt();
        int total = 700;
        int obtainedMarks = (s1+s2+s3+s4+s5+s6+s7)*100;
        float percentage = obtainedMarks/700;
        System.out.println("The percentage is: "+ percentage);
    }
}
