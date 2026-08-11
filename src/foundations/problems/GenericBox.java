package foundations.problems;

public class GenericBox<T> {
    T value;

    GenericBox(T value){
        this.value=value;
    }
    public void setValue(T value){
        this.value = value;
    }
    public void getValue(){
        System.out.println(value);
    }

    public static void main(String[] args) {
        GenericBox<Integer> gen= new GenericBox<>(4);
        gen.setValue(20);
        gen.getValue();

        GenericBox<String> str = new GenericBox<>("Hello");
        str.setValue("Hi");
        str.getValue();

        GenericBox<Double> dob = new GenericBox<>(20.3);
        dob.setValue(3.14);
        dob.getValue();
    }
}
