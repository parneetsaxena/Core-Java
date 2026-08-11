package foundations;

import java.util.HashSet;

public class Generics<T> {
    T data ;

    public void display(){
        System.out.println(data.getClass().getName());
    }
    public static void main(String[] args) {
        Generics<Float> ex =  new Generics<>();
        ex.data = 34.5f;
        ex.display();

    }
}
class Test1<T extends Number>{
    public void check(HashSet<? extends T> obj){
        System.out.println("You are working with "+ obj.getClass().getName());
    }
    public static void main(String[] args) {
        Test1<Long> testing = new Test1<>();
        testing.check(new HashSet<>() );

    }
}

