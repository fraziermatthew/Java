/* Decimal to hex */

import java.util.Scanner;
public class Ex_04_11 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a decimal value (0 to 15): ");
      int d = input.nextInt();
      String s = Integer.toHexString(d);
      
      if (d > 15 || d < 0)
         System.out.print(d + " is an invalid input ");
      else
         System.out.print("The hex value is " + s);

   }
}
