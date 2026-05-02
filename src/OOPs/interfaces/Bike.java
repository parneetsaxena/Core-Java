package OOPs.interfaces;

public class Bike implements Vehicle{
    public void start(){
        System.out.println("The bike is now running");
    }
    public void stop(){
        System.out.println("The bike is stopped now");
    }
    public String getFuelType(){
        return "Petrol";
    }
    public void honk(){
        System.out.println("Beeep....Beeeeeeeeeeeeeeep...beepp");
    }

}
