/* Geometry: area of a hexagon */

import java.util.Scanner;
public class Ex_02_16 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the side: ");
      double side = input.nextDouble(),
         	 hexArea = ( (3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);
      System.out.println("The area of the hexagon is " + hexArea);
                   
   }
}
