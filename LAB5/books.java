import java.util.*;
class book
{
    int serialno;
    String title,author;
   book(String t, String a,int sn)
   {
    this.author=a;
    this.serialno=sn;
    this.title=t;
   }
   public class books
   {
    public static void main(String[] args)
    {
         Scanner sc= new Scanner(System.in);
         ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 2));
        books.add(new Book("1984", "George Orwell", 3));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1));
        books.add(new Book("Moby Dick", "Herman Melville", 2));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 3));
    }
   }

}
