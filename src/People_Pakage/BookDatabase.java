package People_Pakage;

import Book_Pakage.Book;
import Book_Pakage.EBook;
import Book_Pakage.PaperBook;

import java.util.*;

public class BookDatabase {
    public static List<Book> books = new ArrayList<>();

    public static List<Book> loadBooks() {
        books.clear();

        books.add(new PaperBook(120.0, "Clean Code", "Robert C. Martin", 2008, "PB101", 15));
        books.add(new PaperBook(150.0, "Effective Java", "Joshua Bloch", 2017, "PB102", 10));

        books.add(new EBook(90.0, "Java Concurrency", "Mohamed Ahmed", 2010, "EB201", "pdf"));
        books.add(new EBook(110.0, "Spring in Action", "Nagy Ahmed", 2022, "EB202", "epub"));


       return books;
    }
}
