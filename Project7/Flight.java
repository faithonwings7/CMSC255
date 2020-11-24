public class Flight {
    private String year = "";
    private String startCity = "";
    private String endCity = "";
    private double price = 0.0;
    private int distance = 0;

    public Flight(){
        /****
         * Defailt constructor
         */
        year = "1970";
        startCity = "Boston";
        endCity = "Richmond";
        price = 40.0;
        distance = 900;
    }

    public Flight(String year, String startCity, String endCity, double price,
                  int distance){
        /****
         * Parameterized constructor
         */
        this.year = year;
        this.startCity = startCity;
        this.endCity = endCity;
        this.price = price;
        this.distance = distance;
    }

    public void setYear(String year) {
        /****
         * Setter for year
         */
        this.year = year;
    }

    public void setStartCity(String startCity) {
        /****
         * Setter for startCirt
         */
        this.startCity = startCity;
    }

    public void setEndCity(String endCity) {
        /****
         * Setter for endCity
         */
        this.endCity = endCity;
    }

    public void setPrice(double price) {
        /****
         * Setter for price
         */
        this.price = price;
    }

    public void setDistance(int distance) {
        /****
         * Setter for distance
         */
        this.distance = distance;
    }

    public String getYear() {
        /****
         * Getter for year
         */
        return year;
    }

    public String getStartCity() {
        /****
         * Getter for startCity
         */
        return startCity;
    }

    public String getEndCity() {
        /****
         * Getter for endCity
         */
        return endCity;
    }

    public double getPrice() {
        /****
         * Getter for price
         */
        return price;
    }

    public int getDistance() {
        /****
         * Getter for distance
         */
        return distance;
    }

    public String toString() {
        /****
         * toString method
         */
        String result = this.year + " " + this.startCity + " " + this.endCity + " " + this.price + " " + this.distance;

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        /****
         * equals method
         */

        if (obj instanceof Flight) {
            Flight p = (Flight) obj;

            return this.year.equals(p.year) && this.startCity.equals(p.startCity) && this.endCity.equals(p.endCity)
                    && this.price == p.price && this.distance == p.distance;
        }
        return false;

    }
}
