package Projects.Project7;

/*
**Java program name: Moon.java
* **********************
* Project description: Program creates an object to encapsulate the data values
associated with a moon
*************************
* Name: Thao N Nguyen
* Version date: 12/02/2021
* Course number and section: CMSC255-901
 */

public class Moon {
    /*
    **instance variables:
    * name:String, radius: double, density: double, distance: double
     */
    private String name;
    private double radius;
    private double density;
    private double distance;

    /*
    **default constructor sets all string values to empty and numeric values to 0.0
     */
    public Moon(){
        name = "";
        radius = 0.0;
        density = 0.0;
        distance = 0.0;
    }

    /*
    **parameterized constructor passes in
    * a name, radius, density, and distance to set to the instance variables
     */
    public Moon(String aName, double aRadius, double aDensity, double aDistance){
        name = aName;
        radius = aRadius;
        density = aDensity;
        distance = aDistance;
    }

    /*
    **getters and setters for each instance variable
     */
    public void setName(String aName){
        name = aName;
    }
    public String getName(){
        return name;
    }
    public void setRadius(double aRadius){
        radius = aRadius;
    }
    public double getRadius(){
        return radius;
    }
    public void setDensity(double aDensity){
        density = aDensity;
    }
    public double getDensity(){
        return density;
    }
    public void setDistance(double aDistance){
        distance = aDistance;
    }
    public double getDistance(){
        return distance;
    }

    /*
    **toString() method returns the name, radius, density, and distance separated by a space
    * rounds each double value to two decimal places
     */
    public String toString(){
        return String.format("%s %.2f %.2f %.2f",name,radius,density,distance);
    }
}
