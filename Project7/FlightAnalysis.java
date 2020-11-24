import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;

public class FlightAnalysis {
    public static void main(String[] args) throws NumberFormatException {

        /****************************************************************************
         * Project 7 = FlightAnalysis
         ****************************************************************************
         * Write a program that takes in an input and output file, reads, parses the data
         * and created flight objects and compares flights.
         *_____________________________________________________
         * Anne Szarek
         * 12/2/19
         * CMSC_255 Section 4
         ****************************************************************************/

        String inputFileName = "";
        String outputFileName = "";

        if (args.length > 1) {
            inputFileName = args[0];
            outputFileName = args[1];
        }

        Scanner userInput = new Scanner(System.in);

        /****
         * Loop to check if input file name is empty
         */
        while (inputFileName.isEmpty()) {
            System.out.println("Enter input file name: ");
            inputFileName = userInput.nextLine();
        }

        /****
         * Loop to check if output file name is empty
         */
        while (outputFileName.isEmpty()) {
            System.out.println("Enter output file name: ");
            outputFileName = userInput.nextLine();
        }

        ArrayList<Flight> allFlights = new ArrayList<>();

        /****
         * Try catch - create file, use parseData method and output if file is correct
         */
        try {
            File flightData = new File(inputFileName);

            allFlights = parseData(flightData);
            System.out.println("Input file correct");

            /****
             * If file could not be made - program will throw FileNotFountException and print out to console
             */
        } catch (FileNotFoundException ex) {
            System.out.println("Incorrect input filename");
        }

        /****
         * Try - catch for removeData file.
         */
        try {
            File removeDataFile = new File("removeData.txt");
            ArrayList<Flight> removeItems = parseData(removeDataFile);
            allFlights = removeData(allFlights, removeItems);
        }

        /****
         * If file could not be made - program will throw FileNotFountException and print out to console
         */
        catch(FileNotFoundException ex){
            System.out.println("removeData file not found");
        }

        /****
         * Creationg of two objects - for best price and best flight per mile
         */
        Flight bestFlightPrice = calcBestFare(allFlights);
        Flight bestFlightPerMile = calcBestFare(allFlights);

        /****
         * Try - catch to create file and use writeOutData method.
         */
        try {
            File outputFile = new File(outputFileName);

            writeOutData(allFlights, outputFile);
            System.out.println("Output file correct");

        } catch (FileNotFoundException ex) {
            System.out.println("Incorrect output filename");
        }

    }

    public static ArrayList<Flight> parseData(File inputFile) throws FileNotFoundException{

        ArrayList<Flight> allFlights = new ArrayList<Flight>();
        String stringData;

        /****
         * Try - catch to see if file is valid
         */
        try {
            /****
             * Scanner reading from file
             */
            Scanner input = new Scanner(inputFile);

            /****
             * Skipping header
             */
            input.nextLine();

            /****
             * Reading in line by line of file
             */
            while (input.hasNextLine()) {

                stringData = input.nextLine();
                /****
                 * Splitting data by semi-colon
                 */
                String[] allFlightsString = stringData.split(";");

                /****
                 * Try to parse and see if value is valid. If so - parse to Double
                 */
                double d1;
                try {
                    d1 = Double.parseDouble(allFlightsString[3]);
                } catch (NumberFormatException ex) {
                    d1 = 0.0;
                }

                /****
                 * Try to parse and see if value is valid. If so - parse to Int
                 */
                int i1;
                try {
                    i1 = Integer.parseInt(allFlightsString[4]);
                } catch (NumberFormatException ez) {
                    i1 = 0;
                }

                if (d1 < 0){
                    d1 = 0;
                }

                if (i1 < 0){
                    i1 = 0;
                }


                Flight flight = new Flight(allFlightsString[0], allFlightsString[1], allFlightsString[2], d1, i1);
                allFlights.add(flight);
            }
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException();
        }
        return allFlights;
    }

    public static ArrayList<Flight> removeData(ArrayList<Flight> allFlights, ArrayList<Flight> removeItems) {

        /****
         * Remove duplicates
         */
        if(allFlights.size() > 0 && removeItems.size() > 0) {
            for (int i = 0; i < removeItems.size(); i++) {
                for (int j = 0; j < allFlights.size(); j++) {

                    if (removeItems.get(i).equals(allFlights.get(j))) {
                        allFlights.remove(j);
                        break;
                    }
                }
            }
        }
        return allFlights;
    }

    public static Flight calcBestFare(ArrayList<Flight> allFlights) {

        Flight bestFlight = new Flight();

        if(allFlights.size() > 0) {
            bestFlight = allFlights.get(0);

            /****
             * Calc best fare
             */
            for (int i = 0; i < allFlights.size(); i++) {
                Flight compareFlight = allFlights.get(i);
                if (bestFlight.getPrice() > compareFlight.getPrice()) {
                    bestFlight = compareFlight;
                }
            }
        }
        return bestFlight;
    }

    public static Flight calcBestFarePerMile(ArrayList<Flight> allFlights) {

        Flight bestFlight = new Flight();

        if(allFlights.size() > 0) {
            bestFlight = allFlights.get(0);

            for (int i = 0; i < allFlights.size(); i++) {
                Flight compareFlight = allFlights.get(i);

                /****
                 * Calc best fare per mile
                 */
                if ((bestFlight.getPrice() / bestFlight.getDistance()) > (compareFlight.getPrice() / compareFlight.getDistance())) {
                    bestFlight = compareFlight;
                }
            }
        }
        return bestFlight;
    }

    public static void writeOutData(ArrayList<Flight> allFlights, File outputFile) throws FileNotFoundException {

        /****
         * Write output data to file
         */
        try{
            PrintWriter output = new PrintWriter(outputFile);

            for (int i = 0; i < allFlights.size(); i++) {
                output.println(allFlights.get(i));
            }
            output.close();
        }
        catch (FileNotFoundException ex){
            throw new FileNotFoundException();
        }
    }

}





