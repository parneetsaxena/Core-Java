package basics.problems;
import java.util.Random;
import java.util.Scanner;
public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("The dice rolls "+ random.nextInt(1,7)+ " for you..");
    }
}
