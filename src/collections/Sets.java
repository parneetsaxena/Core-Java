// Set is a collection with unique elements. No duplicates are allowed and it does not maintain an insertion order by default

package collections;
import java.util.*;

public class Sets {
    public static void main(String[] args) {
        // HashSet
        Set<Integer> age = new HashSet<>();
        age.add(19);
        age.add(30);
        age.add(55);
        System.out.println(age);

        // LinkedHashSet
        Set<String> names = new LinkedHashSet<>();
        names.add("Randy");
        names.add("Kurt");
        names.add("Shawn");
        System.out.println(names);

        // TreeSet
        Set<Integer> marks = new TreeSet<>();
        marks.add(26);
        marks.add(10);
        marks.add(15);
        System.out.println(marks);
    }
}
