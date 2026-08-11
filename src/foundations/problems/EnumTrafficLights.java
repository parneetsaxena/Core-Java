package foundations.problems;


enum TrafficLight{
    RED,YELLOW,GREEN;
}
public class EnumTrafficLights {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;
        System.out.println("Current Light: "+light);
        TrafficLight[] lights = TrafficLight.values();
        for(TrafficLight li:lights){
            System.out.println(li);
        }
    }
}
