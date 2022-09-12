package Labs.Lab13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args){
        //create File objects from class argument, SoccerStats for args1, soccerSummary for args2
        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);

        /*
        * call processFile and wrapped it in try/catch block
         */
        try{
            processFile(inputFile, outputFile);
        }
        catch(FileNotFoundException ex){

        }


    }
    public static void processFile (File inputFile, File outputFile) throws FileNotFoundException {
        //get input and output files
        Scanner in = new Scanner(inputFile);
        PrintWriter out  = new PrintWriter(outputFile);

        /*
        * Program will find the max and min num of goals scored by the team
        * Also find the average of the shots per game
        * Then write the results to outputFile
         */

        /*
        * set variables minTeam and maxTeam to null
        * set totalTeam and totalShot to 0
         */
        Team minTeam = null;
        Team maxTeam = null;
        int totalTeam = 0;
        double totalShot = 0;

        /*
        * Using loop to check if there is a line to read in
        * Then use String.split(",") to split the line into an array of Strings
        * Then use values in the array to create a new Team object
         */
        while(in.hasNextLine()){
            String[] aTeam = in.nextLine().split(",");
            Team team = new Team(aTeam[0], Integer.parseInt(aTeam[1]), Double.parseDouble(aTeam[2]));

            /*
            * find if the team has max or min number of goals
            * Assign the first team to minTeam and maxTeam
             */
            if(minTeam == null && maxTeam == null){
                minTeam = team;
                maxTeam = team;
            }
            if(team.getNumGoals() > maxTeam.getNumGoals()){
                maxTeam = team;
            }
            else if(team.getNumGoals() < minTeam.getNumGoals()){
                minTeam = team;
            }

            //update totalTeam and totalShot for every loop
            totalTeam++;
            totalShot = totalShot + team.getNumShots();
        }
        // find averageShot after end loop
        double averageShot = totalShot / totalTeam;

        //write the results to output file
        out.println("Maximum goals Scored: " + maxTeam.getName() + " " + maxTeam.getNumGoals());
        out.println("Minimum goals Scored: " + minTeam.getName() + " " + minTeam.getNumGoals());
        out.printf("Average shots per game: %.3f",averageShot);
        out.close();

    }
}
