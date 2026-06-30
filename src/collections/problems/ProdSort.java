package collections.problems;
import java.util.*;
public class ProdSort {
    public static void main(String[] args) {
        List<Prod> prods = new ArrayList<>(Arrays.asList(
                new Prod("Laptop",70000,5),
                new Prod("Mobile",50000,5),
                new Prod("Tablet",60000,4),
                new Prod("Camera",50000,5)
        ));
        Collections.sort(prods);
        for(Prod p:prods){
            System.out.println(p.name+" "+p.price+" "+p.rating);
        }
    }
}
class Prod implements Comparable<Prod>{
    String name;
    int price;
    double rating;
    Prod(String name,int price,double rating){
        this.name=name;
        this.rating=rating;
        this.price=price;
    }
    public int compareTo(Prod p){
        if(this.rating!=p.rating){
            if(this.rating>p.rating){
                return -1;
            }return 1;
        }
        if(this.price!=p.price){
            if(this.price>p.price){
                return 1;
            }return -1;
        }
        return this.name.compareTo(p.name);
    }
}
