package OOPs.interfaces;

public class Car implements Vehicle {
    public void start(){
        System.out.println("The car is now running");
    }
    public void stop(){
        System.out.println("The car is now stopped");

    }
    public String getFuelType(){
        return "Diesel";
    }
    public void honk(){
        System.out.println("Piiiiiiiiiiiiiiii... pi.pi.piipii");
    }
}
