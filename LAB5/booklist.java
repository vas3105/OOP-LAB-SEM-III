import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int serialNo; 
    String title, author;

    public Book() {
        this.author = "";
        this.serialNo = 0;
        this.title = "";
    }

    public Book(String title, String author, int serialNo) {
        this.author = author;
        this.serialNo = serialNo;
        this.title = title;
    }

    public void display() {
        System.out.println(title + " :" + author + " :" + serialNo);
    }
}

public class booklist { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

      
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 2));
        books.add(new Book("1984", "George Orwell", 3));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 4));
        books.add(new Book("Moby Dick", "Herman Melville", 5));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 6));

        System.out.println("Enter the author's name: ");
        String authorName = sc.nextLine();

        boolean found = false;

        for (Book book : books) {
            if (book.author.equalsIgnoreCase(authorName)) {
                book.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Author not found.");
        }
    }
}
