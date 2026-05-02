package OOPs.interfaces;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.start();
        bike.start();
        car.stop();
        bike.stop();
        System.out.println(car.getFuelType());
        System.out.println(bike.getFuelType());
        car.honk();
        bike.honk();
    }
}
