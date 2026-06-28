package collections.problems;
import java.util.*;
public class ObjectSorting {
    public static void main(String[] args) {
      List<Person> pers = new ArrayList<Person>();
      pers.add(new Person("Rohan",13));
      pers.add(new Person("Parneet",20));
      pers.add(new Person("Ramlal",20));


//       Sorting by age
//      Collections.sort(pers, new Comparator<Person>(){
//          public int compare(Person p1,Person p2){
//              if(p1.age>p2.age){
//                  return 1;
//              }
//              return -1;
//          }
//      });
//
//
//      // Sorting by name
//        Collections.sort(pers, new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return p1.name.compareTo(p2.name);
//            }
//        });
//

      // Multiple Sorting
        Collections.sort(pers, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if(p1.age>p2.age){
                    return 1;
                }
                if(p1.age==p2.age){
                    return p1.name.compareTo(p2.name);
                }
                return -1;
            }
        });
        for(Person p:pers){
          System.out.println(p.name +" "+ p.age);
      }

    }
}
class Person{
    String name;
    int age;
    Person(String name, int age){
        this.age = age;
        this.name = name;
    }
}
