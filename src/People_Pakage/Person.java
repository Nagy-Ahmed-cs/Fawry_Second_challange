package People_Pakage;

import Book_Pakage.Book;

import java.util.List;

public abstract class Person {
    private Integer personId;
    private String personName;
    private String personEmail;
    private String role;

    private String address;
    public Person(Integer personId, String personName, String personEmail, String role,String address) {
        this.personId = personId;
        this.personName = personName;
        this.personEmail = personEmail;
        this.role = role;
        this.address=address;
    }

    public Person() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public void showAllBooks(List<Book>books){
        for (Book book : books) {
            System.out.println("==============================");
            System.out.println("Title : " + book.getBookName());
            System.out.println("Author: " + book.getPublisher());
            System.out.println("Year  : " + book.getYear());
            System.out.println("Price : " + book.getPrice());
            System.out.println("ISBN  : " + book.getISBN());
            System.out.println("Type  : " + book.getClass().getSimpleName());

        }
        System.out.println("==============================");
    }
    public Book findBook(String name,List<Book>books){
        for(Book b:books){
            if(b.getBookName().equals(name)){
                return b;
            }
        }
        return  null;
    }
}
