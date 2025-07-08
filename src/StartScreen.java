import Book_Pakage.Book;
import People_Pakage.Admin;
import People_Pakage.Client;

import java.util.List;
import java.util.Scanner;

public class StartScreen {
    public static  int  startSystem(){
        Scanner input=new Scanner(System.in);
        System.out.println("Our first screen here ......\n");
        int value;

        System.out.println("1- show books ");
        System.out.println("2- add book ");
        System.out.println("3- delete book ");
        System.out.println("4- buy book ");
        System.out.println("5- close app");
        System.out.println("\n\nEnter a suitable option : ");
        value=input.nextInt();
        return value;

    }
    public static void bookSystem(List<Book>books){
        Client client=new Client();
        Admin admin=new Admin();
        int number=startSystem();
        do{
            switch(number) {
                case 1:
                    client.showAllBooks(books);
                    bookSystem(books);
                    break;
                case 2:
                    admin.addBook(books);
                    bookSystem(books);
                    break;
                case 3:
                    System.out.println(admin.deleteBook(books));
                    bookSystem(books);
                    break;
                case 4:
                    System.out.println(client.buyBook(client, books));
                    bookSystem(books);
                    break;
                case 5:
                    break;
            }

            break;
        }while (number!=5);
        System.out.println("End our application here ....\n");


    }

}
