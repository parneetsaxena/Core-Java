// The following code will print a numerical right-angled triangle

package foundations.loops.patterns;

public class NumericalPattern1 {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
