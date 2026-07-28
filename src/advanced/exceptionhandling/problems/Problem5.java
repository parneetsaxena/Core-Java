package advanced.exceptionhandling.problems;

public class Problem5 {
    static int readAge(int age) throws Exception{
        if(age<0){
            throw new Exception("Age cannot be negative");
        }
        return age;
    }
    public static void main(String[] args) {
        try{

            System.out.println(readAge(-2));
        }catch (Exception e){
            System.out.println(e);
        }

    }
}


