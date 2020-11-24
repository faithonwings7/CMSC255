public class Fan {

    final public static int SLOW = 1;
    final public static int MEDIUM = 2;
    final public static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /*
     * Constructor with
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    /*
     * Default constructor
     */

    public Fan(double newSpeed) {
        this(SLOW, false, 5, "blue");
    }

    //need to put in getters and setters for all vars

    public static int getSpeed(){
     return speed;
    }

    public void setSpeed(double newSpeed){
        speed = ()
    }

    /**
     *This method converts the String var to a string description of the fan
     */
    public String toString(boolean on) {
        String var;
        if (on) {
            var = "Fan is " + speed + ", " + color + ", and size" + radius;
            return var;
        }
        else {
            var = "Fan is " + color + ", size" + radius + " and is off";
            return var;
        }
    }
}



