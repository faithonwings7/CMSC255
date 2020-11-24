import java.util.Scanner;

public class Exercise05_01{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		int positives = 0;
		int negatives = 0;
		double n = 0;
		double total = 0;
		double average = 0;

		System.out.print("Enter an integer, the input ends if it is 0: ");
		int integer = input.nextInt();

		if (integer == 0) {
			System.out.print("No numbers are entered except 0");
		}

		else {

			 while (integer != 0){

				if (integer > 0){
					positives++;
					n++;
					total += integer;
					average = total / n;
					
				}

				else{
					negatives++;
					n++;
					total += integer;
					average = total / n;
					
				}

				System.out.print("Enter an integer, the input ends if it is 0: ");
				integer = input.nextInt();
			}	
			
		}	


		System.out.println("The number of positives is " + positives);
		System.out.println("The number of negatives is " + negatives);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);

	}
}