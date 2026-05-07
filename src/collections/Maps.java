package collections;

import java.util.*;

public class Maps {
    public static void main(String[] args) {

        // HashMap
        Map<String , Integer> details = new HashMap<>();
        details.put("Parneet ", 20);
        System.out.println(details);

        // LinkedHashMap
        Map<String, Integer> course = new LinkedHashMap<>();
        course.put("B.Tech", 232351);
        System.out.println(course);

        //
        Map<Boolean, Double> fees = new TreeMap<>();
        fees.put(false, 50000.00);
        System.out.println(fees);
    }
}
