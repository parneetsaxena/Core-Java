package advanced.reflectionAPI;

import java.lang.reflect.Method;

public class AccessPrivateMethods {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("advanced.reflectionAPI.Test");
        Test t =(Test) c.getDeclaredConstructor().newInstance();

        Method m = c.getDeclaredMethod("privateMethod",int.class,int.class); // takes parameters for the methods if any and null if none
        m.setAccessible(true);
        m.invoke(t,20,40); // Takes arguments for the methods if any are present and null if none

    }
}
