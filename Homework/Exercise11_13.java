import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();


        System.out.print("Enter 10 integers: ");
        for (int a = 0; a <10; a++ ){
            list.add(input.nextInt());
        }


        //run method
        removeDuplicate(list);

        System.out.print("The  distinct integers are ");
        for (int c = 0; c < list.size(); c++){
            System.out.print(list.get(c) + " ");
        }

        System.out.println();

    }

    public static void removeDuplicate(ArrayList<Integer> list){

        ArrayList<Integer> listCompare = new ArrayList<Integer>();

        for (int a = 0; a < list.size(); a++){
                if (!listCompare.contains(list.get(a))) {
                    list.add(list.get(a));
                }
            }

        list.clear();
        list.addAll(listCompare);

        }
    }




