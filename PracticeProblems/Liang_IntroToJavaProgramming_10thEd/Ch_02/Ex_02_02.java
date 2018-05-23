/* Compute the volume of a cylinder */

import java.util.Scanner;
public class Ex_02_02 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius and length of a cylinder: ");
		double radiusCyl = input.nextDouble();
		double lengthCyl = input.nextDouble();
		double areaCyl = radiusCyl * radiusCyl * Math.PI;
		double volumeCyl = areaCyl * lengthCyl;
		System.out.println("The area is " + areaCyl  + "\nThe volume is " + volumeCyl);
      
   }
}
