import java.util.Scanner;

public class Loop8{
	public static void main(String [] args){

		Scanner stdin = new Scanner(System.in);

		int n;
		int evenInteger = 0;

		for (n = 80; n >= 20; n--){
			evenInteger = n % 2;

		    if (evenInteger == 0){
		        System.out.print(n + " ");
		        n--;
		    }
		    else {n--;}
		}

	}

}