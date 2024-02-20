import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private final List<Book> books; //valor inmutable

    public Library (List<Book> books){
        this.books = books;
    }

    public List<Book> getBooksInLibrary(){
        return books;
    }

}
