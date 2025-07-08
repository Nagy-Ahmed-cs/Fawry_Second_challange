import Book_Pakage.Book;

import java.util.List;
import java.util.Scanner;

public class StartScreen {
    public static  int  startSystem(List<Book>books){
        Scanner input=new Scanner(System.in);
        System.out.println("Our first screen here ......\n");
        int value;
        do{
            System.out.println("1- show books ");
            System.out.println("2- add book ");
            System.out.println("3- delete book ");
            System.out.println("4- buy book ");
            System.out.println("5- close app");
            System.out.println("\n\nEnter a suitable option : ");
            value=input.nextInt();
        }while(value!=5);
        return value;
        
    }

}
