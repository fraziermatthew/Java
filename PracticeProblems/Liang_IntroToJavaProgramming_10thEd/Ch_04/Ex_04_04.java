/* Geometry: area of a hexagon */

import java.util.Scanner;
public class Ex_04_04 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);      
      System.out.print("Enter the side: ");
      double len = input.nextDouble(),
             area = (6 * Math.pow(len,2)) / (4 * Math.tan(Math.PI / 6));
      System.out.print("The area of the hexagon is " + Math.round(area*100.0)/100.0);

   }
}
