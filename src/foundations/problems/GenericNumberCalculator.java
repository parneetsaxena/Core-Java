package foundations.problems;

public class GenericNumberCalculator<T> {
    static<T extends Number> double calculator(T[] numbers){
        double sum = 0;

        for(T number:numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] num = {11,24,46};
        Double[] dob = {3.4,5.2,42.1};
        Float[] flo = {2.3f,5.5f,8.1f};

        System.out.println(calculator(num));
        System.out.println(calculator(dob));
        System.out.println(calculator(flo));
    }
}
