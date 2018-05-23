/* Algebra: solve 2 X 2 linear equations */

import java.util.Scanner;
public class Ex_03_03 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a, b, c, d, e, f: ");
      
      double a = input.nextDouble(), 
         	 b = input.nextDouble(), 
         	 c = input.nextDouble(),
         	 d = input.nextDouble(),
         	 e = input.nextDouble(),
         	 f = input.nextDouble(),
         	 x = (e*d - b*f) / (a*d - b*c),
         	 y = (a*f - e*c) / (a*d - b*c);
      
      if ( a*d - b*c == 0)
         System.out.println("The equation has no solution");
      else
         System.out.println("x is " + x + " and y is " + y);
         
   }
}
