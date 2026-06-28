package collections.problems;
import java.util.*;
public class ProductSorting {
    public static void main(String[] args) {
        List<Product> prods = new ArrayList<>();
        prods.add(new Product("Dumbbells",400));
        prods.add(new Product("Headphones",800));
        prods.add(new Product("Sneaker",700));
        Collections.sort(prods,new Comparator<Product>(){
            public int compare(Product p1,Product p2){
                if(p1.price>p2.price){
                    return 1;
                }
                return -1;
            }
        });
        for(Product p:prods){
            System.out.println(p.name + " " + p.price);
        }
    }
}
class Product{
    String name;
    int price;
    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
}
