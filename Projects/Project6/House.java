package Projects.Project6;
/*
** Java program name: Martian Houses
*************************************
* Project description: Program helps settlers organize their housing
developments and houses to keep track of those.
*************************************
* Name: Thao N nguyen
* Version date: November 10, 2021
* Course: CMSC 255 - 901
 */

/*
* Create House object
 */

public class House {
    /*
    * Instance variables of house object:
    * String owner, int lotNumber, double squareFootage
    * Bedrooms bedrooms, Baths baths, Color color
     */

    private String owner;
    private int lotNumber;
    private double squareFootage;
    private Bedrooms bedrooms;
    private Baths baths;
    private Color color;

    /*
    * Parameterized constructor
    * pass in the owner, the lot number, the square footage,
    * the number of bedrooms, the number of bathrooms, the color of the house
     */
    public House(String anOwner, int aLotNumber, double aSquareFootage, Bedrooms aBedrooms, Baths aBaths, Color aColor){
        this.owner = anOwner;
        this.lotNumber = aLotNumber;
        this.squareFootage = aSquareFootage;
        this.bedrooms = aBedrooms;
        this.baths = aBaths;
        this.color = aColor;
    }

    /*
    * Default constructor
    * assign empty String for owner, 1 for lotNumber, 500.00 for squareFootage
    * the first value in each enumerated list
     */
    public House(){
        this("", 1, 500.00, Bedrooms.ONE_BEDROOM, Baths.ONE, Color.WHITE);
    }

    //setter methods
    public void setOwner(String anOwner){
        owner = anOwner;
    }
    public void setLotNumber(int aLotNumber){
        lotNumber = aLotNumber;
    }
    public void setSquareFootage(double aSquareFootage){
        squareFootage = aSquareFootage;
    }
    public void setBedrooms(Bedrooms aBedRoom){
        bedrooms = aBedRoom;
    }
    public void setBaths(Baths aBath){
        baths = aBath;
    }
    public void setColor(Color aColor){
        color = aColor;
    }

    //getter methods
    public String getOwner(){
        return owner;
    }
    public int getLotNumber(){
        return lotNumber;
    }
    public double getSquareFootage(){
        return squareFootage;
    }
    public Bedrooms getBedrooms(){
        return bedrooms;
    }
    public Baths getBaths(){
        return baths;
    }
    public Color getColor(){
        return color;
    }

    /*
    * toString() method
    * Print each instance variable with a new line then a tab
    * Format to 2 decimal points for floating points
     */
    public String toString(){
        String output = String.format("\n\t%s\n\t%d\n\t%.2f\n\t%s\n\t%s\n\t%s\n",owner,lotNumber,squareFootage,bedrooms,baths,color);
        return output;
    }
}
