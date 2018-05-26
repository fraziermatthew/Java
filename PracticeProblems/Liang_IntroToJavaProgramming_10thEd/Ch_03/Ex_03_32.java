/* Geometry: point position */

import java.util.Scanner;
public class Ex_03_32 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three points for p0, p1, and p2: ");
      double x0 = input.nextDouble(),
             y0 = input.nextDouble(),
             x1 = input.nextDouble(),
             y1 = input.nextDouble(),
             x2 = input.nextDouble(),
             y2 = input.nextDouble(),
             result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
      
      if (result > 0) {
         System.out.print("(" + x2 + ", " + y2 + ") is on the left of the line from (" 
            + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
      }   
      else if (result < 0) {
         System.out.print("(" + x2 + ", " + y2 + ") is on the right of the line from (" 
            + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
      }
      else
         System.out.print("(" + x2 + ", " + y2 + ") is on the line from (" 
            + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
      
   }
}
