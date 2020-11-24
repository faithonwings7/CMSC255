import java.util.Scanner;

public class UnitConversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    //Ask user to select metric or standard system - I DON"T THINK THIS IS NEEDED? THOUGHTS?****

    //User enter number
        System.out.print("Enter original number to be converted: ");
        double begValue = input.nextDouble();

        //User enter unit
        System.out.print("Select original unit of measure: 1 - millimeter 2 - centimeter  3 - meter  4 - kilometer  5 - inch  6 - foot  7 - yard  8 - mile");
        int begUnit = input.nextInt();
        if (begUnit < 1 || begUnit > 8 ){
            System.out.print("Invalid option");
            //how to loop back to question again?
        }

        //User enter unit to convert to
        System.out.print("Select unit of measure to convert to: 1 - millimeter 2 - centimeter  3 - meter  4 - kilometer  5 - inch  6 - foot  7 - yard  8 - mile");
        int convUnit = input.nextInt();

        if (begUnit < 1 || begUnit > 8 ){
            System.out.print("Invalid option");
            //how to loop back to question again?
        }
        if (begUnit = 1 && convUnit = 1){
            System.out.print(begValue);
        }
        else if (begUnit = 1 && convUnit = 2){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 1 && convUnit = 3){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 1 && convUnit = 4){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 1 && convUnit = 5){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 1 && convUnit = 6){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 1 && convUnit = 7){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 1 && convUnit = 8){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 2 && convUnit = 1){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 2 && convUnit = 2){
            System.out.print(begValue);
        }
        else if (begUnit = 2 && convUnit = 3){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 2 && convUnit = 4){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 2 && convUnit = 5){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 2 && convUnit = 6){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 2 && convUnit = 7){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 2 && convUnit = 8){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 3 && convUnit = 1){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 3 && convUnit = 2){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 3 && convUnit = 3){
            System.out.print(begValue);
        }
        else if (begUnit = 3 && convUnit = 4){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 3 && convUnit = 5){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 3 && convUnit = 6){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 3 && convUnit = 7){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 3 && convUnit = 8){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 4 && convUnit = 1){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 4 && convUnit = 2){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 4 && convUnit = 3){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 4 && convUnit = 4){
            System.out.print(begValue);
        }
        else if (begUnit = 4 && convUnit = 5){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 4 && convUnit = 6){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 4 && convUnit = 7){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 4 && convUnit = 8){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 5 && convUnit = 1){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 5 && convUnit = 2){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 5 && convUnit = 3){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 5 && convUnit = 4){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 5 && convUnit = 5){
            System.out.print(begValue);
        }
        else if (begUnit = 5 && convUnit = 6){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 5 && convUnit = 7){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 5 && convUnit = 8){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 6 && convUnit = 1){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 6 && convUnit = 2){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 6 && convUnit = 3){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 6 && convUnit = 4){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 6 && convUnit = 5){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 6 && convUnit = 6){
            System.out.print(begValue);
        }
        else if (begUnit = 6 && convUnit = 7){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 6 && convUnit = 8){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 7 && convUnit = 1){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 7 && convUnit = 2){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 7 && convUnit = 3){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 7 && convUnit = 4){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 7 && convUnit = 5){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 7 && convUnit = 6){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 7 && convUnit = 7){
            System.out.print(begValue);
        }
        else if (begUnit = 7 && convUnit = 8){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 8 && convUnit = 1){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 8 && convUnit = 2){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 8 && convUnit = 3){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 8 && convUnit = 4){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 8 && convUnit = 5){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 8 && convUnit = 6){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 8 && convUnit = 7){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit = 8 && convUnit = 8){
            System.out.print(begValue);
        }
    }

    public static void units(){

        //create variables for each unit of measure
        double millimeter = 0;
        double centimeter = 0;
        double meter = 0;
        double kilometer = 0;
        double inch = 0;
        double foot = 0;
        double yard = 0;
        double mile = 0;



    }

    /*********************************************************************
     METRIC SYSTEM
     **********************************************************************/

    //millimeter conversions
    public static double miliToCenti(){
        int conversionValue =
    }
    public static double miliToMeter(){

    }
    public static double miliToKilo(){

    }
    public static double miliToInch(){

    }
    public static double miliToFeet(){

    }
    public static double miliToYard(){

    }
    public static double miliToMile(){

    }

    //centimeter conversion
    public static double centiToMilli(){

    }
    public static double centiToMeter(){

    }
    public static double centiToKilo(){

    }
    public static double centiToInch(){

    }
    public static double centiToFeet(){

    }
    public static double centiToYard(){

    }
    public static double centiToMile(){

    }

    //meter conversion
    public static double meterToMilli(){

    }
    public static double meterToCenti(){

    }
    public static double meterToKilo(){

    }
    public static double meterToInch(){

    }
    public static double meterToFeet(){

    }
    public static double meterToYard(){

    }
    public static double meterToMile(){

    }

    //kilo conversion
    public static double kiloToMilli(){

    }

    public static double kiloToCenti(){

    }

    public static double kiloToMeter(){

    }

    public static double kiloToInches(){

    }

    public static double kiloToFeet(){

    }

    public static double kiloToYard(){

    }

    public static double kiloToMile(){

    }

    /******************************************************************
     IMPERIAL SYSTEM
     *******************************************************************/

    //inch conversion
    public static double inchtoMilli(){

    }
    public static double inchToCenti(){

    }
    public static double inchToMeter(){

    }
    public static double inchToKilo(){

    }
    public static double inchToFeet(){

    }
    public static double inchToYard(){

    }
    public static double inchToMile(){

    }

    //feet conversion
    public static double feetToMilli(){

    }
    public static double feetToCenti(){

    }
    public static double feetToMeter(){

    }
    public static double feetToKilo(){

    }
    public static double feetToInch(){

    }

    public static double meterToYard(){

    }
    public static double meterToMile(){

    }


    //yard conversion
    public static double yardToMilli(){

    }

    public static double yardToCenti(){

    }

    public static double yardToMeter(){

    }

    public static double yardToKilo(){

    }

    public static double yardToInch(){

    }

    public static double yardToFeet(){

    }

    public static double yardToMile(){

    }


    //mile conversion
    public static double mileToMilli(){

    }

    public static double mileToCenti(){

    }

    public static double mileToMeter(){

    }

    public static double mileToKilo(){

    }

    public static double mileToInch(){

    }

    public static double mileToFeet(){

    }

    public static double mileToYard(){

    }

}
