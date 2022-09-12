package Labs.Lab14;

import java.io.*;
import java.util.Scanner;

/**
 *   DaysPerMonth
 *   VCU - Computer Science Department
 *   A program that prompts the user for a month and year (both as integers)
 *   then displays the number of days in that month.
 **/

public class DaysPerMonth {

    public static void main(String[] args) {
        /*
        File inputFile = new File("lab14Data.txt");
        File outputFile = new File("lab14Output.txt");
        processFile(inputFile,outputFile);
        */

        File inputFile = null;
        File outputFile = null;
        if (args.length <= 0) {
            Scanner in = new Scanner(System.in);
            inputFile = new File(in.nextLine());
            outputFile = new File(in.nextLine());
        } else {
            inputFile = new File(args[0]);
            outputFile = new File(args[1]);
        }
        processFile(inputFile, outputFile);


    }


    public static void processFile(File inputFile, File outputFile) {
        try {
            FileReader inFile = new FileReader(inputFile);
            FileReader outFile = new FileReader(outputFile);
            Scanner in = new Scanner(inputFile);
            PrintWriter out = new PrintWriter(outputFile);
            //try {
            while (in.hasNextLine()) {
                String[] sData = in.nextLine().split(",");
                try {
                    int month = Integer.parseInt(sData[0]);
                    int year = Integer.parseInt(sData[1]);

                    if (month < 1 || month > 12) {
                        out.println("Month must be between 1 and 12");
                    }
                    else if (year < 0) {
                        out.println("Year cannot be negative");
                    }
                    else {
                        int day = getDays(month,year);
                        out.println("There are " + day + " days in this month.");
                    }
                }
                catch (NumberFormatException ex) {
                    out.println("Not an integer");
                }
            }
            out.close();
        }
                catch(FileNotFoundException ex){
                System.out.println("Bad File Name");
            } catch(IOException ex){
                System.out.println("Bad File Name");
            }
        }


        /**
         * method to determine the days for the given month and year
         **/
        private static int getDays ( int mon, int yr){
            int numDays = 0;

            switch (mon) {
                case 2: // February
                    numDays = 28;
                    if (yr % 4 == 0) {
                        numDays = 29;
                        if (yr % 100 == 0 && yr % 400 != 0) {
                            numDays = 28;
                        }
                    }
                    break;

                case 4:   //April
                case 6:   // June
                case 9:   // September
                case 11:  // November
                    numDays = 30;
                    break;

                default:
                    numDays = 31;  // all the rest
            }
            return numDays;
        }

}
