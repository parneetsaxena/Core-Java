package foundations.problems;

import java.util.ArrayList;
import java.util.List;

public class GenericWildcard<T> {
    static<T> void printAll(List<? extends Number> list){
        for(Number ls:list){
            System.out.println(ls);
        }
    }

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(20);
        ls.add(53);
        ls.add(21);
        printAll(ls);

        List<String> str = new ArrayList<>();
        str.add("HI");
        str.add("HELLO");
        // Cannot use the method because String is not subclass of Number

    }
}
