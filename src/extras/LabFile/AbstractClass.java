package extras.LabFile;

public abstract class AbstractClass {
    abstract void programming();

    public static void main(String[] args){
        AbstractClass a1 = new C();

        a1.programming();
        AbstractClass a2 = new Java();
        a2.programming();

    }
}
class C extends AbstractClass{
    void programming(){
        System.out.println("C does not have any Objects and classes");
    }

}
class Java extends AbstractClass{
    void programming(){
        System.out.println("Java is purely Object-Oriented Language.");
    }
}

