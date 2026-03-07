package loops.patternPractice;

public class Triangle {
    public static void main(String[] args) {
        for(int i = 0;i<=5;i++){
           for(int j = 0;j<=(2*i);j++){
               System.out.print('*');
           }


            System.out.println();
        }
//        for(int i = 0;i<=5;i++){
//            for(int k = 0;k<=(5-i)+1;k++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
        for(int i = 0;i<=5;i++){
            for(int l = 0;l<=2*(5-i);l++){
                System.out.print('*');
            }
            System.out.println();
        }


    }
}
