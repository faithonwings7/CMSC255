import java.util.Scanner;

public class Loop2{
	public static void main(String [] args){

		Scanner stdin = new Scanner(System.in);

		
		int n = 0;

		System.out.print("Enter a number between 1 and 10: ");
		n = stdin.nextInt();

		while  (!(n >= 1 && n <= 10)){
		    System.out.println("Enter a number between 1 and 10: ");
		     n = stdin.nextInt();
		}
		System.out.print(n);

	}
}