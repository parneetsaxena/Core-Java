package collections.problems;
import java.util.*;
public class MovieSorting {
    public static void main(String[] args) {
        List<Movies> movies = new ArrayList<>(Arrays.asList(
                new Movies("Interstellar",2014,8.7),
                new Movies("Inception",2010,8.8),
                new Movies("Avatar",2009,8.7)
                ));
        Collections.sort(movies);
        for(Movies m:movies){
            System.out.println(m.title + " " + m.year+ " " + m.rating);
        }
    }
}
class Movies implements Comparable<Movies>{
    String title;
    int year;
    double rating;
    Movies(String title, int year, double rating){
        this.title=title;
        this.year=year;
        this.rating=rating;
    }
    public int compareTo(Movies m){
        if(this.rating!=m.rating){
            if(this.rating>m.rating){
                return -1;
            } return 1;
        }
        if(this.year>m.year){
            return -1;
        }
        return 1;
    }
}
