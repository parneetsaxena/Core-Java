package LabFile;

public class ThisKeyword {
    int x;
    int y;
    int Sum(int x,int y){
        this.x=x;
        this.y=y;
        return x+y;
    }
    public static void main(String[] args){
        ThisKeyword ab = new ThisKeyword();
        System.out.println("The sum is: "+ ab.Sum(55,68));
    }

}
