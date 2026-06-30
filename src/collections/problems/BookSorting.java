package collections.problems;
import java.util.*;
public class BookSorting {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book("Harry Potter",500),
                new Book("Atomic Habits",300),
                new Book("Clean Code",450)
        ));
        Collections.sort(books);
        for(Book b:books){
            System.out.println(b.name + " "+ b.pages);
        }
    }
}
class Book implements Comparable<Book>{
    String name;
    int pages;
    Book(String name,int pages){
        this.name=name;
        this.pages=pages;
    }
    public int compareTo(Book b){
        if(this.pages>b.pages){
            return -1;
        }
        return 1;
    }
}
