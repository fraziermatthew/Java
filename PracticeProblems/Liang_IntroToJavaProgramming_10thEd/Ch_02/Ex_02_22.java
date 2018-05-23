/* Financial application: monetary units */

import java.util.Scanner;
public class Ex_02_22 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter an amount in integer, for example 1156: ");
      int remainder 	= input.nextInt();
      int Dollars 	= remainder / 100;
      remainder 		= remainder % 100;
      int Quarters 	= remainder / 25;
      remainder 		= remainder % 25;
      int Dimes 		= remainder / 10;
      remainder 		= remainder % 10;
      int Nickels 	= remainder / 5;
      remainder 		= remainder % 5;
      int Pennies		= remainder;
      System.out.println("Your amount consists of " + Dollars + " dollars, " +
         Quarters + " quarters, " + Dimes + " dimes, " + Nickels + " nickels, " + 
         Pennies + " pennies"); 
                       
   }
}
