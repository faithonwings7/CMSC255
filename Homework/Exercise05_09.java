import java.util.Scanner;

public class Exercise05_09{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		double topScore = 0;
		String topName = "";
		double secondScore = 0;
		String secondName = "";


			System.out.print("Enter the number of students: ");
			int students = input.nextInt();
		
		for (int i = 0; i < students; i++){

			System.out.print("Enter a student name: ");
			String studentName = input.next();

			System.out.print("Enter a student score: ");
			double studentScore = input.nextDouble();
	
			if (studentScore > topScore){
				if (topName != ""){
					secondScore = topScore;
					secondName = topName;
				}

				topScore = studentScore;
				topName = studentName;
			}
			
			else if (studentScore > secondScore){
				secondScore = studentScore;
				secondName = studentName;
			}
			
		}

		System.out.println("Top two students: ");
		System.out.println(topName + "'s score is " + topScore);
		System.out.println(secondName + "'s score is " + secondScore);

	}
}