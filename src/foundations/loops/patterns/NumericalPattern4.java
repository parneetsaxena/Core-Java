// This program will print a rectangle with only 1 & 2.

package foundations.loops.patterns;

public class NumericalPattern4 {
    public static void main(String[] args) {
        for(int i =1;i<=4;i++){
            for(int j = 1;j<=8;j++){
                if((i+j)%2==0){
                    System.out.print(" "+1+" ");
                }else{
                    System.out.print(" "+2+" ");
                }
            }
            System.out.println();
        }
    }
}
