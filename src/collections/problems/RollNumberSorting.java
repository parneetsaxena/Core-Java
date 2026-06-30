package collections.problems;
import java.util.*;
public class RollNumberSorting {
    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>(Arrays.asList(
                new Student("Rahul",3),
                new Student("Aman",1),
                new Student("Karan",2)
        ));
        Collections.sort(stud);
        for(Student s:stud){
            System.out.println(s.name + " "+s.rollNumber);
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int rollNumber;
    Student(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }
    public int compareTo(Student s){
        if(this.rollNumber>s.rollNumber){
            return 1;
        }
        return -1;
    }
}
