package oop.abstraction;

public class Bike implements Vehicle{
    private final int speed;

    Bike(int speed){
        this.speed = speed;
    }

    public void start()
    {
        System.out.println("The bike is now running");

    }
    public void stop()
    {
        System.out.println("The bike is stopped now");
    }
    public String getFuelType()
    {
        return "Petrol";
    }
    public void honk()
    {
        System.out.println("Beeep....Beeeeeeeeeeeeeeep...beepp");
    }
    public int getSpeed()
    {
        return speed;
    }

}
