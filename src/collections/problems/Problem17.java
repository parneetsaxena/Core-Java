package collections.problems;
import java.util.*;
public class Problem17 {
    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>(Arrays.asList(
                new Student("Rahul",65),
                new Student("Aman",46),
                new Student("Karan",75)
        ));
        Collections.sort(stud);
        for(Student s:stud){
            System.out.println(s.name + " "+s.marks);
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int marks;
    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public int compareTo(Student s){
        if(this.marks>s.marks){
            return -1;
        }
        return 1;
    }
}
