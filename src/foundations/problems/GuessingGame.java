package foundations.problems;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int num = 0;
        int count = 0;
        int guess = random.nextInt(0,100);
        while(true){
            System.out.print("What number am I thinking of? (0-100): ");
            num = input.nextInt();
            if(guess>num){
                System.out.println("Higher!!");
                count++;
            }else if(guess<num){
                System.out.println("Lower!!");
                count++;
            }else if(num==guess){
                count++;
                System.out.print("You guessed it right. Congratulations\n");
                System.out.println("Took you " +count+ " times to guess");
                break;
            }
        }
    }
}
