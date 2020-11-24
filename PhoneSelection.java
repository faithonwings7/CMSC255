import java.util.Scanner;
public class PhoneSelection{
	public static void main (String [] args){

		/***************************************************************************************************************
		Anne Szarek and Mergen Nyamsuren
		Section 4
		**************************************************************************************************************/


		Scanner input = new Scanner(System.in);

		System.out.println("Enter a single letter, and I will tell you what the corresponding digit is on the telephone");
		char letter = input.next().charAt(0);

		letter = Character.toUpperCase(letter);

		int number = 0;


		if(letter == 'A' || letter == 'B' || letter == 'C'){
			number = 2;
		}
		else if(letter == 'D' || letter == 'E' || letter == 'F'){
			number = 3;
		}
		else if(letter == 'G' || letter == 'H' || letter == 'I'){
			number = 4;
		}
		else if(letter == 'J' || letter == 'K' || letter == 'L'){
			number = 5;
		}
		else if(letter == 'M' || letter == 'N' || letter == 'O'){
			number = 6;
		}
		else if(letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S'){
			number = 7;
		}
		else if(letter == 'T' || letter == 'U' || letter == 'V'){
			number = 8;
		}
		else if(letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z'){
			number = 9;
		}
		else{
				System.out.print("There is no matching digit for this input.");
		}
		System.out.println	("The digit " + number + " corresponds to the letter " + letter + " on the telephone.");

		}

	}
