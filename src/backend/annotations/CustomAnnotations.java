/*
Annotations which do not have any variables inside it are known as marker annotations.
Annotations with single variable is known as single value annotation.


 */

package backend.annotations;


import java.lang.annotation.*;
import java.lang.*;


// These are meta annotations
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Placement{
    String course() default "none";
    String role() default "none";
}
@Placement(course = "AI & DS",role="Backend Developer")
class Student{
    String name;
    int year;
    Student(String name,int year){
        this.name=name;
        this.year=year;
    }
}

class Passouts extends Student{

    Passouts(String name, int year) {
        super(name, year);
    }
}
public class CustomAnnotations {
    public static void main(String[] args) {
        Student s = new Student("Parneet",4);
        Class c = s.getClass();
        Annotation an = c.getAnnotation(Placement.class);
        Placement p = (Placement)an;
        System.out.println(p.course());
    }
}

