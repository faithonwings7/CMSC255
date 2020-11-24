import java.util.Scanner;

public class Exercise05_47{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		int i = 0;


		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String twelveDigits = input.nextLine();

		if (twelveDigits.length() != 12){
			System.out.print(twelveDigits + " is Invalid input");
			System.exit(0);
		}
		
		int checkSum = 0;


		for (i = 0; i < twelveDigits.length(); i++){

			if ((i + 1) % 2 == 0) {
                checkSum +=  (twelveDigits.charAt(i) - '0') * 3;

            } else {
                checkSum  += twelveDigits.charAt(i) - '0';
            }
        }
        checkSum %= 10;
        checkSum = 10 - checkSum;
        if (checkSum == 10) twelveDigits += "0";
        else  twelveDigits += checkSum;

        System.out.println("The ISBN-13 number is " + twelveDigits);	

		}
}