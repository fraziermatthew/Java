/* Geometry: area of a regular polygon */

import java.util.Scanner;
public class Ex_04_05 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of sides: ");
      int n = input.nextInt();
      
      System.out.print("Enter the side: ");
      double len = input.nextDouble(),
             area = (n * Math.pow(len,2)) / (4 * Math.tan(Math.PI / n));
      System.out.print("The area of the hexagon is " + area);

   }
}
