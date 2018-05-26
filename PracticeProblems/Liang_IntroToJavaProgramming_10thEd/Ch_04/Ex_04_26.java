/* Financial application: monetary units */

import java.util.Scanner;
public class Ex_04_26 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter an amount in double, for example 1156: ");
      String amt 	   = input.nextLine();
      int remainder  = Integer.parseInt( amt.substring(0, amt.indexOf('.') ) + 
                       amt.substring(amt.indexOf('.') + 1, amt.length()) );
      int Dollars 	= remainder / 100;
      remainder 		= remainder % 100;
      int Quarters 	= remainder / 25;
      remainder 		= remainder % 25;
      int Dimes 		= remainder / 10;
      remainder 		= remainder % 10;
      int Nickels 	= remainder / 5;
      remainder 		= remainder % 5;
      int Pennies		= remainder;
      
      System.out.print("Your amount consists of ");
      
      if (Dollars == 1)
         System.out.print(Dollars + " dollar, ");
      else
         System.out.print(Dollars + " dollars, ");
      if (Quarters == 1)
         System.out.print(Quarters + " quarter, ");
      else
         System.out.print(Quarters + " quarters, ");
      if (Dimes == 1)
         System.out.print(Dimes + " dime, ");
      else
         System.out.print(Dimes + " dimes, ");
      if (Nickels == 1)
         System.out.print(Nickels + " nickel, and ");
      else
         System.out.print(Nickels + " nickels, and ");
      if (Pennies == 1)
         System.out.print(Pennies + " penny");
      else
         System.out.print(Pennies + " pennies");
                       
   }
}
