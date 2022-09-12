package Labs.Lab10;

public class Fan {
    /*
    * Create 3 public static constants named SLOW, MEDIUM, FAST with values 1, 2, 3
     */
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    /*
    * create a private int instance variable named speed
     */
    private int speed;

    /*
    * create a private boolean instance variable named on
     */
    private boolean on;

    /*
    * create a private double instance variable named radius
     */
    private double radius;

    /*
    * create a private String instance variable named color
     */
    private String color;

    /*
    ** getter and setter method for 4 instance variables
     */
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int aSpeed){
        speed = aSpeed;
    }
    public boolean isOn(){
        return on;
    }
    public void setOn(boolean aOn){
        on = aOn;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double aRadius){
        radius = aRadius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String aColor){
        color = aColor;
    }

    /*
    ** parameterized constructor creates a fan with speed, on, radius, and color
    * Use this. to assign values to the instance variable
     */

    public Fan(int speed, boolean isOn, double radius, String color){
        this.speed = speed;
        this.on = isOn;
        this.radius = radius;
        this.color = color;
    }

    /*
    ** no-arg constructor that create a default fan
    * using this() to call the parameterized constructor
    * speed = SLOW, on = false, radius = 5, color = "blue"
     */

    public Fan(){
        this(SLOW, false, 5, "blue");
    }

    /*
    * method toString() returns a string description for the fan
    * if fan is on: returns the fan speed, color, and radius in one combine string
    * if fan is not on: returns "fan is off"
     */

    public String toString(){
        String output = "";
        if(isOn()){
            output = output + "fan is " + getSpeed() + ", " + getColor() + ", and size " + getRadius();
        }
        else{
            output = output + "fan is off";
        }
        System.out.println(output);
        return output;
    }
}
