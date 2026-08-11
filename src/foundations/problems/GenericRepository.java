package foundations.problems;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericRepository<T>{
    final private ArrayList<T> list = new ArrayList<>();

    void add(T object){
        list.add(object);
    }
    void remove(T object){
         list.remove(object);
    }
    T get(int index){

       return list.get(index);
    }
    void getAll(){
         for(T type: list){
             System.out.println(type);
         }
    }
    int size(){
         return list.size();
    }

    public static void main(String[] args) {
        GenericRepository<String> str = new GenericRepository<>();
        str.add("Whoosh");
        str.add("boom");
        str.remove("boom");
        str.getAll();
        System.out.println(str.get(0));
        System.out.println(str.size());
        System.out.println();


        GenericRepository<Integer> ints = new GenericRepository<>();
        ints.add(20);
        ints.add(45);
        ints.add(14);
        ints.remove(20);
        System.out.println(ints.get(1));
        ints.getAll();
        System.out.println(ints.size());
    }
}
