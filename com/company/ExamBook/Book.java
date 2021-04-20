package ExamBook;

public class Book {
    private String bookName;
    private String Author;
    private String type;
    private String ISBN;

    public Book(String bookName, String author, String type, String ISBN) {
        this.bookName = bookName;
        Author = author;
        this.type = type;
        this.ISBN = ISBN;
    }




    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public String getType() {

        return type;
    }

    public String getISBN() {
        return ISBN;
    }

    public void printBook() {
        System.out.println("Book Title is" + bookName + "Author" + Author + "The book Type is" + type);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {

            return ISBN.equals(((Book) obj).getISBN());

        }
        else return false;
    }
}
