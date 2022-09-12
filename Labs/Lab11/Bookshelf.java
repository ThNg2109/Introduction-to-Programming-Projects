package Labs.Lab11;

import java.util.ArrayList;

public class Bookshelf {
    /*
    class has two instance variables:
    *size(int): how many books on the bookshelf
    *books(arraylist of type book): contains the Book object
     */
    private int size;
    private ArrayList<Book> books;

    /*
    * default constructor sets the size to 2 and initializes the ArrayList
     */
    public Bookshelf(){
        size = 2;
        books = new ArrayList<Book>(size);
    }

    /*
    * parameterized constructor
    * reviews a single parameter for size and initializes the ArrayList
     */
    public Bookshelf(int size){
        this.size = size;
        this.books = new ArrayList<Book>(size);
    }

    /*
    * write a getter method for size instance variable
     */
    public int getSize(){
        return size;
    }

    /*
    * write a getter method for the books instance variable
     */
    public ArrayList<Book> getBooks(){
        return books;
    }

    /*
    * a void method addBook
    * takes a single book parameter and adds it to the books ArrayList
     */
    public void addBook(Book aBook) {
        if (books.size() < size) {
            books.add(aBook);
        }
    }

    /*
    *method removeBook
    * no parameters
    * removes the first book on the bookshelf(position 0)
    * if no books in the bookshelf, return null
     */
    public Book removeBook(){
        if(books.isEmpty()){
            return null;
        }
        else{
            return books.remove(0);
        }
    }

    /*
    * void method emptyBookshelf
    * takes no parameter
    * removes all the books from the shelf
     */
    public void emptyBookshelf(){
        books.clear();
    }
}
