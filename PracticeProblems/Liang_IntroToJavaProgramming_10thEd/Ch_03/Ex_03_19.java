/* Compute the perimeter of a triangle */

import java.util.Scanner;
public class Ex_03_19 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter edge #1 of triangle: ");
      double edge1 = input.nextDouble();
      
      System.out.println("Enter edge #2 of triangle: ");
      double edge2 = input.nextDouble();
      
      System.out.println("Enter edge #3 of triangle: ");
      double edge3 = input.nextDouble();
   
      if ( edge1 + edge2 > edge3 && 
           edge1 + edge3 > edge2 && 
           edge2 + edge3 > edge1) {
         double perimeterTriangle = edge1 + edge2 + edge3;
         System.out.println("The perimeter of the triangle is " + perimeterTriangle);
      }
      else
         System.out.println("invalid input");  
          
   }
}
