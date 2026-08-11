package foundations.problems;

import java.util.ArrayList;

public class GenericUtility<T> {
    GenericUtility(ArrayList<T> list){
        this.list=list;
    }
    private ArrayList<T> list = new ArrayList<>();
    void print(){
        for(T type:list){
            System.out.println(type);
        }
    }
    T firstElement(){
        return list.getFirst();
    }
    T lastELement(){
        return list.getLast();
    }
    boolean checkExist(T element){
        return list.contains(element);
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Java");
        names.add("Spring");
        names.add("PostgreSQL");

        GenericUtility<String> utility = new GenericUtility<>(names);

        utility.print();
        utility.firstElement();
        utility.lastELement();
        System.out.println(utility.checkExist("Java"));
    }
}
