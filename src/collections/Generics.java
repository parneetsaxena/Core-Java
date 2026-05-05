package collections;

import java.util.HashSet;

public class Generics<T> {
    T data ;

    public void display(){
        this.data = data;
        System.out.println(data.getClass().getName());
    }
    public static void main(String[] args) {
        Generics<Float> ex =  new Generics<>();
        ex.data = 34.5f;
        ex.display();

    }
}
class Test<T extends Number>{
    public void check(HashSet<? extends T> obj){
        System.out.println("You are working with "+ obj.getClass().getName());
    }
    public static void main(String[] args) {
        Test<Long> testing = new Test<>();
        testing.check(new HashSet<>() );

    }
}

