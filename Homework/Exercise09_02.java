public class Exercise09_02 {

}

class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(){
        symbol = "*";
        name = "Shaggy";
    }

    double getChangePercent(){
        return previousClosingPrice - currentPrice / currentPrice;
    }
}
