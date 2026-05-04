package extras.LabFile;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.print("Enter a word to check if it is Palindrome or not: ");
        str = scanner.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? str + " is a palindrome" : str + " is not a palindrome");

    }
}