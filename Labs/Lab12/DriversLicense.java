package Labs.Lab12;

public class DriversLicense extends IDCard{
    //2 instance variables
    private int expirationYear;
    private Month expirationMonth;
    //default constructor
    public DriversLicense(){
        super();
        expirationYear = 1969;
        expirationMonth = Month.JANUARY;
    }
    //parameterized constructor
    public DriversLicense(String aName, int anIdNumber, int anExpirationYear, Month anExpirationMonth){
        super(aName,anIdNumber);
        this.expirationYear = anExpirationYear;
        this.expirationMonth = anExpirationMonth;
    }
    //toString() method
    public String toString(){
        return super.toString() + " Expiration Month & Year: " + expirationMonth + " " + expirationYear;
    }
}
