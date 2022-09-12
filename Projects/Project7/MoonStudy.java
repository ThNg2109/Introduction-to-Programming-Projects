package Projects.Project7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
**Java program name: MoonStudy.java
* **********************
* Project description: Program accepts at the command line two filenames
one is a text file containing the moon data that will be read and then write out
in the output file
*************************
* Name: Thao N Nguyen
* Version date: 12/02/2021
* Course number and section: CMSC255-901
 */
public class MoonStudy {
    /********************* write methods **************************/
    /*
    *method openFile() takes in a File object and loops to read the data from the file
    *store the data contained for Moon objects in the file in an ArrayList of Strings
     */
    public static ArrayList<String> openFile(File inputFile) throws FileNotFoundException {
        //import Scanner
        Scanner in = new Scanner(inputFile);
        //create a String ArrayList
        ArrayList<String> moonData = new ArrayList<String>();
        //loop to read inputFile and add its data into moonData arraylist
        while(in.hasNextLine()){
            moonData.add(in.nextLine());
        }
        //return the moonData
        return moonData;
    }

    /*
    **method createObject() parses the data from moonData's element
    into an ArrayList containing Moon objects
    * use String.split("\t") to split the data and stores it in a String array
    * use that temp data to create a new Moon object
    * use try/catch block to handle NumberFormatException if the file has incorrect data
     */
    public static ArrayList<Moon> createObjects(ArrayList<String> lines){
        ArrayList<Moon> moonObject = new ArrayList<Moon>();
        for(int i = 0 ; i < lines.size(); i++) {
            String[] moonData = lines.get(i).split("\t");
            double moonRadius, moonDensity, moonDistance;
            /*
            **set the values that have incorrect data or negative values to 0.0
             */
            try {
                moonRadius = Double.parseDouble(moonData[1]);
                if (moonRadius < 0) {
                    moonRadius = 0.0;
                }
            }
            catch(NumberFormatException ex){
                moonRadius = 0.0;
            }
            try{
                moonDensity = Double.parseDouble(moonData[2]);
                if (moonDensity < 0){
                    moonDensity = 0.0;
                }
            }
            catch(NumberFormatException ex){
                moonDensity = 0.0;
            }
            try{
                moonDistance = Double.parseDouble(moonData[3]);
                if(moonDistance < 0){
                    moonDistance = 0.0;
                }
            }
            catch(NumberFormatException ex){
                moonDistance = 0.0;
            }
            Moon aMoon = new Moon(moonData[0], moonRadius, moonDensity, moonDistance);
            moonObject.add(aMoon);
        }
        return moonObject;
        }
    /*
    **method findMean() calculates the average for the given numeric attribute of the Moon objects
    * method returns double value for the average of the object
     */
    public static double findMean(ArrayList<Moon> moons, MoonAttributes attribute){
        double meanObject = 0.0;
        //find the attribute and call its method in the ArrayList moons
        for(int i = 0; i < moons.size(); i++) {
            if (attribute.equals(attribute.RADIUS)) {
                meanObject += moons.get(i).getRadius();
            } else if (attribute.equals(attribute.DENSITY)) {
                meanObject += moons.get(i).getDensity();
            } else if (attribute.equals(attribute.DISTANCE)) {
                meanObject += moons.get(i).getDistance();
            }
        }
        meanObject = meanObject/moons.size();
        return meanObject;
    }

    /*
    **method findHighValue() calculates the highest value for the given numeric attribute
    within the Moon object
    * method returns the highest of the Moon objects given attribute as a double
     */
    public static double findHighValue(ArrayList<Moon>moons, MoonAttributes attribute){
        double highestValue = 0.0;
        for(int i =0; i < moons.size(); i++){
            if(attribute.equals(attribute.DENSITY)){
                if(highestValue < moons.get(i).getDensity()){
                    highestValue = moons.get(i).getDensity();
                }
            }
            else if(attribute.equals(attribute.RADIUS)){
                if(highestValue < moons.get(i).getRadius()){
                    highestValue = moons.get(i).getRadius();
                }
            }
            else if(attribute.equals(attribute.DISTANCE)){
                if(highestValue < moons.get(i).getDistance()){
                    highestValue = moons.get(i).getDistance();
                }
            }
        }
        return highestValue;
    }

    /*
    **findMeanMoon() method finds and returns the Moon object in the Moon ArrayList
    whose value is closet to the mean value of the data for that given attribute
     */
    public static Moon findMeanMoon(ArrayList<Moon>moons, MoonAttributes attribute, double meanValue){
        double valueGap = 0.0;
        Moon meanMoon = null;
        for(int i = 0; i < moons.size(); i++){
            if(attribute.equals(attribute.RADIUS)){
                if(meanMoon == null || valueGap > Math.abs(meanValue - moons.get(i).getRadius())) {
                    valueGap = Math.abs(meanValue - moons.get(i).getRadius());
                    meanMoon = moons.get(i);
                }
            }
            else if(attribute.equals(attribute.DENSITY)) {
                if (meanMoon == null || valueGap > Math.abs(meanValue - moons.get(i).getDensity())) {
                    valueGap = Math.abs(meanValue - moons.get(i).getDensity());
                    meanMoon = moons.get(i);
                }
            }
            else if(attribute.equals(attribute.DISTANCE)) {
                if (meanMoon == null || valueGap > Math.abs(meanValue - moons.get(i).getDistance())) {
                    valueGap = Math.abs(meanValue - moons.get(i).getDistance());
                    meanMoon = moons.get(i);
                }
            }
        }
        return meanMoon;
    }

    /*
    **method findLowestMoon() finds the moon object below the value for the given attribute
    * method returns an array list containing the Moon object that are lower than the value
     */
    public static ArrayList<Moon> findLowestMoons(ArrayList<Moon> moons, double value, MoonAttributes attribute){
        ArrayList<Moon> lowestMoon = new ArrayList<Moon>();
        for(int i = 0; i < moons.size(); i++) {
            if (attribute.equals(attribute.RADIUS)) {
                if (moons.get(i).getRadius() < value){
                    lowestMoon.add(moons.get(i));
                }
            }
            else if (attribute.equals(attribute.DENSITY)){
                if(moons.get(i).getDensity() < value){
                    lowestMoon.add(moons.get(i));
                }
            }
            else if (attribute.equals(attribute.DISTANCE)){
                if(moons.get(i).getDistance() < value){
                    lowestMoon.add(moons.get(i));
                }
            }
        }
        return lowestMoon;
    }

    /*
    ** Three methods writeOutData() called outputToFile
    * pass in a String of text to describe the output and a PrintWriter object to print
    * each output will be on a new line and be separated by a blank line
     */

    //call the Moon toString() for the first two methods

    /*
    ***print an array list of values
     */
    public static void outputToFile(String outputMessage, ArrayList<Moon> moons, PrintWriter out){
        out.print(outputMessage);
        for(int i = 0; i < moons.size(); i++){
            out.print(moons.get(i).toString() + " ");
        }
        out.println();
        out.println();
    }

    /*
    ***print one Moon object
     */
    public static void outputToFile(String outputMessage, Moon moon, PrintWriter out){
        out.println(outputMessage + moon.toString());
        out.println();
    }

    /*
    ***print a double value
    * need to round the double output to two decimal places
     */
    public static void outputToFile(String outputMessage, double value, PrintWriter out){
        out.printf("%s%.2f\n",outputMessage,value);
        out.println();
    }

    /******************* Write main method **********************************/

    public static void main(String[] args){
        /*
        ** main method reads in the two command line arguments then create File objects
        * first command line is the input file, the second is the output file
        * then call openFile() in a try catch block
         */
        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);

        //create a String ArrayList to hold the inputFile data
        ArrayList<String> inputData = null;
        //create a Moon ArrayList to hold the moon Objects
        ArrayList<Moon> moons = null;

        /*
        **use try/catch block to handle problems with the text file
        * If there is a problem: print "Incorrect output filename" on the console
        * If no problem, print: "Output file correct" on the console
         */
        try {
            inputData = openFile(inputFile);
            //pass the ArrayList inputData to the createObjects() methods
            moons = createObjects(inputData);
            System.out.println("Input file correct");
        }
        catch(FileNotFoundException ex){
            System.out.println("Incorrect input filename");
        }


        /*
        **calling writeOutData method
        * call it in a try catch block
        * If there is a problem: print "Incorrect output filename" on the console
        * If no problem, print: "Output file correct" on the console
         */
        try {
            PrintWriter out = new PrintWriter(outputFile);
            if(moons != null) {
                outputToFile("The mean of radii is: ", findMean(moons, MoonAttributes.RADIUS), out);
                outputToFile("The highest density value is: ", findHighValue(moons, MoonAttributes.DENSITY), out);
                outputToFile("The moon closest to the mean is: ", findMeanMoon(moons, MoonAttributes.RADIUS, findMean(moons, MoonAttributes.RADIUS)), out);
                outputToFile("The moons below the mean value of radii are: ", findLowestMoons(moons, findMean(moons, MoonAttributes.RADIUS), MoonAttributes.RADIUS), out);
            }
            System.out.println("Output file correct");
            out.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Incorrect output filename");
        }


    }

}

