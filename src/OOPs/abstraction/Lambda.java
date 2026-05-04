package OOPs.abstraction;

public class Lambda {
    public static void main(String[] args) {
        // This method is called lambda expression
        Subtractable obj = () -> {
            System.out.println("Subtracts...");
        };
        obj.subtract();
    }
}
