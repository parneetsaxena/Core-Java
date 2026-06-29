package collections.problems;
import java.util.*;
public class ProductRanking {
    public static void main(String[] args) {
        List<Products> prods = new ArrayList<>(Arrays.asList(
                new Products("Laptop","Electronics",4.5,1200,70000),
                new Products("Mobile","Electronics",4.8,800,50000),
                new Products("Tablet","Electronics",4.8,1500,60000),
                new Products("Shoes","Fashion",4.5,3000,5000),
                new Products("Jacket","Fashion",4.5,1000,3000),
                new Products("Watch","Fashion",4.8,500,10000)
                ));
        Collections.sort(prods, new Comparator<Products>() {
            @Override
            public int compare(Products p1, Products p2) {
               if(p1.rating!=p2.rating){
                   if(p1.rating>p2.rating){
                       return -1;
                   }else return 1;
               }
               if(p1.reviews!=p2.reviews){
                   if(p1.reviews>p2.reviews){
                       return -1;
                   }else return 1;
               }
               if(p1.price!=p2.price){
                   if(p1.price<p2.price){
                       return -1;
                   }else return 1;
               }
               return p1.name.compareTo(p2.name);
            }
        });
        for(Products p:prods){
            System.out.println(p.name + " " + p.category + " " + p.rating + " " +p.reviews + " "+p.price);
        }
    }

}
class Products{
    String name;
    String category;
    double rating;
    int reviews;
    double price;
    Products(String name,String category,double rating,int reviews,double price){
        this.name=name;
        this.price=price;
        this.rating=rating;
        this.category=category;
        this.reviews=reviews;
    }
}
