/*
Comparator is used to compare between two values.
It is an interface and cannot be instantiated directly.
It allows custom sorting techniques. The user can manipulate the sorting process according to the needs
 */






package collections;

import java.util.Comparator;
import java.util.*;
public class Comparators implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2){
            return 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(23);
        al.add(21);
        al.add(45);
        al.add(51);


        Comparator<Integer> comp = new Comparators();
        al.sort(comp);

        for(int i:al){
            System.out.println(i);
        }

    }
}
