package Book_Pakage;

public class PaperBook extends Book {
    private Integer Quantity;

    public PaperBook(Integer quantity) {
        Quantity = quantity;
    }

    public PaperBook(Double price, String bookName, String publisher, Integer year, String ISBN, Integer quantity) {
        super(price, bookName, publisher, year, ISBN);
        Quantity = quantity;
    }
    public PaperBook(){}

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }
}
