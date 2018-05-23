/* Geometry: area of a pentagon */

import java.util.Scanner;
public class Ex_04_01 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the length from the center of the vertex: ");
      double len = input.nextDouble(),
             s = (2 * len) * Math.sin(Math.PI/5),
             area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
      System.out.print("The area of the pentagon is " + Math.round(area*100.0)/100.0);

   }
}
