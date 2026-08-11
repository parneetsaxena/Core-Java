/*
 Exception is a runtime event which disrupts the normal flow of execution. They can be caught or handled

 Exception class contains all the exceptions and Error class defines errors. Both classes extend a superclass named Throwable

Exceptions are of two types-
1. Checked Exception - These are compile time exceptions which are to be handled before the execution of program
2. Unchecked Exception - These are runtime exceptions which cannot be handled during runtime and are difficult to handle

 */


package advanced.exceptionhandling;

public class ExceptionIntro {
    public static void main(String[] args) {
        int a=4,b=9,c=0;
        try {
            int d = (a + b) / c;
        }catch (Exception e){
            System.out.println("Cannot divide by zero");
        }

        System.out.println(a+b+c);
    }
}
