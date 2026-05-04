package loops.patternPractice;

public class NumericalPyramid {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            // To print out the spaces
            for(int j = 1;j<=5-i;j++){
                System.out.print(" ");
            }
            // To print the numbers in normal order
            for(int k = 1;k<=i;k++){
                System.out.print(k);
            }
            // To print the numbers in reverse
            for(int l = i-1;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
