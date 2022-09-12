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
* Create Development object
 */

import java.util.ArrayList;

public class Development {
    /*
    * Instance variables for Development object
    * String name, String location, int yearEst, int numLots, ArrayList<House> houses
     */
    private String name;
    private String location;
    private int yearEst;
    private int numLots;
    private ArrayList<House> houses;

    /*
    * parameterized constructor
    * pass in associated instance variables
    * create an empty array list in the houses
     */

    public Development(String aName, String aLocation, int aYearEst, int aNumLots){
        this.name = aName;
        this.location = aLocation;
        this.yearEst = aYearEst;
        this.numLots = aNumLots;
        this.houses = new ArrayList<House>();
    }

    /*
    * Default constructor
    * Assign an empty String for String variables, 0 for int variables
    * Create an empty array list in the houses
     */

    public Development(){
        this("","",0,0);
        houses = new ArrayList<House>();
    }

    //setter methods
    public void setName(String aName){
        name = aName;
    }
    public void setLocation(String aLocation){
        location = aLocation;
    }
    public void setYearEst(int aYearEst){
        yearEst = aYearEst;
    }
    public void setNumLots(int aNumLot){
        numLots = aNumLot;
    }

    //getter methods
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public int getYearEst(){
        return yearEst;
    }
    public int getNumLots(){
        return numLots;
    }

    /*
    ** addHouse() method
    *  add a House object to houses
     */
    public void addHouse(House aHouse){
        houses.add(aHouse);
    }

    /*
    ** getNumHouses() method
    * return how many House objects are stored in houses
     */
    public int getNumHouses(){
        int numHouses = houses.size();
        return numHouses;
    }

    /*
    ** getHouses() method
    * return ArrayList of houses
     */
    public ArrayList<House> getHouses(){
        return houses;
    }

    /*
    * toString() method
    * Print each instance variables with a new line
    * Call House's toString() for each House object in houses and print it after Houses:
     */
    public String toString(){
        String housesString = "";
        for(int i = 0; i< houses.size(); i++){
            housesString = housesString + houses.get(i).toString();
        }
        String output = String.format("%s\n%s\n%d\n%d\nHouses:\n%s",name,location,yearEst,numLots,housesString);
        return output;
    }
}
