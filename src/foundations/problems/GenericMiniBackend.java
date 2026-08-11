package foundations.problems;

public class GenericMiniBackend {
    public static void main(String[] args) {
        User user = new User("Parneet");
        Response<User> userResponse = new Response<>();
        userResponse.statusCode = 200;
        userResponse.message = "User created successfully";
        userResponse.data = user;
        userResponse.printResponse();
    }
}

class Response<T>{
     int statusCode;
     String message;
    T data;
     void printResponse(){
         System.out.println("Status code: "+statusCode);
         System.out.println("Message: "+message);
         System.out.println("Data: "+data);
     }
}

class User{
    String name;

    User(String name){
        this.name=name;
    }
}



