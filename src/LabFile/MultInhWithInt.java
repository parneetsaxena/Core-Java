package LabFile;

public class MultInhWithInt implements Humans,Animals,Fishes{
    public void twoLegs(){
        System.out.println("Humans walk on two legs.");
    }
    public void fourLegs(){
        System.out.println("Animals walk on four legs.");
    }
    public void noLegs(){
        System.out.println("Fishes do not have legs.");
    }
    public static void main(String[] args){
        MultInhWithInt MIUI = new MultInhWithInt();
        MIUI.fourLegs();
        MIUI.twoLegs();
        MIUI.noLegs();
    }
}

