package extras.LabFile;

public class ExceptionHandling {
    public static void main(String[] args){
        int a = 54;
        int b = 0;
        try{
            int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("You cannot divide by zero.");
        }
    }
}
