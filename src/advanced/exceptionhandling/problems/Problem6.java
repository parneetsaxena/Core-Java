package advanced.exceptionhandling.problems;

public class Problem6 {
    static int readAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("You are not eligible to vote.");
        }
        return age;
    }
    public static void main(String[] args) {
        try{
            System.out.println(readAge(15));
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}