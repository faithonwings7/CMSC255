import java.util.Scanner;

public class Loop4{
	public static void main(String [] args){

		Scanner stdin = new Scanner(System.in);

		
		int number = 0;


		System.out.print("Enter a number: ");
		number = stdin.nextInt();

		while (number >= 1){
		    
		    if (number < 1){
		        break;
		    }
		    
		    else if (number > 100){
		      
		      System.out.print(number + " "); 
		    }
		    
		    else {
		       	System.out.print("Enter a number: ");
		        number = stdin.nextInt();
		    }
		}

	}

}