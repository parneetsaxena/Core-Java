/*
collection is the concept.
Collection is an interface
Collections is a class



Generics are used in Collection in order to declare a type. Without using generics, instantiation using Collection can accept any type of data without any problem.
 */

package collections;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // This is using the Collection interface and creating an instantiation of the ArrayList class. The type of this variable is object.
        Collection list = new ArrayList(); // List Collection
        Collection set = new HashSet(); // Set Collection
        Collection map = new PriorityQueue(); // Queue Collection
        list.add(32);
        set.add(21);
        map.add(3);
        System.out.println(list+ " "+ set + " " + map);

        // The above example is valid but does not define a datatype and can store all types of value. We use generics to define a type
        Collection<Integer> age = new ArrayList<>();
        Collection<String> name = new HashSet<>();
        Collection<Boolean> isAdult = new PriorityQueue<>();
        age.add(20);// Only integer values are valid now
        name.add("Kofi");
        isAdult.add(true);
        System.out.println(name + " " + age + " "+isAdult);



    }
}
