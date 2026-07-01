package foundations.loops.patterns;

public class OneTwoPattern {
    public static void main(String[] args) {
        for(int i =1;i<=6;i++){
            for(int j = 1;j<=7;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}
