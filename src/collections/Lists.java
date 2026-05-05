// List is an ordered collection and keeps an indexing
/*ArrayList is used to store elements dynamically. It does not have a fixed size unlike array.

        If the number of elements is fixed, use arrays because they are faster and have a fixed size.
        If the number of elements is not fixed then use ArrayList or Collection because it can expand or shrink accordingly

 */
package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

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

        List<String> names = new Vector<>();
        names.add("Seth");
        names.add("Brock");
        names.add("John");
        System.out.println(names);
    }
}
