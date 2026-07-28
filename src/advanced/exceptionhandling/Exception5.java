/*
You can create custom exceptions in Java. It can follow any constraints that you create for your custom exception
 */

package advanced.exceptionhandling;

public class Exception5 {
    public static void main(String[] args) {
        int a = 9;
        try{
            if(a<10){
                throw new CustomException();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class CustomException extends Exception{

    public CustomException(){
        super();
    }
}
