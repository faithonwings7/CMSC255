import java.util.Scanner;
public class Exercise04_17{
    public static void main (String [] args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    
    System.out.print("Enter a month: ");
     String month = input.next();
     char monthFirstLetter = month.charAt(0);
   
    
    if (Character.isUpperCase(monthFirstLetter)){
 
        int daysInJan = 31;
        int daysInFeb = 28;
        int daysInMar = 31;
        int daysInApr = 30;
        int daysInMay = 31;
        int daysInJun = 30;
        int daysInJul = 31;
        int daysInAug = 31;
        int daysInSep = 30;
        int daysInOct = 30;
        int daysInNov = 30;
        int daysInDec = 31;
              
        if (year % 4 == 0 && monthFirstLetter == 'F'){
          daysInFeb = 29;
        } 

        switch(month){
            case "Jan" : System.out.print(month + " " + year + " has " + daysInJan + " days "); break;
            case "Feb" : System.out.print(month + " " + year + " has " + daysInFeb + " days "); break;
            case "Mar" : System.out.print(month + " " + year + " has " + daysInMar + " days "); break;
            case "Apr" : System.out.print(month + " " + year + " has " + daysInApr + " days "); break;
            case "May" : System.out.print(month + " " + year + " has " + daysInMay + " days "); break;
            case "Jun" : System.out.print(month + " " + year + " has " + daysInJun + " days "); break;
            case "Jul" : System.out.print(month + " " + year + " has " + daysInJul + " days "); break;
            case "Aug" : System.out.print(month + " " + year + " has " + daysInAug + " days "); break;
            case "Sep" : System.out.print(month + " " + year + " has " + daysInSep + " days "); break;
            case "Oct" : System.out.print(month + " " + year + " has " + daysInOct + " days "); break;
            case "Nov" : System.out.print(month + " " + year + " has " + daysInNov + " days "); break;
            case "Dec" : System.out.print(month + " " + year + " has " + daysInDec + " days "); break;
        }
    }
    else{
        System.out.print(month + " is not a correct month name");
    }
    }
}