public class DriversLicense extends IDCard {
    private int expirationYear;
    private Month expirationMonth;

    DriversLicense(){
        super();
        expirationYear = 1969;
        expirationMonth = Month.JANUARY;
    }

    DriversLicense(String name, int idNumber, int expirationYear, Month expirationMonth){
        super(name, idNumber);
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
    }

    public String toString() {
        super.toString();
        String result = super.toString() + " Expiration Month & Year: ";
        result += this.expirationMonth + " ";
        result += this.expirationYear;
        return result;
    }


}
