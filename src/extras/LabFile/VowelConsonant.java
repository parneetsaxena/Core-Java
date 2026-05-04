package extras.LabFile;
import java.util.Scanner;
public class VowelConsonant {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char letter;
            System.out.print("Enter a letter: ");
            letter = scanner.next().charAt(0);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        }
    }


