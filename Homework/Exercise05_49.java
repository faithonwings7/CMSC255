import java.util.Scanner;

public class Exercise05_49{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		/*Assume letters A, E, I, O, and U as the vowels.

		Write a program that prompts the user to enter a string and 
		displays the number of vowels and consonants in the string.

		*/

		int i = 0;
		int vowelCount = 0;
		int consonantCount = 0;

		System.out.print("Enter a string: ");
		String string = input.nextLine();

		for(i = 0; i < string.length(); i++){
		
			if (Character.isLetter(string.charAt(i))){
				if (Character.toUpperCase(string.charAt(i)) == 'A' ||
					Character.toUpperCase(string.charAt(i)) == 'E' ||
					Character.toUpperCase(string.charAt(i)) == 'I' ||
					Character.toUpperCase(string.charAt(i)) == 'O' ||
					Character.toUpperCase(string.charAt(i)) == 'U' ){


					vowelCount++;
				}
				else {
					consonantCount++;
				}

			}		
		}

		System.out.println("The number of vowels is " + vowelCount);
		System.out.println("The number of consonants is " + consonantCount);

	}
}