package collections.problems;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;

public class NumberSorting {



    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(10,2,5,15,23,19));
        Collections.sort(num, new Comparator<Integer>() {
            public int compare(Integer o1,Integer o2){
                if(o1>o2){
                    return 1;
                }
                return -1;
            }
        });

        for(int i:num){
            System.out.println(i);
        }
    }
}
