import java.util.Scanner;

public class Loop7{
	public static void main(String [] args){

		Scanner stdin = new Scanner(System.in);

			int multiples = 0;
			int n;

			for (n = 1; n < 35; n++){
			    multiples = n * 5;
			    System.out.print(multiples + " ");
			}

	}

}