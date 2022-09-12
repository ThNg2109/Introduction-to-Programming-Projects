package Labs.Lab13;

public class Team {
    //instance variables
    private String name;
    private int numGoals;
    private double numShots;

    //default constructor
    public Team(){
        this.name = "";
        this.numGoals = 0;
        this.numShots = 0;
    }

    //parameterized constructor
    public Team(String aName, int aNumGoal, double aNumShot){
        name = aName;
        numGoals = aNumGoal;
        numShots = aNumShot;
    }

    //getter and setter
    public void setName(String aName){
        name = aName;
    }
    public String getName(){
        return name;
    }
    public void setNumGoals(int aNumGoal){
        numGoals = aNumGoal;
    }
    public int getNumGoals(){
        return numGoals;
    }
    public void setNumShots(double aNumShot){
        numShots = aNumShot;
    }
    public double getNumShots(){
        return numShots;
    }
}
