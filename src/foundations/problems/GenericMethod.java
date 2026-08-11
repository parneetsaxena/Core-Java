package foundations.problems;

public class GenericMethod<T> {
   public static <T> void printArray(T[] arr){
        for(T i:arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Integer [] arr = {20,30,50,60,100};
        String [] arr1 = {"Hello","Hi","Hola","Bonjour"};
        Double[] prices = {10.5, 20.5, 30.5};
        Character[] letters = {'A', 'B', 'C'};
        printArray(arr);
        printArray(arr1);
        printArray(prices);
        printArray(letters);

    }
}
