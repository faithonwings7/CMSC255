import java.util.Arrays;

public class Array {
    public static void main (String[] args){

        String[] tokens = args[0].split(",");
        System.out.println(Arrays.toString(tokens));

        String[] customerName = new String[7];

        for(int i = 0; i < tokens.length; i++){
            customerName[i] = tokens[i];
        }

        for(String a: customerName){
            System.out.println(a);

        }
        System.out.println();

        customerName[3] = customerName[5];
        customerName[4] = customerName[6];
        customerName[3] = "Rick";
        customerName[4] = "Jessica";
        customerName[5] = "Summer";
        customerName[6] = "Morty";

        for(String a: customerName){
            System.out.println(a);

        }
        System.out.println();

        for(int i = 0; i < customerName.length; i++){
            if (customerName[i] == "Rick"){
                customerName[i] = " ";
            }
        }

        customerName[6] = null;

        for(int j = 4; j < customerName.length; j++) {
            customerName[j - 1] = customerName[j];
        }

        for(String a: customerName){
            System.out.println(a);
        }
        System.out.println("");

        String temp = customerName[0];

        for(int i = 1; i < customerName.length; i++){
            customerName[i - 1] = customerName[i];
        }

        customerName[customerName.length - 1] = temp;
    }
}
