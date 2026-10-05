package foundations;

import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {


    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number: ");
        java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        System.out.println("Your age is: "+ num);
    }
}
