/*
Comparator is an interface used to compare between two values.
It is an interface and cannot be instantiated directly.
It allows custom sorting techniques. The user can manipulate the sorting process according to the needs

Method to use Comparator
- Either implement it with the class or use anonymous class
- Use Collections.sort() method
- The arguments in the method will be (collection, new Comparator<ClassName>(){});
- Create the compare method in the anonymous class
- The method will take two parameters
- Write the sorting logic
- The result will be sorted
 */






package collections;

import java.util.Comparator;
import java.util.*;
public class ComparatorDemo implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2){
            return -1;
        }

        return 1;
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(23);
        al.add(21);
        al.add(45);
        al.add(51);


        Comparator<Integer> comp = new ComparatorDemo();
        al.sort(comp);

        for(int i:al){
            System.out.println(i);
        }

    }
}
