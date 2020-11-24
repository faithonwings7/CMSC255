import java.util.Scanner;

public class Exercise06_07{

  public static void main (String[] args){

      Scanner input = new Scanner(System.in);

      System.out.print("Enter the investment amount: ");
      double investmentAmount = input.nextDouble();
    
      System.out.print("Enter the interest rate (e.g., 9%): ");
      double annualInterestRate = input.nextDouble();
    
      futureInvestmentValue(1000, 0.09, 30);
  }   

  public static double futureInvestmentValue(double investmentAmount, double annualInterestRate, int years){
   
      double result = 0;
   
      System.out.println("The amount invested: " + investmentAmount);
      System.out.println("Annual interest rate: " + annualInterestRate);
      System.out.println("Years Future Value");
   
      for (int i = 1; i <= years; i++){
        double futureInvestmentValue = investmentAmount * Math.pow((1 + (annualInterestRate / 12)),(i * 12));
        System.out.printf(i + " " + "%.3f%n", futureInvestmentValue);
      }
  
      return result;
  }

}