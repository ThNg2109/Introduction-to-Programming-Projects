package Labs.Lab12;

public class DebitCard extends Card{
    //two instance variables type int, cardNumber and pin
    private int cardNumber;
    private int pin;
    //default constructor
    public DebitCard(){
        super("Jane Doe");
        this.cardNumber = 00000000;
        this.pin = 0;
    }
    public DebitCard(String aName, int aCardNumber, int aPin){
        super(aName);
        this.cardNumber = aCardNumber;
        this.pin = aPin;
    }
    public String toString(){
        return super.toString() + " Card Number: " + cardNumber;
    }

}
