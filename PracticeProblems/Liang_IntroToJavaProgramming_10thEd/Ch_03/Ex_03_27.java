/* Geometry: points in triangle? */

import java.util.Scanner;
public class Ex_03_27 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a point's x- and y-coordinates: ");
      double x = input.nextDouble(), y = input.nextDouble();
      
      // Note triangle is at point (0,0), (0,100), (200,0)
      double distX = (-x * (200 * 100)) / (-y * 200 - x * 100),
		       distY = (-y * (200 * 100)) / (-y * 200 - x * 100);
             
      if (x < distX || y < distY)       
         System.out.println("The point is in the triangle");
      else
         System.out.println("The point is not in the triangle");
   }
}
