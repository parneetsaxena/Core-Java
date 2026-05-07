package collections.problems;
import java.util.*;
public class MovieWatchlist {
    static void addMovie(List<String> arr, String name){
      arr.add(name);
    }
    static void removeMovie(List<String> arr, int index){
        arr.remove(index);
    }
    static void showMovies(List<String> arr){
        for(String i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        List<String> movies = new ArrayList<>();
        addMovie(movies,"Tenet");
        addMovie(movies,"Interstellar");
        showMovies(movies);
    }
}
