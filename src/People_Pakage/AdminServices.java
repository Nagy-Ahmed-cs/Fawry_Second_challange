package People_Pakage;

import Book_Pakage.Book;

import java.util.List;

public interface AdminServices {
    String addBook(List<Book>books);
    String deleteBook(List<Book>books);


}
