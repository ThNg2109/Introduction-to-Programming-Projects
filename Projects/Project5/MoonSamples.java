package Projects.Project5;/*
** Java program name: Moon Samples
* ********************************************
* Project description: The program accepts two Strings, one containing various
soil composition elements and another containing the values found of these elements
within the soil samples
* *******************************************
* Name: Thao N Nguyen
* Version date: 10/27/2021
* Course number and section: CMSC255-901
 */

import java.util.Scanner;

/************************* Main Method ************************/

public class MoonSamples {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //input at command line
        String elements = in.nextLine();
        String samples = in.nextLine();

        //call getElements() and getSamples() methods
        String[] elementsArray = getElements(elements);
        double[][] samplesArray = getSamples(samples);

        //call searchForLife() method, passing 2D double samplesArray
        int[] forLife = searchForLife(samplesArray);

        //print the result of the array forLife
        System.out.print("The samples that contain life are:");
        for(int i = 0; i < forLife.length; i++){
            System.out.print(" " + forLife[i]);
        }
        System.out.println();

        //print result of searchHighestElements() method
        int sampleNum = in.nextInt();
        String highestElements = searchHighestElements(samplesArray, elementsArray, sampleNum);
        System.out.println("The highest elements for sample " + sampleNum + " are " + highestElements);

        //print result of searchHighestSample() method
        in.nextLine();
        String sampleElement = in.nextLine();
        int highestSample = searchHighestSample(samplesArray, elementsArray, sampleElement);
        System.out.println("The sample with the highest value of the element " + sampleElement + " is " + highestSample);

    }

/************************* Write Methods ***********************/
    /*
    * method getElements() takes in a String of elements
    * returns a 1D String array containing the list of elements
    */
    public static String[] getElements(String inputElementString){
        return inputElementString.split(",");

    }

    /*
    * method getSamples() takes in a String of samples values
    * returns a 2D double array containing the elemental composition of each sample
     */
    public static double[][] getSamples(String inputSamplesString) {
        //get row for the array
        String[] row = inputSamplesString.split("<>");
        //assign double array row length and column length
        double[][] samples = new double[row.length][(row[0].split(",")).length];
        for(int i = 0; i < row.length; i++) {
            String[] rowArray = row[i].split(","); //split the values of row into column values
            for(int j = 0; j < rowArray.length; j++) {
                samples[i][j] = Double.parseDouble(rowArray[j]); //convert the column values to double and assign them into the 2D array
            }
        }
        return samples;
    }

    /*
    * method searchForLife() takes in a 2D double array of samples values
    * searches for the ones that could support life (>=300)
    * returns the num of sample rows in an int array
    * Formular = 8*carbon dioxide + 2*magnesium + sodium + 4*potassium + chloride + 5*water
     */
    public static int[] searchForLife(double[][] samples){
        //declare a String to hold the output value
        String forLife = "";

        //declare and assigned a variable to sum the formular
        double sumForLife = 0;

        //make a loop to check every element in samples to calculate the formular
        for(int i = 0; i < samples.length; i++){
            sumForLife = samples[i][0]*8 + samples[i][1]*2 + samples[i][2] +
                    samples[i][3]*4 + samples[i][4] + samples[i][5]*5;

            //add i to forLife if sumForLife >= 300
            if(sumForLife >= 300){
                forLife = forLife + (i+1) + " ";
            }
        }
        //return forLife after split " " and convert it to an int array
        String[] forLifeString = forLife.split(" ");
        int[] forLifeInt = new int[forLifeString.length];
        for(int i = 0; i < forLifeString.length; i++){
            forLifeInt[i] = Integer.parseInt(forLifeString[i]);
        }
        return forLifeInt;
    }

    /*
    * method searchHighestElement() takes in a String array of elements,
    2D double array of sample values, and a sample number to search
    * returns a string containing the two elements that
    have the highest amounts of that sample
    * following the order the highest first, the second-highest then
     */
    public static String searchHighestElements(double[][] samples, String[] elements, int sampleNum){
        String element1 = elements[0];
        String element2 = elements[0];
        // sampleNum begins from 1 that is the 0 index in arrays
        double max1 = samples[sampleNum-1][0];
        double max2 = samples[sampleNum-1][0];
        for(int i = 0; i < samples[sampleNum-1].length; i++){
            if(samples[sampleNum-1][i] > max1){
                max1 = samples[sampleNum-1][i];
                element1 = elements[i];
            }
        }
        for(int i = 0; i < samples[sampleNum].length; i++){
            if(samples[sampleNum-1][i] > max2 && samples[sampleNum-1][i] < max1){
                max2 = samples[sampleNum-1][i];
                element2 = elements[i];
            }
        }
        return element1 + " and " + element2;
    }

    /*
    * method searchHighestSample() takes in a String array of elements,
    a 2D double array of samples, and an element to search
    * returns the sample number that contains the highest amount of that element
     */
    public static int searchHighestSample(double[][] samples, String[] elements, String element){
       int highestSample = -1; //return -1 if the element is not an element in the string
        for(int i = 0; i < elements.length; i++){
            if(elements[i].equals(element)){
                double maxSample = samples[0][i];
                for(int i1 = 0; i1 < samples.length; i1++){
                    if(samples[i1][i] > maxSample){
                        maxSample = samples[i1][i];
                        //sample begin from 1, not 0
                        highestSample = i1 +1;
                    }
                }
            }
        }
        return highestSample;
    }
}
