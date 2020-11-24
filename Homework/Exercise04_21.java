import java.util.Scanner;
public class Exercise04_21{
    public static void main (String [] args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a SSN (format DDD-DD-DDDD): ");
    String fullSSN = input.next();

    if (fullSSN.length() == 11){

   		String ssn1 = fullSSN.substring(0,3);
   			System.out.println("ssn1 = " + ssn1);
   		String ssn2 = fullSSN.substring(4,6);
   			System.out.println("ssn2 = " + ssn2);
   		String ssn3 = fullSSN.substring(7,11);
   			System.out.println("ssn3 = " + ssn3);
   		System.out.print(fullSSN + " is a valid social security number");
   
    }
    else {
    	System.out.print(fullSSN + " is an invalid social security number");
    }
    }
}