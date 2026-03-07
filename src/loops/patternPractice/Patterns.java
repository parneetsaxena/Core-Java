package loops.patternPractice;

// 2*i = Prints normal right angle triangle
// rows - i = Prints inverted right angle triangle
// 2 * rows = irrelevant (prints rectangle)

public class Patterns {

    static void rightAngleTriangle(int rows){
        for(int i = 1;i<=rows;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void invertedRightAngleTriangle(int rows){
        for(int i=1;i<=rows;i++){
            for(int j = 1;j<=(rows-i);j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pyramid(int rows){
        for(int i = 1;i<=rows;i++){
            // for spacing
            for(int j = 1;j<=rows-i;j++){
                System.out.print(" ");
            }
            // for stars
            for(int k = 1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void invertedPyramid(int rows){
        for(int i = 1;i<=rows;i++){
            // for spacing
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            // for stars
            for(int k = 1;k<=(rows-i);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void diamond(int rows){
        pyramid(rows);
        invertedPyramid(rows);
    }

    static void hourglass(int rows){
        invertedPyramid(rows);
        pyramid(rows);
    }

    public static void main(String[] args) {
        rightAngleTriangle(5);
        invertedRightAngleTriangle(5);
        System.out.println();
        pyramid(5);
        invertedPyramid(5);
        System.out.println();
        diamond(10);
        System.out.println();
        hourglass(10);
    }
}
