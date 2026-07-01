/*
Annotations are used to describe the situation of the program.
Example - @Override annotation indicates that the method with this annotation is overriding another method.

@SuppressedWarnings is another annotations which is used to suppress any warning given by the compiler
@Deprecated is used to indicate that it should not be used even though it is available
 */

package backend.annotations;

public class IntroToAnnotations {
    public static void main(String[] args) {
        AnnotB obj = new AnnotB();
        obj.test();
    }
}

class AnnotA{

    public void test(){
        System.out.println("Method in A");
    }
}
class AnnotB extends AnnotA{
    @Override
    public void test(){
        System.out.println("Method in B");
    }
}
