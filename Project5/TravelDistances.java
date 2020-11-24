import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TravelDistances {

    public static void main (String[] args){

        /****************************************************************************
         * Project 5 = TravelDistances
         ****************************************************************************
         * Write a program that takes in string vales from user, creates single & multidimensional
         * arrays and allows you to output results based on qualifying questions about destinations
         *_____________________________________________________
         * Anne Szarek
         * 10/26/19
         * CMSC_255 Section 4
         ****************************************************************************/

        Scanner input = new Scanner(System.in);

        //input string of cities from user
        System.out.println("Input string of cities: ");
        String cities = input.nextLine();

        //input string of distances
        System.out.println("Input string of distances: ");
        String cityDistances = input.nextLine();

        //call getCity() method set to variable
        String[] cityList = getCity(cities);

        //call getDistance() method set to variable
        int[][] distanceMatrix = getDistance(cityDistances);

        //Ask user if they'd like to search cities >= to certain distance
        System.out.println("Type true if you would like to search cities above or equal to a certain distance or false if you would like to " +
                "search cities below a certain distance: ");
        String isOver = input.nextLine();
        boolean isDistanceAbove = false;
        if (isOver.equalsIgnoreCase("true")){
            isDistanceAbove = true;
        }

        //Ask user to enter searchDistance
        System.out.println("Enter the distance you would like to search: ");
        int searchDistance = input.nextInt();

        //Ask user to enter startCity
        System.out.println("Enter the city you would like to start from: ");
        input.nextLine();
        String startCity = input.nextLine();

        //print out searchDistance
        String[] destinationResultList = searchDistance(distanceMatrix, cityList, isDistanceAbove, searchDistance, startCity);
        System.out.println(Arrays.toString(destinationResultList));

    }

    //method to return String[] with cities delimited by comma
    public static String[] getCity(String cities) {
        String[] cityList = cities.split(",");

        return cityList;
    }

    //method to return matrix with distances delimited by <> to make rows and , for columns
    public static int[][] getDistance(String cityDistances){

        String[] distanceRows = cityDistances.split("<>");

        int[][] matrix = new int[distanceRows.length][distanceRows.length];

        for(int i = 0; i < distanceRows.length; i++){
            String[] distanceValues = distanceRows[i].split(",");

            for(int j = 0; j < distanceValues.length; j++){
                matrix[i][j] = Integer.parseInt(distanceValues[j]);
            }
        }

        return matrix;
    }

    public static String [] searchDistance(int [][] matrix, String[] getCity, boolean isOver, int searchDistance, String startCity){

        int finalCityIndex = 0;

        //search getCity [] for city entered
        for(int i = 0; i < getCity.length; i++){
            if(getCity[i].equals(startCity)){
                finalCityIndex = i;
            }
        }

        //Creating string array to hold destinations
        ArrayList<String> finalDestinations = new ArrayList<String>();

        // Find all distances in the matrix that are above or below

        // Take index of distance and pull city that matches that distance
        int finalDestinationCounter = 0;
        for(int i = 0; i < matrix.length; i++){
            if ((isOver)) {

                if (matrix[i][finalCityIndex] != 0 && matrix[i][finalCityIndex] >= searchDistance) {
                    finalDestinations.add(getCity[i]);
                    finalDestinationCounter++;
                }
            }
            else{
                if(matrix[i][finalCityIndex] != 0 && matrix[i][finalCityIndex] < searchDistance) {
                    finalDestinations.add(getCity[i]);
                    finalDestinationCounter++;
                }
            }
        }

        //Arrays.sort to sort finalDestinations[]
        Collections.sort(finalDestinations);

        String[] destinationList = finalDestinations.toArray(new String[finalDestinations.size()]);

        // ----------------------------------------------------

        String[] dests = new String[getCity.length];
        int counter = 0;
        for(int i = 0; i < dests.length; i++) {
            if (dests[i] != null) {
                counter++;
            }
        }

        String[] newDestsList = new String[counter];
        for (int i = 0; i < counter; i++) {
            newDestsList[i] = dests[i];
        }

        // ------------------------------------------------


        String[] dests2 = new String[getCity.length];
        String indicies = "";
        for(int i = 0; i < dests2.length; i++) {
            if (dests[i] != null) {
                indicies = indicies + i + ",";
            }
        }

        indicies = indicies.substring(0 , indicies.length() - 1);

        String[] indiciesList = indicies.split(",");
        String[] newDestsList2 = new String[indicies.length()];

        for(int i = 0; i < indiciesList.length; i++) {
            newDestsList2[i] = dests2[Integer.parseInt(indiciesList[i])];
        }

        return destinationList;
    }

}
