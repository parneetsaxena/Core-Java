/*
 Strings are immutable and does not work with concat method.
 String with same values refer to the same object in the String Pool

 If a string contains spaces inside it, it is an empty string, but it is not blank

 When using index range, the starting point is generally included and the ending point is often excluded.

'delete' method takes index range as arguments (start, end(excluded))
'replace' method also takes index range as arguments (start, end(excluded), replace_with)

intern() method returns the reference of the Pooled String. For example, if "Hello" is in String Pool and you create another string in heap. Intern method allows you to reference to the String Pool.

equals() checks the values whereas == checks the reference.

 */


package foundations;

public class String3 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1==s2); // Reference is same
        System.out.println(s2==s3); // Reference is different because a new object is created
        System.out.println(s1==s3); // Same as previous
        System.out.println(s1.equals(s2));


        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println(sb.equals(s1));

        String s = "  Hello     ";
        System.out.println(s.isBlank());
        String trimmed = s.trim();
        System.out.println(trimmed);


        System.out.println(s1.toUpperCase());
    }
}
