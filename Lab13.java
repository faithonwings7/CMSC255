/********************************************************************************
 * Prompt for the input and output file names
 * ****************************************************************************/

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Lab13 {

    public void main(String[] args) throws FileNotFoundException{



        /********************************************************************************
         * Construct the Scanner and PrintWriter objects for reading and writing
         * ****************************************************************************/
        PrintWriter out = new PrintWriter("SoccerSummary.txt");
        File f = new File("SoccerStats.txt");
        Scanner in = new Scanner(f);

        //variables============================================================
        int max = 0;
        int min = 10000;
        String maxName = "";
        String minName = "";
        double totalShots = 0;
        int count = 0;

        int tempGoals = 0;
        String[] teams;

        String[] teamNames = new String[20];
        int[] numGoals = new int[20];
        double[] numShots = new double[20];
        //variables============================================================

        /********************************************************************************
         * Verify that there's a line to read in
         * ****************************************************************************/
        while (in.hasNextLine()) {

            /********************************************************************************
             * Read in one line of data at a time
             * ****************************************************************************/
            String team = in.nextLine();

            /********************************************************************************
             * Split line of data into three fields delimited on comma
             * ****************************************************************************/
            teams = team.split(",");

            /********************************************************************************
             * Set values = to correct arrays
             * ****************************************************************************/
            teamNames[count] = teams[0];
            numGoals[count] = Integer.parseInt(teams[1]);
            numShots[count] = Double.parseDouble(teams[2]);

            /********************************************************************************
             * To get sum of all shots taken from all lines
             * ****************************************************************************/
            totalShots += Double.parseDouble(teams[2]);

            count++;
        }
        tempGoals = numGoals[0];
        /********************************************************************************
         * Determining max goals scored
         * ****************************************************************************/
        for (int i = 0; i <= numGoals.length; i++) {
            if (tempGoals < numGoals[i]) {
                max = numGoals[i];
                maxName = teamNames[i];
            }
        }
        /********************************************************************************
         * Determining min goals scored
         * ****************************************************************************/

        for (int i = 0; i <= numGoals.length; i++) {
            if (tempGoals > numGoals[i]) {
                min = numGoals[i];
                minName = teamNames[i];
            }
        }

        /********************************************************************************
         * Determining avg shots scored per game
         * ****************************************************************************/
        double avgShots = totalShots / count;

        /********************************************************************************
         * Final output
         * ****************************************************************************/
        System.out.println("Maximum goals Scored: " + maxName + " " + max);
        System.out.println("Minimum goals Scored: " + minName + " " + min);
        System.out.println("Average shots per game: " + avgShots);

    }
}
