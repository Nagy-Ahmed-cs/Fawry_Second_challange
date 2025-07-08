package People_Pakage;

import Book_Pakage.Book;
import Book_Pakage.EBook;
import Book_Pakage.PaperBook;

import java.util.List;
import java.util.Scanner;

public class Admin extends Person implements AdminServices{

    private String position;

    public Admin(Integer personId, String personName, String personEmail, String role, String address, String position) {
        super(personId, personName, personEmail, role, address);
        this.position = position;
    }

    public Admin() {

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String addBook(List<Book>books) {
        Scanner input=new Scanner(System.in);

        System.out.println("What kind of book you want here (paper/ebook ) : ");
        String type=input.nextLine();
        switch (type){
            case "paper":
                System.out.println("Quantum book store: Enter Paper Book Details");

                System.out.print("Enter price: ");
                double price = input.nextDouble();
                input.nextLine();

                System.out.print("Enter book name: ");
                String bookName = input.nextLine();

                System.out.print("Enter publisher name: ");
                String publisher = input.nextLine();

                System.out.print("Enter publication year: ");
                int year = input.nextInt();
                input.nextLine();

                System.out.print("Enter ISBN: ");
                String isbn = input.nextLine();

                System.out.print("Enter quantity: ");
                int quantity = input.nextInt();
                PaperBook paperBook = new PaperBook(price, bookName, publisher, year, isbn, quantity);
                break;
            case "ebook":


                System.out.println("Quantum book store: Enter EBook Details");

                System.out.print("Enter price: ");
                double price1 = input.nextDouble();
                input.nextLine();

                System.out.print("Enter book name: ");
                String bookName1 = input.nextLine();

                System.out.print("Enter publisher name: ");
                String publisher1 = input.nextLine();

                System.out.print("Enter publication year: ");
                int year1 = input.nextInt();
                input.nextLine(); // consume newline

                System.out.print("Enter ISBN: ");
                String isbn1 = input.nextLine();

                System.out.print("Enter file type (e.g. pdf, epub): ");
                String fileType = input.nextLine();


                EBook ebook = new EBook(price1, bookName1, publisher1, year1, isbn1, fileType);
                break;
            default:
                System.out.println("Enter suitable type of books !!!!!");
                return "Not added because you do not choose a suitable type\n";
        }

        return "Book added successfully ";
    }

    @Override
    public String deleteBook(List<Book>books) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year you want to delete book made in it : ");
        Integer year=input.nextInt();
        for(Book b:books){
            if(b.getYear()<=year){
                books.remove(b);
                return "The books was deleted successfully \n";
            }
        }
        return "no books found in this year :) \n";
    }
}
