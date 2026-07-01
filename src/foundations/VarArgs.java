// Varargs stands for variable arguments.
// It allows multiple values to be accepted as arguments without overloading the method.
// The syntax is: varType ... varName
// Java uses varArgs when it is unable to find a method for the number of arguments

package foundations;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        new Test().display(3,4,5,6,7);
        new Test().displayAlternate(4,2,4,6,1);
    }
}
class Test{
    public void display(int ... num){
        System.out.println(Arrays.toString(num));
    }
    public void displayAlternate(int ... num){
        for (int j : num) {
            System.out.println(j);
        }
    }
}
