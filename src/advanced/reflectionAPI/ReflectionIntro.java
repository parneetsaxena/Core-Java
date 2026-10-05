package advanced.reflectionAPI;

public class ReflectionIntro {
    public static void main(String[] args) throws Exception {
      Class<?> c = Class.forName("advanced.reflectionAPI.Test");
      Test t = (Test) c.getDeclaredConstructor().newInstance();
      t.show();
    }
}
class Test{
     void show(){
        System.out.println("Test is displaying");
    }

    private void privateMethod(int a,int b){
        System.out.println("Private method is now running"+ " "+a+b);
    }
}