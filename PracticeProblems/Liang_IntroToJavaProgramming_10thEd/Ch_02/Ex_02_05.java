/* Financial application: calculate tips */

import java.util.Scanner;
public class Ex_02_05 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the subtotal and a grautity rate: ");
      double subtotal = input.nextDouble();
      double gratuity = input.nextDouble();
      gratuity /= 100;
      double total = subtotal * (1 + gratuity);
      System.out.println("The gratuity is $" + (gratuity * subtotal) + " and total is $" + total);
           
   }
}
