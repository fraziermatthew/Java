/* Geometry: two rectangles */

import java.util.Scanner;
public class Ex_03_28 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a point with two coordinates: ");
      double point1 = input.nextDouble(), point2 = input.nextDouble();
      
      // Note center of circle is at point (0,0)
      double distance = Math.pow( (Math.pow(point1, 2) + Math.pow(point2, 2) ), 0.5);
      
      if (distance <= 10)      
         System.out.println("Point (" + point1 + ", " + point2 + ") is in the circle");
      else
         System.out.println("Point (" + point1 + ", " + point2 + ") is not in the circle");
   }
}
