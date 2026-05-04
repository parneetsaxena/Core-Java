package extras.LabFile;

public class AreaRectangle {
    public static void main(String[] args){
        Area area = new Area();
        System.out.println("The area of rectangle is: "+area.Rect(23,3));
    }
}
class Area {
    int Rect(int length, int breadth) {
        return length * breadth;
    }
}