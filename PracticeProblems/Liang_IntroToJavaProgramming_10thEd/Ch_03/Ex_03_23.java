/* Geometry: point in a rectangle? */

import java.util.Scanner;
public class Ex_03_23 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a point with two coordinates: ");
      double point1 = input.nextDouble(), point2 = input.nextDouble();
      
      // Note center of rectangle is at point (0,0)
      double distH = Math.pow( Math.pow(point1, 2), 0.5), 
             distV = Math.pow( Math.pow(point2, 2), 0.5);
      
      if (distH <= 10 / 2 && distV <= 5.0 / 2)      
         System.out.println("Point (" + point1 + ", " + point2 + ") is in the rectangle");
      else
         System.out.println("Point (" + point1 + ", " + point2 + ") is not in the rectangle");
   }
}
