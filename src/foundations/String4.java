package foundations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String4 {


    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        System.out.println("Your age is: "+ num);
    }
}
