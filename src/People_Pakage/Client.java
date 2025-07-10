package People_Pakage;

import Book_Pakage.Book;

import java.util.List;
import java.util.Scanner;

public class Client extends Person implements ClientServices {


    private Double totalMoney;


    public Client() {
    }

    public Client(Integer personId, String personName, String personEmail, String role, String address, Double totalMoney) {
        super(personId, personName, personEmail, role, address);
        this.totalMoney = totalMoney;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String buyBook(Client client,List<Book>books) {


        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to buy screen hello ");
        System.out.println("Enter book name : ");
        String bookName =input.nextLine();
        Book book=this.findBook(bookName,books);
        if(book!=null){
            System.out.println("The book is here ");
            System.out.println("Enter type of payment (cash / visa ) : ");
            String payment=input.nextLine().trim();
            if(payment.equalsIgnoreCase("cash")){
                return "The process completed , congrats";
            }
            else if(payment.equalsIgnoreCase("visa")){
                if(book.getPrice()>client.getTotalMoney()){
                    return "Not enough money you have :( \n";
                }
                else {
                    client.setTotalMoney(client.getTotalMoney()-book.getPrice());
                    return "Completed :) \n";
                }


            }
            else {
                return "Not suitable of payment method :(\n";
            }
        }else {
            return "The process is not completed because the book is not here ...\n";
        }


    }
}
