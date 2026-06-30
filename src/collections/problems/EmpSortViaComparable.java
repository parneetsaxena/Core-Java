package collections.problems;
import java.util.*;
public class EmpSortViaComparable {
    public static void main(String[] args) {
        List<Employees> emp = new ArrayList<>(Arrays.asList(
                new Employees("Aman",50000),
                new Employees("Rahul",70000),
                new Employees("Karan",90000)
        ));
        Collections.sort(emp);
        for(Employees e:emp){
            System.out.println(e.name + " "+e.salary);
        }
    }
}
class Employees implements Comparable<Employees>{
    String name;
    int salary;
    Employees(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    public int compareTo(Employees e){
        if(this.salary>e.salary){
            return -1;
        }
        return 1;
    }
}
