package People_Pakage;

import Book_Pakage.Book;

import java.util.List;

public interface ClientServices {
    String buyBook(Client client, List<Book>books);
}
