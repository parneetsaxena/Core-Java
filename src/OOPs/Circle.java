package OOPs;
import java.util.Scanner;
public class Circle {
    private double radius;
    static final double pi = Math.PI;

    public void setRadius(double radius){
        if(radius<=0){
            System.out.println("Invalid radius!");
            return ;
        }
        this.radius = radius;
    }

    double circumference(){
        return 2*pi*radius;
    }
    double area(){
        return pi*radius*radius;
    }
    double diameter(){
        return 2*radius;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.print("Enter the radius: ");
        c1.setRadius(input.nextDouble());
        System.out.println(c1.area());
        System.out.println(c1.circumference());
        System.out.println(c1.diameter());
        for (String arg : args) {
            System.out.print(arg + " ");
            System.out.println();
        }
        System.exit(0);
    }
}
