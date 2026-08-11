/*
throw are throws are keywords which are used during exception handling.

throw explicitly throws an exception for an outcome which might be invalid

throws, on the other hand, declares the exception and is often handled by the method which called it
 */

package advanced.exceptionhandling;

import java.util.Scanner;

public class ThrowAndThrows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b = 0;
        a = 20;
        System.out.println("Enter value for b: ");


        try {
            b = scanner.nextInt();
            
            if(b==0){
                throw new ArithmeticException();
            }
            System.out.println("sum is: "+(a+b));

        }   catch (Exception e){
            System.out.println("Zero is not allowed");
        }

    }
}
