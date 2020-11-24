import java.util.Scanner;

public class Loop7{
	public static void main(String [] args){

		Scanner stdin = new Scanner(System.in);

		int multiples = 0;
		int n = 0;

		for (n = 0; n < 175; n++){
		    multiples = n * 5;
		    System.out.print(multiples);
		}

	}

}