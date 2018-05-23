/* Algebra: solve quadratic equations */

import java.util.Scanner;
public class Ex_03_01 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a, b, c: ");
      
      double a = input.nextDouble(), 
         	 b = input.nextDouble(), 
         	 c = input.nextDouble(), 
         	 r1, 
             r2, 
             doq = Math.pow(b,2) - (4 * a * c);
      
      r1 = ( (b * -1) + Math.pow( doq, 0.5 ) )/ (2 * a) ;
      r2 = ( (b * -1) - Math.pow( doq, 0.5 ) )/ (2 * a);
      
      if (doq > 0)
         System.out.println("The equation has two roots " + r1 + " and " + r2);
      if (doq  == 0)
         System.out.println("The equation has one root " + r1);
      if (doq < 0)
         System.out.println("The equation has no real roots");  
   }
}
