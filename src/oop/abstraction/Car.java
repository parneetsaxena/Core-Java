package oop.abstraction;

public class Car implements Vehicle {
    private final int speed;

    Car(int speed){
        this.speed = speed;
    }
    public void start()
    {
        System.out.println("The car is now running");

    }

    public void stop()
    {
        System.out.println("The car is now stopped");

    }
    public String getFuelType()
    {
        return "Diesel";

    }

    public void honk()
    {
        System.out.println("Piiiiiiiiiiiiiiii... pi.pi.piipii");

    }

    public int getSpeed()
    {
        return speed;
    }
}
