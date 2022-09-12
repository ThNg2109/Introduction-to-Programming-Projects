package Labs.Lab12;

public class Card {
    //one instance variable
    private String name;
    //default constructor set name to empty String
    public Card(){
        this.name = "";
    }
    //parameterized constructor set name to given parameter
    public Card(String aName){
        this.name = aName;
    }
    //toString() method
    public String toString(){
        return "Card Holder: " + name;
    }
}
