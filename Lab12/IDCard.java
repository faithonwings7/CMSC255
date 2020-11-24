public class IDCard extends Card {
    private int idNumber;

    IDCard(){
        super("Jane Smith");
        idNumber = 0;
    }

    IDCard(String name, int idNumber){
        super(name);
        this.idNumber = idNumber;
    }

    public String toString() {
        super.toString();
        String result = super.toString() + " ID Number: ";
        result += this.idNumber;
        return result;
    }
}
