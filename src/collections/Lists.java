// List is an ordered collection and keeps an indexing
/*ArrayList is used to store elements dynamically. It does not have a fixed size unlike array.

        If the number of elements is fixed, use arrays because they are faster and have a fixed size.
        If the number of elements is not fixed then use ArrayList or Collection because it can expand or shrink accordingly


Vector vs ArrayList:

Vector wastes a lot of memory because it increases the size by 100% whereas ArrayList increases the size with 50%
Vector is thread safe because every method is synchronized whereas ArrayList is not.
ArrayList is faster than vector. You usually work with ArrayList unless Vector is specifically mentioned.


LinkedList vs ArrayList:

ArrayList uses dynamic arrays whereas LinkedList uses doubly linked list
ArrayList is a bit slower while inserting values in between because of index maintenance whereas LinkedList is faster
ArrayList is faster in searching than LinkedList

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
        ll.clear();
        System.out.println(ll);

        // Vector = The size keeps increasing by 100%. It is resizable. The default size is 10
        List<String> names = new Vector<>();
        names.add("Seth");
        names.add("Brock");
        names.add("John");
        System.out.println(names);

        // Iterators are used to fetch values
        Iterator<Integer> i = al.iterator();
        System.out.println(i.next());

        // Enhanced for loop to fetch values
        Collections.sort(al);
        for( int m :al){
            System.out.println(m);
        }
        for(double k:ll){
            System.out.println(k);
        }
        for(String s:names){
            System.out.println(s);
        }


    }
}
