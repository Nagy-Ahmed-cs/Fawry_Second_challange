import Book_Pakage.Book;
import People_Pakage.BookDatabase;

import java.util.List;
import java.util.Scanner;

import static java.lang.Long.MAX_VALUE;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        List<Book>books=BookDatabase.loadBooks();
        StartScreen.bookSystem(books);

    }
}