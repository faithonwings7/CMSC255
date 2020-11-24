import java.util.Scanner;

public class Loop9{
	public static void main(String [] args){

		Scanner stdin = new Scanner(System.in);

		int n = 1; 
		int positiveInt2 = 0;
		int positiveInt3 = 0;

		for (n = 0; n <= 200; n++){
		    positiveInt2 = n % 2;
		    positiveInt3 = n % 3;
		    
		    if (positiveInt2 == 0 && positiveInt3 == 0){
		        System.out.print(n + " ");
		        n++;
		    }
		    else {n++;}
		}	

	}

}