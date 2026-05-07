package collections.problems;
import java.util.*;
public class Phonebook {
    public static void main(String[] args) {
        Map<String,Integer> contact = new HashMap<>();
        contact.put("Shyam",78910);
        contact.put("Radhe",89435);
        contact.put("Nimoda",95256);
        System.out.println(contact.get("Shyam"));
        System.out.println(contact.values());
        System.out.println(contact.keySet());
    }
}
