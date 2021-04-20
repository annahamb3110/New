package ExamBook;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("15amya navapet", "Jule vern", "Action","0201914670");
        Book book2 = new Book("Anna Karenina", "lev Tosltoy", "Drama","02werwr914670");
     /*   Book book3 = new Book("Spanvac Aghavni", "Nar-Dos", "Drama");
        Book book4 = new Book("Xorhrdavor kxzi", "Jule Vern", "Action");
        Book book5 = new Book("Aranc yntaniqi", "Hektor Malo", "Drama");*/

        Author author1 = new Author("Jule Vern", "15 Amya navapet", new Book[]{book1, book2});
        Author author2 = new Author("Lev Tolstoy", "Do nebes", new Book[]{book2});

        String checkName = "xorhrdavor kxzi";

       Book bk = author2.getBook(checkName);

        if (bk != null)
        {
          book1.printBook();
        }
        else
        {
            System.out.println("There is no Author with this book");
        }

        if (book1.equals(book2)) {
            System.out.println("objects are equal");
        } else {
            System.out.println("objects are not equal");
        }


    }
}
