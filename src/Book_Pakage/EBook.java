package Book_Pakage;

public class EBook extends Book {
    private String fileType;

    public EBook(String fileType) {
        this.fileType = fileType;
    }

    public EBook(Double price, String bookName, String publisher, Integer year, String ISBN, String fileType) {
        super(price, bookName, publisher, year, ISBN);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

}
