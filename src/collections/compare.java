package collections;
import java.util.*;
public class compare  {

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
