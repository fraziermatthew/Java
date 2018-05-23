/* Cost of shipping */

import java.util.Scanner;
public class Ex_03_18 {

   public static void main(String[] args) {
      
      System.out.println("Enter the weight of the package: ");
      Scanner input = new Scanner(System.in);
      double weight = input.nextDouble();
      
      double shipCost = 0;
      if (0 < weight && weight <= 1)
         shipCost = 3.5;
      else if (1 < weight && weight <= 3)
         shipCost = 5.5;
      else if (3 < weight && weight <= 10)
         shipCost = 8.5;
      else if (10 < weight && weight <= 20)
         shipCost = 10.5;
      
      if (weight > 50)
         System.out.println("The package cannot be shipped.");
      else
         System.out.println("The shipping cost is $" + shipCost);
         
   }
}
