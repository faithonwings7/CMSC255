public class Card {

    /**
     * Names: Anne Szarek and Bonna Mesfin
     * CMSC 255 Lab 11
     */

    private String name;

    Card(){
        name = "";
    }

    Card(String name){
        this.name = name;
    }

    public String toString(){
        String result = "Card Holder: " + name;
        return result;
    }

}



