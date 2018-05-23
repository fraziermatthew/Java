/* Geometry: two rectangles */

import java.util.Scanner;
public class Ex_03_28 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter r1's center x-, y-coordinates, width and height: ");
      double r1x = input.nextDouble(), r1y = input.nextDouble(),
             r1w = input.nextDouble(), r1h = input.nextDouble();
      
      System.out.print("Enter r2's center x-, y-coordinates, width and height: ");
      double r2x = input.nextDouble(), r2y = input.nextDouble(),
             r2w = input.nextDouble(), r2h = input.nextDouble();
      if ( Math.abs(r1x - r1w/2) > Math.abs(r2x - r2w/2) && 
           Math.abs(r1x + r1w/2) > Math.abs(r2x + r2w/2) &&
           Math.abs(r1y - r1h/2) > Math.abs(r2y - r2h/2) && 
           Math.abs(r1y + r1h/2) > Math.abs(r2y + r2h/2) )
         System.out.println("r2 is inside of r1");
//       if ()
//       System.out.println("r2 overlaps r1");
//       if ()
//       System.out.println("r2 does not overlap r1");
      
   }
}
