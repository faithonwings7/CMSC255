import java.util.Scanner;

public class Palindrome{
	public static void main (String [] args){
	/**************************************************************************
	*Java Program Name: Palindrome.java
	***************************************************************************
	*Project Description: Verifying if output is a palindrome
	___________________________________________________________________________
	*Name: Anne Szarek
	*Version Date: 09/05/2019
	*Course # / Section: CMSC 255 / Section 4
	**************************************************************************/

	Scanner input = new Scanner(System.in);

	int numberChoice;

	/*****************************************************************************************************
	Have user input selection indicating if user or computer is generating 3 digit number
	******************************************************************************************************/

	System.out.println("Enter 1 if you would like to enter a 3-digit number. Enter 2 if you would like to have the computer generate it.");
	numberChoice = input.nextInt();

	/******************************************************************************************************
	If user enters anything outside of 1 and 2, program will return "incorrect input"
	*******************************************************************************************************/

	if (numberChoice != 1 && numberChoice != 2) {
		System.out.println("Incorrect input");
	}
	else {

		int numberEntered = 0;

	/********************************************************************************************************
	If user enters 1 - have user enter 3 digit number, if 2 have system generate random 3 digit number
	*********************************************************************************************************/

		switch (numberChoice) {
			case 1: System.out.println("Enter the 3-digit number:"); 
						numberEntered = input.nextInt(); break;

			case 2: numberEntered = (int)(Math.random() * 900  + 100);
						System.out.println(numberEntered); break;

			default: break;	 
		}

	/*********************************************************************************************************
	Number must be a 3 digit number - so must be between 100 and 999. 
	If so, system will determine if number is or isn't a palindrome. 
	*********************************************************************************************************/

		if (numberEntered > 99 && numberEntered < 1000) {
			int firstNumber = numberEntered / 100;
			int lastNumber = numberEntered % 10;
			if (firstNumber == lastNumber) {
			 	System.out.println(numberEntered + " is a palindrome");
			}
			else {
				System.out.println(numberEntered + " is not a palindrome");
			}
		}
		else {
			System.out.println("Incorrect input");
		}
	}
}}
