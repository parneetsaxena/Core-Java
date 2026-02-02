package PracticePrograms;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Formulas f1 = new Formulas();
        double area = f1.areaRectangle(3,4);
        System.out.println(area);
        scanner.close();
    }
}
class Formulas{
    double areaRectangle(double length,double breadth){
        return length*breadth;
    }
}