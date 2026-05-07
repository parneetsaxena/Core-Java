package collections.problems;
import java.util.*;
public class FrequencyCounter {
    public static void main(String[] args) {
        String fruits[] = {"Apple","Mango","Apple","Mango","Banana","Apple"};
        Map<String,Integer> counter = new HashMap<>();
        for (String word : fruits) {
            if (counter.containsKey(word)) {
                counter.compute(word, (k, count) -> count + 1);
            } else {
                counter.put(word, 1);
            }
        }
        System.out.println(counter);
    }
}
