import java.util.ArrayList;

public class Customer {

    /**
     * Defining instance variables
     */
    private String firstName = null;
    private String lastName = null;
    private String phone = null;
    private String email = null;
    private ArrayList<IceCream> iceCream = new ArrayList<IceCream>();


    /**
     * Default Customer constructor
     */
    public Customer(){

    }

    /**
     * Construct Customer object (passing in params)
     */
    public Customer(String lastName, String firstName, String phone, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    /**
     * Accessors and mutators for all instance vars
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void orderIceCream(IceCream iceCream) {
        this.iceCream.add(iceCream);
    }

    public int getNumIceCream() {
        int numIceCream = this.iceCream.size();
        return numIceCream;
    }

    public ArrayList<IceCream> getIceCream() {
        return iceCream;
    }

    /**
     * Final toString
     */
    public String toString() {
        String result = this.firstName + " " + this.lastName + "\n" + this.phone + "\n" + this.email + "\n" + "Ice Cream Order:" + "\n";
        for (int i = 0; i < this.iceCream.size(); i++ ) {
            result += this.iceCream.get(i).toString();
        }
        return result;
    }
}

