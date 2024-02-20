import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("library UPB");

        Book b1 = new Book("EffectiveJava", "Joshua Black");
        Book b2 = new Book("Thinking in Java", "Bruce Russel");
        Book b3 = new Book("Java: The complete Reference", "Adam ");

        List<Book> book = new ArrayList<>();
        book.add(b1);
        book.add(b2);
        book.add(b3);

        Library library = new Library(book);

        List<Book> books = library.getBooksInLibrary();

        for (Book bk : books){
            System.out.println("Tittle: " + bk.title + " and Author: " + bk.author);
        }

    }
}