import java.util.Scanner;
public class MiddleString { 
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

/*********************************************************************
Test case1 = car   ill   ice
Test case2 = ace   sun   bin
Test case3 = bun   tin   pin
********************************************************************/

	System.out.println("Please enter three Strings");
	String str1 = input.nextLine();
	String str2 = input.nextLine();
	String str3 = input.nextLine();

	if ((str1.compareTo(str2) <= 0) && (str2.compareTo(str3) <= 0)){
			System.out.println(str2);
		}
		else if ((str1.compareTo(str3) <= 0) && (str3.compareTo(str2) <= 0)){
			System.out.println(str3);
		}

		else if ((str2.compareTo(str1) <= 0) && (str1.compareTo(str3) <= 0)){
			System.out.println(str1);
		}	
		else if ((str2.compareTo(str3) <= 0) && (str3.compareTo(str1) <= 0)){
			System.out.println(str3);
		}	
		else if ((str3.compareTo(str1) <= 0) && (str1.compareTo(str2) <= 0)){
			System.out.println(str1);
		}
		else if ((str3.compareTo(str2) <= 0) && (str2.compareTo(str1) <= 0)){
			System.out.println(str2);
		}	

	}
}
