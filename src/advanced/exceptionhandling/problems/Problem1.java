package advanced.exceptionhandling.problems;

public class Problem1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
        }catch (Exception e){
            System.out.println("Cannot divide by zero");
        }
    }
}
