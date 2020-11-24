import java.util.Scanner;

public class Exercise07_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] ten = new int[10];
        int num;
        int count = 0;

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < ten.length; i++) {
            num = input.nextInt();

            if (validity(ten, num)) {
                ten[count] = num;
                count++;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are ");
        for (int j = 0; j < ten.length; j++) {
            if (ten[j] > 0) {
                System.out.print(" " + ten[j]);
            }
        }
        System.out.println();
    }

    public static boolean validity(int[] ten, int num) {
        for (int j = 0; j < ten.length; j++) {
            if (num == ten[j]) {
                return false;
            }
        }
        return true;
    }


}






