package extras.LabFile;

public class MethodOverloading {
    MethodOverloading(){
        System.out.println("This is a constructor with no parameters.");
    }
    MethodOverloading(int x, int y){
        if(x>y){
            System.out.println(x+ " is greater than "+y);
        }else{
            System.out.println(y +" is greater than "+ x);
        }
    }
    public static void main(String[] args){
        MethodOverloading mol = new MethodOverloading();
        MethodOverloading mol2 = new MethodOverloading(3,5);
    }

}
