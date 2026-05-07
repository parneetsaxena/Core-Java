// List is an ordered collection and keeps an indexing
/*ArrayList is used to store elements dynamically. It does not have a fixed size unlike array.

        If the number of elements is fixed, use arrays because they are faster and have a fixed size.
        If the number of elements is not fixed then use ArrayList or Collection because it can expand or shrink accordingly

 */
package collections;

import java.util.*;

public class Lists {
    public static void main(String[] args) {

        // ArrayList
        List<Integer> al = new ArrayList<>();
        al.add(200);
        al.add(12);
        al.add(0,4);
        System.out.println(al);

        // LinkedList
        List<Double> ll = new LinkedList<>();
        ll.add(6.022);
        ll.add(3.14);
        ll.add(9.8);
        System.out.println(ll);

        // Vector
        List<String> names = new Vector<>();
        names.add("Seth");
        names.add("Brock");
        names.add("John");
        System.out.println(names);

        // Iterators are used to fetch values
        Iterator<Integer> i = al.iterator();
        System.out.println(i.next());

        // Enhanced for loop to fetch values
        for( int m :al){
            System.out.println(m);
        }
    }
}
