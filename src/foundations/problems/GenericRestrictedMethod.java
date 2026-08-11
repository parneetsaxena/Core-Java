package foundations.problems;

public class GenericRestrictedMethod<T> {
    static<T extends Number> double getAverage(T[] nums) {
        double average = 0;
        double sum = 0;
        double size = 0;
        for (T type : nums) {
            sum += type.doubleValue();
            size = nums.length;
        }
        average = sum / size;

        return average;
    }

    public static void main(String[] args) {
        Integer[] ints = {29,12,45,32,23};
        System.out.println(getAverage(ints));



    }
}
