/*
Any variables created in an interface are automatically constants.
Enum allows the user to create custom ranges
We can create enum inside or outside the class but not in the main method.
enum can have variables and methods inside it.
Every enum extends an abstract class called Enum
enums can't extend any classes because it already extends the class Enum
enums can implement interfaces.

Internally, the compiler creates a class of the same name as enum and initializes static final instantiation of the class.
 */
package foundations;

import java.util.Random;



enum Laptop{
    ASUS(4050),ACER,LENOVO(2050),HP(3050);
    final int graphics;
    Laptop(int g){
        graphics = g;
    }
    Laptop(){
        graphics = 2050;
        System.out.println("Non-Parametrized constructor running");
    }


}
public class enums {
    public static void main(String[] args) {
        Laptop l = Laptop.HP;
        System.out.println(l.graphics);
        Laptop[] lap = Laptop.values();
        for(Laptop laps:lap){
            System.out.println(laps);
        }
    }
}

