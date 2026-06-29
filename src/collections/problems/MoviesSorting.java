package collections.problems;
import java.util.*;
public class MoviesSorting {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>(Arrays.asList(
                new Movie("Interstellar","Sci-Fi",2014,8.8),
                new Movie("Inception","Sci-Fi",2010,8.8),
                new Movie("500 Days of Summer","Romance",2009,7.6),
                new Movie("Predestination","Sci-Fi",2014,8.8),
                new Movie("The Notebook","Romance",2004,7.9)
        ));
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1,Movie m2){
                if(m1.rating!=m2.rating){
                    if(m1.rating>m2.rating){
                        return -1;
                    }else return 1;
                }
                if(m1.year!=m2.year){
                    if(m1.year>m2.year){
                        return -1;
                    }else return 1;
                }
                return m1.title.compareTo(m2.title);
            }
        });

        for(Movie m:movies){
            System.out.println(m.title + " "+ m.genre+ " "+m.rating + " "+m.year);
        }
    }
}
class Movie{
    String title;
    String genre;
    int year;
    double rating;
    Movie(String title, String genre, int year, double rating){
        this.title=title;
        this.genre=genre;
        this.year=year;
        this.rating=rating;
    }
}
