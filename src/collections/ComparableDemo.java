/*
Comparable is an interface which sorts inside the class.
Only one parameter is provided.
The method is implemented inside the class
compareTo method is used to sort.
The method compares the current instance with the parametric instance using this keyword.


Method to work with comparable
- implement it with the class (implements Comparable<ClassName>)
- create the method compareTo(ClassName cn)
- write the logic for the specified sorting
- Use Collections.sort() in the main method
- The result will be sorted using the specified Comparable.
 */


package collections;
import java.util.*;
public class ComparableDemo {

    public static void main(String[] args) {
        List<Students> stud = new ArrayList<>();
        stud.add(new Students("Parneet",99));
        stud.add(new Students("Shikhar",45));
        stud.add(new Students("Rohit",56));
        stud.add(new Students("Virat",87));


        Collections.sort(stud);
        for(Students s:stud){
            System.out.println(s.name + " "+ s.marks);
        }
    }


}
class Students implements Comparable<Students>{
    String name;
    int marks;
    Students(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public int compareTo(Students s){
        if(this.marks>s.marks){
            return -1;
        }
        return 1;
    }
}
