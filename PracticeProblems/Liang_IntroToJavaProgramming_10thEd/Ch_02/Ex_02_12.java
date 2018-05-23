/* Physics: finding runway length */

import java.util.Scanner;
public class Ex_02_12 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter speed and acceleration: ");
      double v = input.nextDouble(),
         	 a = input.nextDouble(),
         	 runLen = (v * v) / (2 * a);
      System.out.println("The minimum runway length for this airplane is " + runLen);
             
   }
}
