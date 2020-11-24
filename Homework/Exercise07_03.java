import java.util.Scanner;

public class Exercise07_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[100];

        System.out.print("Enter the integers between 1 and 100: ");
        int temp = input.nextInt();
        while (temp != 0) {
            if (temp <= 100 && temp >= 1)
                numbers[temp - 1]++;
            temp = input.nextInt();
        }

        for (int i = 0; i < 100; i++) {

            if (numbers[i] > 0) {
                System.out.println(i + 1 + " occurs " + numbers[i] + ((numbers[i] == 1) ? " time" : " times"));
            }
        }
    }
}
