import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {

        /****************************************************************************
         * Project 4 = TempConvert
         ****************************************************************************
         * Write a program that converts temp from/to Fahrenheit, Celsius, Kelvin
         *_____________________________________________________
         * Anne Szarek
         * 10/10/19
         * CMSC_255 Section 4
         ****************************************************************************/

        //run processData method
        processData();
    }

    public static void processData() {
        Scanner input = new Scanner(System.in);

        String quit;

        //do while loop to catch quitting program or looping back
        do {

            //Input temp from user
            System.out.println("Enter the temperature to convert: ");
            double temp = input.nextDouble();

            //Input original scale being used from user
            System.out.println("Enter the current scale of the temperature: ");
            input.nextLine();
            String tempScale = input.nextLine();

            //Input scale to convert to from user
            System.out.println("Enter the scale you want to convert the temperature to: ");
            String tempTo = input.nextLine();

            double endTemp = 0;

            //if temp is within range for current scale, run the correct method to calculate ending temp
            boolean accuracy = checkValidity(temp, tempScale);

                if ((accuracy == true && tempScale.equals("Fahrenheit")) && tempTo.equals("Celsius")) {
                    endTemp = convertFahtoCel(temp);
                    System.out.printf("%4.2f %7s %10s %2s %4.2f %7s %6s \n", temp, "degrees", tempScale, "is", endTemp, "degrees", tempTo);
                } else if ((accuracy == true && tempScale.equals("Fahrenheit")) && tempTo.equals("Kelvin")) {
                    endTemp = convertFahtoKel(temp);
                    System.out.printf("%4.2f %7s %10s %2s %4.2f %7s %6s \n", temp, "degrees", tempScale, "is", endTemp, "degrees", tempTo);
                } else if ((accuracy == true && tempScale.equals("Celsius")) && tempTo.equals("Fahrenheit")) {
                    endTemp = convertCeltoFah(temp);
                    System.out.printf("%4.2f %7s %7s %2s %4.2f %7s %6s \n", temp, "degrees", tempScale, "is", endTemp, "degrees", tempTo);
                } else if ((accuracy == true && tempScale.equals("Celsius")) && tempTo.equals("Kelvin")) {
                    endTemp = convertCeltoKel(temp);
                    System.out.printf("%4.2f %7s %7s %2s %4.2f %7s %6s \n", temp, "degrees", tempScale, "is", endTemp, "degrees", tempTo);
                } else if ((accuracy == true && tempScale.equals("Kelvin")) && tempTo.equals("Celsius")) {
                    endTemp = convertKeltoCel(temp);
                    System.out.printf("%4.2f %7s %6s %2s %4.2f %7s %6s \n", temp, "degrees", tempScale, "is", endTemp, "degrees", tempTo);
                } else if ((accuracy == true && tempScale.equals("Kelvin")) && tempTo.equals("Fahrenheit")) {
                    endTemp = convertKeltoFah(temp);
                    System.out.printf("%4.2f %7s %6s %2s %4.2f %7s %6s \n", temp, "degrees", tempScale, "is", endTemp, "degrees", tempTo);
                } else if (accuracy == true && tempScale.equals(tempTo)){
                    System.out.printf("%4.2f %7s %6s %2s %4.2f %7s %6s \n", temp, "degrees", tempScale, "is", temp, "degrees", tempTo);
                }
                else {
                    System.out.println(temp + " degrees " + tempScale + " is not a valid temperature");
                }

            //Does the user want to quit or loop back to convert another number
            System.out.println("Would you like to convert another temperature? Enter quit to exit.");
            quit = input.nextLine();

        } while(!(quit.equals("quit")));
    }


    public static boolean checkValidity(double temp, String tempScale){
        boolean yes = true;
        boolean no = false;

        //final constants
        final double FMIN = -459.40;
        final double FMAX = 1000;
        final double CMIN = -273;
        final double CMAX = 1000;
        final double KMIN = 0;
        final double KMAX = 1000;

        //verifying temp is within range for Fahrenheit scale
        if(tempScale.equals("Fahrenheit") && temp > FMIN && temp < FMAX) {
             return yes;
        }
        //verifying temp is within range for Celsius scale
        else if (tempScale.equals("Celsius") && temp > CMIN && temp < CMAX) {
                return yes;
         }
        //verifying temp is within range for Kelvin scale
        else if ((tempScale.equals("Kelvin")) && temp > KMIN && temp < KMAX){
                return yes;
        }
        else {
            return no;
        }
    }
    //method to convert Fahrenheit to Celsius
    public static double convertFahtoCel(double temp){
        double result;
        double tempConvert = (((temp - 32)*5)/9);
        result = tempConvert;
        return result;
    }
    //method to convert Fahrenheit to Kelvin
    public static double convertFahtoKel(double temp){
        double fahToCel = convertFahtoCel(temp);
        double tempConvert = fahToCel + 273;
        return tempConvert;
    }
    //method to convert Celsius to Fahrenheit
    public static double convertCeltoFah(double temp){
        double tempConvert = temp * (9.0/5) + 32;
        return tempConvert;
    }
    //method to convert Celsius to Kelvin
    public static double convertCeltoKel (double temp){
        double tempConvert = temp + 273;
        return tempConvert;
    }
    //method to convert Kelvin to Celsius
    public static double convertKeltoCel(double temp){
        double tempConvert = temp - 273;
        return tempConvert;
    }
    //method to convert Kelvin to Fahrenheit
    public static double convertKeltoFah(double temp){
        double kelToCel = temp - 273;
        double tempConvert = ((9.0 / 5) * kelToCel) + 32;
        return tempConvert;
    }
}
