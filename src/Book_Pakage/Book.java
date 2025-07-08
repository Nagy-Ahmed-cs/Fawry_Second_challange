package Book_Pakage;

public abstract  class Book {
    private Double price;
    private String bookName;
    private String publisher;

    private Integer year;
    private String ISBN;
    public Book(){}
    public Book(Double price, String bookName, String publisher,Integer year,String ISBN) {
        this.price = price;
        this.bookName = bookName;
        this.publisher = publisher;
        this.year=year;
        this.ISBN=ISBN;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
