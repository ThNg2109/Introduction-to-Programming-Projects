package Labs.Lab12;

public class IDCard extends Card{
    //instance variable type int idNumber
    private int idNumber;
    //default constructor
    public IDCard(){
        super("Jane Smith");
        idNumber = 0;
    }
    //parameterized constructor
    public IDCard(String aName, int anIdNumber){
        super(aName);
        this.idNumber = anIdNumber;
    }
    //toString() method
    public String toString(){
        return super.toString() + " ID Number: " + idNumber;
    }
}
