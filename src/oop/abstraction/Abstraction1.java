/*
Interface is of three types
1). Marker Interface - An interface without any methods
2). SAM (Single Abstract Method) - Contains only a single method. Also called functional interface
3). Normal interface - This is the standard interface
 */


package oop.abstraction;

public class Abstraction1 {
    public static void main(String[] args) {
        Vehicle car = new Abstraction3(90);
        Vehicle bike = new Abstraction2(75);
        car.start();
        bike.start();
        car.stop();
        bike.stop();
        System.out.println(car.getFuelType());
        System.out.println(bike.getFuelType());
        car.honk();
        bike.honk();
        System.out.println(car.getSpeed());
        System.out.println(bike.getSpeed());

    }
}
