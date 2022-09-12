package Labs.Lab11;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Lab11 {
    public static void main(String[] args){
        //create 3 objects of the class Book
        Book book1 = new Book("Twilight", "Stephenie Meyer");
        Book book2 = new Book("Moby-Dick", "Herman Melville");
        Book book3 = new Book("Bridgerton", "Julia Quinn");

        //use toString() to output each Book object
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        //create one Bookshelf object then add 3 book objects
        Bookshelf aBookShelf = new Bookshelf(3);
        aBookShelf.addBook(book1);
        aBookShelf.addBook(book2);
        aBookShelf.addBook(book3);

        //display the contents of the bookshelf using for loop
        ArrayList<Book> bookShelf = aBookShelf.getBooks();
        for(int i = 0; i < bookShelf.size(); i++) {
            System.out.println(bookShelf.get(i).toString());
        }

        //empty the bookshelf and display the contents again
        aBookShelf.emptyBookshelf();
        bookShelf = aBookShelf.getBooks();
        for(int i = 0; i < bookShelf.size(); i++) {
            System.out.println(bookShelf.get(i).toString());
        }
    }
}
