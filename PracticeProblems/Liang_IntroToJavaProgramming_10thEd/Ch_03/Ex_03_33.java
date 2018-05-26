/* Financial: compare costs */

import java.util.Scanner;
public class Ex_03_33 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter weight and price for package 1: ");
      double w1 = input.nextDouble(), p1 = input.nextDouble();
      
      System.out.print("Enter weight and price for package 2: ");
      double w2 = input.nextDouble(), p2 = input.nextDouble();
      
      double cost1 = p1 / w1, cost2 = p2 / w2;
      
      if (cost1 < cost2)
         System.out.print( "Package 1 has a better price.");
      else if (cost1 > cost2)
         System.out.println("Package 2 has a better price.");
      else
         System.out.print("Two packages have the same price.");
      
   }
}
