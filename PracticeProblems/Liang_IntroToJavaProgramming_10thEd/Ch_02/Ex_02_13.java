/* Financial application: compound value */

import java.util.Scanner;
public class Ex_02_13 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the monthly savings account: ");
      int savings = input.nextInt();
      double interestSav = 1.00417, result2 = 0;
      for (int i = 0; i < 6; i++) 
         result2 = (result2 + savings) * interestSav;
      
      System.out.println("After the sixth month, the account value is $" + result2);
             
   }
}
