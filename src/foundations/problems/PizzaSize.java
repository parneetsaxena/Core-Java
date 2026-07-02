package foundations.problems;


public class PizzaSize {
    enum Size{
        SMALL(199),
        MEDIUM(399),
        LARGE(599);
        int price;
        Size(int p){
            price = p;
        }
        public int getPrice(){
            return price;
        }
    }

    public static void main(String[] args) {
        Size s = Size.LARGE;
        System.out.println("Selected Size: "+s);
        System.out.println("Price: "+s.getPrice());
    }
}
