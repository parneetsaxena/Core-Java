package collections.problems;
import java.util.*;
public class DuplicateNamesChecker {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Ravi");
        names.add("Rohit");
        names.add("Ravi");
        names.add("Virat");
        names.add("Shikhar");
        System.out.println(names);
    }
}
