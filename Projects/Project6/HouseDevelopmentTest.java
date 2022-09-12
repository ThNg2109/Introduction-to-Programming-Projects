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
** Write main method to test House class and Development class
* Create 3 house objects and 2 developments
* Print output of the developments
 */

public class HouseDevelopmentTest {
    public static void main(String[] args){
        // create house objects
        House house1 = new House("Carroline Budwell", 15, 2754.99, Bedrooms.TWO_BEDROOM, Baths.TWO, Color.GREEN);
        House house2 = new House("Sam Zu", 2, 2500.00, Bedrooms.THREE_BEDROOM, Baths.THREE, Color.WHITE);
        House house3 = new House("Zach Whitten", 27, 789.45, Bedrooms.STUDIO, Baths.ONE, Color.GRAY);

        // create development objects
        Development development1 = new Development("Freeze Zone", "North Polar Ice Cap", 2023, 20);
        Development development2 = new Development("Crater Field", "Korolev crater", 2072, 100);

        // add houses to developments
        development1.addHouse(house1);
        development1.addHouse(house2);

        development2.addHouse(house3);

        //print results for development objects
        System.out.println(development1.toString());
        System.out.println(development2.toString());
    }
}
