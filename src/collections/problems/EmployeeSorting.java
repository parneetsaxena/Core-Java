package collections.problems;
import java.util.*;
public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>(Arrays.asList(new Employee("Rahul","IT",70000)
                ,new Employee("Aman","HR",50000),
                new Employee("Karan","IT",60000),
                new Employee("Rahul","HR",70000),
                new Employee("Vikas","IT",70000)));
        Collections.sort(emp,new Comparator<Employee>(){
            public int compare(Employee e1,Employee e2) {
                if(e1.salary!=e2.salary){
                    if(e1.salary>e2.salary){
                        return -1;
                    }else return 1;
                }
                if(!e1.name.equals(e2.name)){
                    return e1.name.compareTo(e2.name);
                }
                return e1.department.compareTo(e2.department);
            }
        });

        for(Employee e:emp){
            System.out.println(e.name + " " + e.salary + " "+ e.department);
        }
    }
}
class Employee{
    String name;
    int salary;
    String department;
    Employee(String name, String department,int salary){
        this.name= name;
        this.department=department;
        this.salary =salary;
    }
}
