package foundations;

public class Strings {
    public static void main(String[] args) {
        String name = "Parneet Saxena";
        int length = name.length(); // Gives the length of the string
        char letter = name.charAt(0); // Returns the character at the given index
        int first = name.indexOf('P'); // Returns the first index of the given character
        int lastIndex = name.lastIndexOf('a'); // Returns the last index of the given character
        int hell = name.hashCode();

        System.out.println(hell);
    }
}
