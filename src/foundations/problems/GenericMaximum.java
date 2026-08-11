package foundations.problems;

public class GenericMaximum<T> {
    public static <T extends Comparable<T>> T findMax(T[] array){
        T max = array[0];
            for(int i = 0;i<array.length;i++){
                    if(array[i].compareTo(max)>0){
                        max = array[i];
                }
            }
        return max;
    }

    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40};
        Double[] decimals = {3.5, 8.2, 1.4, 6.7};

        System.out.println(findMax(numbers));
        System.out.println(findMax(decimals));
    }
    }

