package Labs.Lab11;

public class Book {
    /*
    * Class has two String instance variable: tittle, author
     */
    private String title;
    private String author;

    /*
    * default constructor sets title to "Test" and author to null
     */
    public Book(){
        this("Test", null);
    }

    /*
    * parameterized constructor receives a title and author
     */
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    /*
    getter and setter methods
     */
    public String getTitle(){
        return title;
    }
    public void setTitle(String aTitle){
        title = aTitle;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String anAuthor){
        author = anAuthor;
    }

    /*
    * method toString() returns a string with the book's information
    * the values are instance variable
    * use \" to have quote character in a string
     */
    public String toString(){
        return "\"" + title + "\" by " + author;
    }
}
