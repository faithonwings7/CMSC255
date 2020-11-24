package sample;

public class UnitConversion {

    private double begValue;
    private int beginUnit;
    private int endUnit;
    private double endValue;
    private String begUnitString;
    private String endUnitString;

    public UnitConversion() {

        this.begValue = 0;
        this.beginUnit = 1;
        this.endUnit = 1;

    }

    public UnitConversion(double begValue, int beginUnit, int endUnit) {

        this.begValue = begValue;
        this.beginUnit = beginUnit;
        this.endUnit = endUnit;

    }

    public void setBegValue(double begValue) {
        this.begValue = begValue;
    }

    public void setBeginUnit(int beginUnit) {
        this.beginUnit = beginUnit;
    }

    public void setEndUnit(int endUnit) {
        this.endUnit = endUnit;
    }

    public double getBegValue() {
        return begValue;
    }

    public int getBeginUnit() {
        return beginUnit;
    }

    public int getEndUnit() {
        return endUnit;
    }

    public String toString() {

        switch (this.beginUnit) {
            case 1:
                begUnitString = "millimeter(s)";
            case 2:
                begUnitString = "centimeter(s)";
            case 3:
                begUnitString = "meter(s)";
            case 4:
                begUnitString = "kilometer(s)";
            case 5:
                begUnitString = "inch(s)";
            case 6:
                begUnitString = "feet(s)";
            case 7:
                begUnitString = "yard(s)";
            case 8:
                begUnitString = "mile(s)";
        }

        switch (this.endUnit) {
            case 1:
                endUnitString = "millimeter(s)";
            case 2:
                endUnitString = "centimeter(s)";
            case 3:
                endUnitString = "meter(s)";
            case 4:
                endUnitString = "kilometer(s)";
            case 5:
                endUnitString = "inch(s)";
            case 6:
                endUnitString = "feet(s)";
            case 7:
                endUnitString = "yard(s)";
            case 8:
                endUnitString = "mile(s)";
        }

        endValue = convert(this.begValue, this.beginUnit, this.endUnit);

        return this.begValue + " " + begUnitString + "\n" + endValue + " " + endUnitString;
    }

    private static double convert(double begValue, int begUnit, int endUnit) {

        double endValue = 0;

        //Conversions starting with millimeters
        if (begUnit == 1){
            switch(endUnit){
                case 1:
                    endValue = begUnit;
                    return endValue;
                case 2:
                    endValue = miliToCenti(begValue);
                    return endValue;
                case 3:
                    endValue = miliToMeter(begValue);
                    return endValue;
                case 4:
                    endValue = miliToKilo(begValue);
                    return endValue;
                case 5:
                    endValue = miliToInch(begValue);
                    return endValue;
                case 6:
                    endValue = miliToFeet(begValue);
                    return endValue;
                case 7:
                    endValue = miliToYard(begValue);
                    return endValue;
                case 8:
                    endValue = miliToMile(begValue);
                    return endValue;
            }
        }

        //Conversions starting with centimeters
        if (begUnit == 2) {
            switch (endUnit) {

                case 1:
                    endValue = centiToMilli(begValue);
                    return endValue;
                case 2:
                    endValue = begUnit;
                    return endValue;
                case 3:
                    endValue = centiToMeter(begValue);
                    return endValue;
                case 4:
                    endValue = centiToKilo(begValue);
                    return endValue;
                case 5:
                    endValue = centiToInch(begValue);
                    return endValue;
                case 6:
                    endValue = centiToFeet(begValue);
                    return endValue;
                case 7:
                    endValue = centiToYard(begValue);
                    return endValue;
                case 8:
                    endValue = centiToMile(begValue);
                    return endValue;
            }
        }

        //Conversions starting with meters
        if (begUnit == 3) {
            switch (endUnit) {
                case 1:
                    endValue = meterToMilli(begValue);
                    return endValue;
                case 2:
                    endValue = meterToCenti(begValue);
                    return endValue;
                case 3:
                    endValue = begUnit;
                    return endValue;
                case 4:
                    endValue = meterToKilo(begValue);
                    return endValue;
                case 5:
                    endValue = meterToInch(begValue);
                    return endValue;
                case 6:
                    endValue = meterToFeet(begValue);
                    return endValue;
                case 7:
                    endValue = meterToYard(begValue);
                    return endValue;
                case 8:
                    endValue = meterToMile(begValue);
                    return endValue;
            }
        }

        //Conversions starting with kilometers
        if (begUnit == 4) {
            switch (endUnit) {
                case 1:
                    endValue = kiloToMilli(begValue);
                    return endValue;
                case 2:
                    endValue = kiloToCenti(begValue);
                    return endValue;
                case 3:
                    endValue = kiloToMeter(begValue);
                    return endValue;
                case 4:
                    endValue = begUnit;
                    return endValue;
                case 5:
                    endValue = kiloToInches(begValue);
                    return endValue;
                case 6:
                    endValue = kiloToFeet(begValue);
                    return endValue;
                case 7:
                    endValue = kiloToYard(begValue);
                    return endValue;
                case 8:
                    endValue = kiloToMile(begValue);
                    return endValue;

            }
        }

        //Conversions starting with inch
        if (begUnit == 5) {
            switch (endUnit) {
                case 1:
                    endValue = inchtoMilli(begValue);
                    return endValue;
                case 2:
                    endValue = inchToCenti(begValue);
                    return endValue;
                case 3:
                    endValue = inchToMeter(begValue);
                    return endValue;
                case 4:
                    endValue = inchToKilo(begValue);
                    return endValue;
                case 5:
                    endValue = begUnit;
                    return endValue;
                case 6:
                    endValue = inchToFeet(begValue);
                    return endValue;
                case 7:
                    endValue = inchToYard(begValue);
                    return endValue;
                case 8:
                    endValue = inchToMile(begValue);
                    return endValue;

            }
        }

        //Conversions starting with feet
        if (begUnit == 6) {
            switch (endUnit) {
                case 1:
                    endValue = feetToMilli(begValue);
                    return endValue;
                case 2:
                    endValue = feetToCenti(begValue);
                    return endValue;
                case 3:
                    endValue = feetToMeter(begValue);
                    return endValue;
                case 4:
                    endValue = feetToKilo(begValue);
                    return endValue;
                case 5:
                    endValue = feetToInch(begValue);
                    return endValue;
                case 6:
                    endValue = begUnit;
                    return endValue;
                case 7:
                    endValue = feetToYard(begValue);
                    return endValue;
                case 8:
                    endValue = feetToMile(begValue);
                    return endValue;

            }
        }

        //Conversions starting with yard
        if (begUnit == 7) {
            switch (endUnit) {
                case 1:
                    endValue = yardToMilli(begValue);
                    return endValue;
                case 2:
                    endValue = yardToCenti(begValue);
                    return endValue;
                case 3:
                    endValue = yardToMeter(begValue);
                    return endValue;
                case 4:
                    endValue = yardToKilo(begValue);
                    return endValue;
                case 5:
                    endValue = yardToInch(begValue);
                    return endValue;
                case 6:
                    endValue = yardToFeet(begValue);
                    return endValue;
                case 7:
                    endValue = begUnit;
                    return endValue;
                case 8:
                    endValue = yardToMile(begValue);
                    return endValue;

            }
        }

        //Conversions starting with mile
        if (begUnit == 8) {
            switch (endUnit) {
                case 1:
                    endValue = mileToMilli(begValue);
                    return endValue;
                case 2:
                    endValue = mileToCenti(begValue);
                    return endValue;
                case 3:
                    endValue = mileToMeter(begValue);
                    return endValue;
                case 4:
                    endValue = mileToKilo(begValue);
                    return endValue;
                case 5:
                    endValue = mileToInch(begValue);
                    return endValue;
                case 6:
                    endValue = mileToFeet(begValue);
                    return endValue;
                case 7:
                    endValue = mileToYard(begValue);
                    return endValue;
                case 8:
                    endValue = begUnit;
                    return endValue;
            }
        }
        return endValue;
    }

   /* NOT SURE THIS IS NEEDED?
    *
    * **** public static void units(){
    * //create variables for each unit of measure
    *   double millimeter = 0;
    *   double centimeter = 0;
    *   double meter = 0;
    *   double kilometer = 0;
    *   double inch = 0;
    *   double foot = 0;
    *   double yard = 0;
    *   double mile = 0;
    }*******/

    /*********************************************************************
     METRIC SYSTEM
     **********************************************************************/

    //millimeter conversions
    private static double miliToCenti(double begValue){
        double endValue = begValue / 10;
        return endValue;
    }
    private static double miliToMeter(double begValue){
        double endValue = begValue /1000;
        return endValue;
    }
    private static double miliToKilo(double begValue){
        double endValue = begValue / 10000;
        return endValue;
    }
    private static double miliToInch(double begValue){
        double endValue = begValue / 25.4;
        return endValue;
    }
    private static double miliToFeet(double begValue){
        double endValue = begValue / 304.8;
        return endValue;
    }
    private static double miliToYard(double begValue){
        double endValue = begValue / 914.4;
        return endValue;
    }
    private static double miliToMile(double begValue){
        double endValue = begValue / 1069000000;
        return endValue;
    }

    //centimeter conversion
    private static double centiToMilli(double begValue){
        double endValue = begValue * 10;
        return endValue;
    }
    private static double centiToMeter(double begValue){
        double endValue = begValue * .10;
        return endValue;
    }
    private static double centiToKilo(double begValue){
        double endValue = begValue * .01;
        return endValue;
    }
    private static double centiToInch(double begValue){
        double endValue = begValue / 2.54;
        return endValue;
    }
    private static double centiToFeet(double begValue){
        double endValue = begValue / 30.48;
        return endValue;
    }
    private static double centiToYard(double begValue){
        double endValue = begValue / 91.44;
        return endValue;
    }
    private static double centiToMile(double begValue){
        double endValue = begValue / 160934.4;
        return endValue;
    }

    //meter conversion
    private static double meterToMilli(double begValue){
        double endValue = begValue * 1000;
        return endValue;
    }
    private static double meterToCenti(double begValue){
        double endValue = begValue * 100;
        return endValue;
    }
    private static double meterToKilo(double begValue){
        double endValue = begValue / 1000;
        return endValue;
    }
    private static double meterToInch(double begValue){
        double endValue = begValue * 39.37;
        return endValue;
    }
    private static double meterToFeet(double begValue){
        double endValue = begValue * 3.218;
        return endValue;
    }
    private static double meterToYard(double begValue){
        double endValue = begValue * 1.049;
        return endValue;
    }
    private static double meterToMile(double begValue){
        double endValue = begValue / 1609.344;
        return endValue;
    }

    //kilo conversion
    private static double kiloToMilli(double begValue){
        double endValue = begValue * 1000000;
        return endValue;
    }

    private static double kiloToCenti(double begValue){
        double endValue = begValue * 100000;
        return endValue;
    }

    private static double kiloToMeter(double begValue){
        double endValue = begValue / 1000;
        return endValue;
    }

    private static double kiloToInches(double begValue){
        double endValue = begValue * 39370.079;
        return endValue;
    }

    private static double kiloToFeet(double begValue){
        double endValue = begValue * 3280.84;
        return endValue;
    }

    private static double kiloToYard(double begValue){
        double endValue = begValue * 1093.613;
        return endValue;
    }

    private static double kiloToMile(double begValue){
        double endValue = begValue / 1.609;
        return endValue;
    }

    /******************************************************************
     IMPERIAL SYSTEM
     *******************************************************************/

    //inch conversion
    private static double inchtoMilli(double begValue){
        double endValue = begValue * 25.4;
        return endValue;
    }
    private static double inchToCenti(double begValue){
        double endValue = begValue * 2.54;
        return endValue;
    }
    private static double inchToMeter(double begValue){
        double endValue = begValue /39.37;
        return endValue;
    }
    private static double inchToKilo(double begValue){
        double endValue = begValue /39370.079;
        return endValue;
    }
    private static double inchToFeet(double begValue){
        double endValue = begValue / 12;
        return endValue;
    }
    private static double inchToYard(double begValue){
        double endValue = begValue / 36;
        return endValue;
    }
    private static double inchToMile(double begValue){
        double endValue = begValue / 13360;
        return endValue;
    }

    //feet conversion
    private static double feetToMilli(double begValue){
        double endValue = begValue * 304.8;
        return endValue;
    }
    private static double feetToCenti(double begValue){
        double endValue = begValue * 30.48;
        return endValue;
    }
    private static double feetToMeter(double begValue){
        double endValue = begValue / .3048;
        return endValue;
    }
    private static double feetToKilo(double begValue){
        double endValue = begValue / 3280.84;
        return endValue;
    }
    private static double feetToInch(double begValue){
        double endValue = begValue * 12;
        return endValue;
    }

    private static double feetToYard(double begValue){
        double endValue = begValue / 3;
        return endValue;
    }
    private static double feetToMile(double begValue){
        double endValue = begValue / 5280;
        return endValue;
    }


    //yard conversion
    private static double yardToMilli(double begValue){
        double endValue = begValue * 914.4;
        return endValue;
    }

    private static double yardToCenti(double begValue){
        double endValue = begValue * 91.44;
        return endValue;
    }

    private static double yardToMeter(double begValue){
        double endValue = begValue / 1.094;
        return endValue;
    }

    private static double yardToKilo(double begValue){
        double endValue = begValue / 1093.613;
        return endValue;
    }

    private static double yardToInch(double begValue){
        double endValue = begValue * 36;
        return endValue;
    }

    private static double yardToFeet(double begValue){
        double endValue = begValue * 3;
        return endValue;
    }

    private static double yardToMile(double begValue){
        double endValue = begValue / 1760;
        return endValue;
    }


    //mile conversion
    private static double mileToMilli(double begValue){
        double endValue = begValue * 1609000000;
        return endValue;
    }

    private static double mileToCenti(double begValue){
        double endValue = begValue * 160934.4;
        return endValue;
    }

    private static double mileToMeter(double begValue){
        double endValue = begValue * 1609.344;
        return endValue;
    }

    private static double mileToKilo(double begValue){
        double endValue = begValue * 1.60934;
        return endValue;
    }

    private static double mileToInch(double begValue){
        double endValue = begValue * 63360;
        return endValue;
    }

    private static double mileToFeet(double begValue){
        double endValue = begValue * 5280;
        return endValue;
    }

    private static double mileToYard(double begValue){
        double endValue = begValue * 1760;
        return endValue;
    }



}
