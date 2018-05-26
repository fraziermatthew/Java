/* Financials: currency exchange */

import java.util.Scanner;
public class Ex_03_31 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the exchange rate from dollars to RMB: ");
      double exRate = input.nextDouble();
      
      System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
      double convert = input.nextDouble();
      
      if (convert == 0) {
         System.out.print("Enter the dollar amount: ");
         double dollars = input.nextDouble();
         System.out.print("$" + dollars + " is  " + (dollars * exRate) + " yuan");
      }   
      else if (convert == 1) {
         System.out.print("Enter the yuan amount: ");
         double yuan = input.nextDouble();
         System.out.print(yuan + " yuan is $" + (Math.round((yuan / exRate) * 100.0) / 100.0) );
      }
      else
         System.out.print("Incorrect input");
      
   }
}
