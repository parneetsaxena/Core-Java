package collections.problems;

import java.util.*;
public class StudentMarksSystem {
    static int getMax(List<Integer> ls) {
        int max = ls.get(0);
        for (int i = 0;i<ls.size();i++) {
            if(ls.get(i)>max) {
                max = ls.get(i);
            }
        }
        return max;
    }
    static int getAverage(List<Integer> ls){
        int avg;
        int sum = 0;
        for(Integer i:ls){
            sum = sum+i;
        }
        avg = sum/ls.size();
        return avg;
    }
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(90);
        marks.add(88);
        marks.add(97);
        marks.add(76);
        marks.add(2,70);
        System.out.println(marks);
        int highest = getMax(marks);
        System.out.println("Highest marks are: "+highest);
        int avg = getAverage(marks);
        System.out.println("The average is: "+avg);


    }
}
