/* Financial application: calculate future investment value */

import java.util.Scanner;
public class Ex_02_21 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter investment amount: ");
      double 	inv = input.nextDouble();
      System.out.println("Enter annual interest rate in percentage: ");
      double 	annIntRate = (input.nextDouble() / 100) + 1;
      System.out.println("Enter number of years: ");
      double 	numOfYears = input.nextDouble();
      double 	futureInv = inv * Math.pow(annIntRate, numOfYears*12);
      System.out.printf("Accumulated value is $%,.2f%n", futureInv);
               
   }
}
