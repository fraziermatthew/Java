/* Geometry: area of a triangle */

import java.util.Scanner;
public class Ex_02_19 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter three points for a triangle: ");
      double x1a = input.nextDouble(),
         	 y1a = input.nextDouble(),
         	 x2a = input.nextDouble(),
         	 y2a = input.nextDouble(),
         	 x3a = input.nextDouble(),
         	 y3a = input.nextDouble(),
         	 side1 = Math.pow( (Math.pow(x2a - x1a, 2) + Math.pow(y2a - y1a, 2)), 0.5 ),
         	 side2 = Math.pow( (Math.pow(x3a - x2a, 2) + Math.pow(y3a - y2a, 2)), 0.5 ),
         	 side3 = Math.pow( (Math.pow(x1a - x3a, 2) + Math.pow(y1a - y3a, 2)), 0.5 ),
         	 s = (side1 + side2 + side3) / 2,
         	 areaTri = Math.pow(s * (s-side1) * (s-side2) * (s-side3), 0.5);
      System.out.println("The area of the triangle is " + areaTri);                  
   
   }
}
