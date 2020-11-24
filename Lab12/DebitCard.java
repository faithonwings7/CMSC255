public class DebitCard extends Card {



    private int cardNumber;
    private int pin;

    DebitCard(){
        super("Jane Doe");
        cardNumber = 00000000;
        pin = 0;
    }

    DebitCard(String name, int cardNumber, int pin){
        super(name);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public String toString() {
        super.toString();
        String result = super.toString() + " Card Number: ";
                result += this.cardNumber;
                return result;
    }
}