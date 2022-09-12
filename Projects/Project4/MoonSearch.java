package Projects.Project4;/*
* Program name: Moon Search
*********************************
* Project description: The program helps to explore the moons of Mars
and other plants to determine if they can establish on these moons
*********************************
* Name: Thao Nguyen Nguyen
* Version date: 10/15/2021
* Course: CMSC255 - 901
 */

import java.util.Scanner;
public class MoonSearch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        /*
        Create the arrays required for the program
         */

        //String array of moon names
        String[] moonNames = {"Phobus","Deimos","Adrastea","Aitne","Amalthea","Ananke","Aoede","Arche"};
        //Double array of radii in kms
        double[] radii = {11.3,6.2,68.9,33.6,71.2,26.8,255.9,47.4};
        //double array of density in kg/m^3
        double[] density = {1.8,1.4,14.2,33.3,16.4,68.1,121.3,38.2};
        //double array of distance in 10^3km from the Mars
        double[] distance = {3.7,23.4,550391.6,227894.9,778893.6,143323.5,287223.5,449655.1};

        /* call methods and print results
        round double output to one decimal spaces using printf
         */

        //call calcAvg() method for radii and print the results
        System.out.printf("The average radius is: %.1f%n",calcAvg(radii));
        //call calcAvg() method for density and print the results
        System.out.printf("The average density is: %.1f%n",calcAvg(density));
        //call findHighValue() method for radii and print the results
        System.out.printf("The highest radius is: %.1f%n",findHighValue(radii));
        //call findLeastValue() method for distance and print the results
        System.out.printf("The lowest distance is: %.1f%n",findLeastValue(distance));
        //call findHighestTwo() method for moonNames and radii and print the results(using loop)
        String[] highestTwo = findHighestTwo(moonNames,radii);
        System.out.println("The highest two moons for radii are:");
        int i = 0;
        while (i < highestTwo.length){
            System.out.printf("%10s%n",highestTwo[i]);
            i++;
        }
        //call findLeastTwo() method for moonNames and density and print the result(using loop)
        String[] lowestTwo = findLowestTwo(moonNames, density);
        System.out.println("The lowest two moons for density are:");
        for(i = 0; i < lowestTwo.length; i++){
            System.out.printf("%10s%n",lowestTwo[i]);
        }
        //ask user for a moon name
        System.out.println("Enter a moon:");
        String moon = in.nextLine().trim();

        /*
        call findMoon() for moonNames and input's moon and print the results
        findMoon is true, it's a moon in the array
        findMoon is false, it's not a moon in the array
         */
        if(findMoon(moonNames,moon)){
            System.out.println(moon + " is a moon in the array.");
        }
        else {
            System.out.println(moon + " is not a moon in the array.");
        }
    }

    /*************************** methods *************************/

    /* method calcAvg calculates the average from all the values in a
    double array.
     Returns the average as double
     */
    public static double calcAvg(double[] values){
        double total = 0.0;
        for(int i = 0; i < values.length; i++){
            total = total + values[i];
        }
        double average = total/values.length;
        return average;
    }

    /* method findHighValue searches a double array to find the largest value
    Method returns a double value
     */
    public static double findHighValue(double[] values){
        double max = values[0];
        for(int i = 0; i <values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
        }
        return max;
    }

    /* method findLeastValue searches a double array to find the smallest value
    Method returns a double value
     */
    public static double findLeastValue(double[] values){
        double min = values[0];
        for(int i = 0; i<values.length; i++){
            if(values[i] < min){
                min = values[i];
            }
        }
        return min;
    }

    /*method findHighestTwo passes a String array and a double array
    Method searches through the double array to find the two largest values
    It returns a String array that contains the strings associated with the largest values
    The highest value listed first
     */
    public static String[] findHighestTwo(String[] names, double[] values){
        String[] highestNames = new String[2];
        double max1 = values[0];
        double max2 = values[0];
        highestNames[0] = names[0];
        highestNames[1] = names[0];
        for(int i = 0; i < values.length; i++) {
            if (values[i] > max1) {
                max1 = values[i];
                highestNames[0] = names[i];
            }
        }
        for(int i = 0; i < values.length; i++){
            if(values[i] > max2 && values[i] < max1){
                max2 = values[i];
                highestNames[1] = names[i];
            }
        }
        return highestNames;
    }

    /* method findLowestTwo that passes a String array and a double array
    method searches to find the two smallest values
    returns a string array that contains the strings  associated with the smallest two values
    The smallest listed first
     */
    public static String[] findLowestTwo(String[] names, double[] values){
        String[] lowestNames = new String[2];
        double min1 = values[0];
        double min2 = values[0];
        lowestNames[0] = names[0];
        lowestNames[1] = names[0];
        for(int i = 0; i < values.length; i++) {
            if (values[i] < min1) {
                min1 = values[i];
                lowestNames[0] = names[i];
            }
        }
        for(int i = 0; i <values.length; i++){
            if(values[i] < min2 && values[i] > min1){
                min2 = values[i];
                lowestNames[1] = names[i];
            }
        }
        return lowestNames;
    }

    /*method findMoon verifies if a given String is a valid moon in moonNames array
    method returns a boolean value of true of false
     */
    public static boolean findMoon(String[] names, String moon){
        boolean isMoon = false;
        for(int i = 0; !isMoon && i< names.length; i++){
            if(names[i].equals(moon)){
                isMoon = true;
            }
        }
        return isMoon;
    }
}
