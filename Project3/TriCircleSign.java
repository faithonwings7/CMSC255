import java.util.Scanner;

public class TriCircleSign{
	public static void main(String [] args){

		/****************************************************************************
		* Project 3 = TriCircleSign
		****************************************************************************
		* Write a program called TriCircleSign.java that determines the cost of a custom-made
		sign that is in the shape of a circle that surrounds a given equilateral triangle.
		*_____________________________________________________
		* Anne Szarek
		* 9/26/19
		* CMSC_255 Section 4
		****************************************************************************/

		Scanner input = new Scanner(System.in);
		String exitProgram = "";

		do{
			//Have user enter side length of triangle
			System.out.println("Enter the length of a side of your triangle:");
			double sideLength = input.nextDouble();

			//Have user enter output for sign
			System.out.println("Enter the string you would like on your sign:");
			input.nextLine();
			String signString = input.nextLine();

			//Calculate s
			double s = ((3 * sideLength) / 2);

			//Calculate radius
			double radius = ((Math.pow(sideLength, 3)) / (4 * (Math.sqrt(s * (Math.pow((s - sideLength),3))))));

			//Calculate area
			double area = Math.PI * (Math.pow(radius, 2));

			//Calculate signLength
			double stringLength = (double)(signString.length());

			//Calculate number of spaces in signString
			int l = 0;
			int signStringLetters = 0;
		

			for (l = 0; l < stringLength; l++){


				if (!(Character.isWhitespace(signString.charAt(l)))){
					signStringLetters++;

				}
			}	

			//Calculate signCost
			double areaCost = (2.35 * area);
			double letterCost = (1.45 * signStringLetters);

			double signCost = (areaCost + letterCost);

			//Display signCost
			System.out.printf("$%4.2f", signCost);

			//Display if user whats to continue or quit program - loop?
			System.out.println("\nWould you like to create another sign? Enter quit to exit.");
			exitProgram = input.nextLine().trim();
		}

		while (!exitProgram.equals("quit"));

	}
}
