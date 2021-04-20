package ExamBook;

public class Author {
    String authorName;
    String bookTitle;
    Book[] books;

    public Author(String authorName, String bookTitle, Book[] books) {
        this.authorName = authorName;
        this.bookTitle = bookTitle;
        this.books = books;
    }

    public Book getBook(String name) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookName().equals(name)) ;
            {
                return books[i];
            }
        }
        return null;

    }
}


