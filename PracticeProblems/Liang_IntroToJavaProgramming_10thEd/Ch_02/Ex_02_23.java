/* Cost of driving */

import java.util.Scanner;
public class Ex_02_23 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the driving distance: ");
      double driving = input.nextDouble();
      System.out.println("Enter miles per gallon: ");
      double mpg = input.nextDouble();
      System.out.println("Enter price per gallon: ");
      double ppg = input.nextDouble();
      double totalCost = (driving / mpg) * ppg;
      System.out.printf("The cost of driving is $%,.2f%n", totalCost);
                       
   }
}
