// StringBuffer and StringBuilder provides mutability for Strings which is not possible with String in general. String is immutable and they allow the strings to be modified even after its creation.
// The main difference between StringBuffer and StringBuilder is that StringBuffer is thread-safe and therefore slower, while StringBuilder is not thread-safe.
package foundations;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sher");
        sb.append(" Cheetah");
        System.out.println(sb);
    }
}
